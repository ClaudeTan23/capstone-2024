package community.portal.Service;

import org.springframework.stereotype.Service;

@Service
public class updateProfileTest 
{
    public boolean Run(String password)
    {
        return !password.equals(null);
    }    
}
