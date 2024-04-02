package community.portal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import community.portal.Service.updateProfileTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.cookie;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.flash;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.handler;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.servlet.http.Cookie;


@SpringBootTest
@AutoConfigureMockMvc
class PortalApplicationTests 
{
	@Autowired
	private MockMvc mockMvc;

	@Autowired
	updateProfileTest uProfileTest;

	@Test
	void RegistrationAndEmailConfirmationTest() throws Exception 
	{
		mockMvc.perform(MockMvcRequestBuilders.post("/register")
		.param("username", "ben_test")
		.param("password", "passwordtest")
		.param("email", "testben@mail.com")
		.param("firstname", "ben")
		.param("lastname", "test")
		)
		.andExpect(status().is(302))
		.andExpect(redirectedUrl("/confirmation"));
	}	


	@Test
	void RegistrationValidation() throws Exception 
	{
		mockMvc.perform(MockMvcRequestBuilders.post("/register")
		.param("username", "ben")
		.param("password", "passwordtest")
		.param("email", "testben@mail.com")
		.param("firstname", "ben")
		.param("lastname", "test")
		)
		.andExpect(status().is(302))
		.andExpect(redirectedUrl("/register"))
		.andExpect(flash().attribute("result", "The Username existed"));
	}
	
	
	@Test
	void LoginAuthentication() throws Exception
	{
		mockMvc.perform(MockMvcRequestBuilders.post("/login")
		.param("username", "qwe")
		.param("password", "qwe"))
		.andExpect(status().is(302))
		.andExpect(redirectedUrl("/home"));
	}

	@Test
	void ProfileUpdateTest() throws Exception
	{
		assertEquals(uProfileTest.Run("passwordTest"), true);
	}

}
