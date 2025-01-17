package community.portal.EmailHtml;

import org.springframework.stereotype.Component;

@Component
public class ForgetPasswordTemplate 
{
    public String Run(String otp, String username)
    {
        String html = "<!DOCTYPE html>\r\n" + //
                "<html lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">\r\n"
                + //
                "<head>\r\n" + //
                "    <meta charset=\"utf-8\"> <!-- utf-8 works for most cases -->\r\n" + //
                "    <meta name=\"viewport\" content=\"width=device-width\"> <!-- Forcing initial-scale shouldn't be necessary -->\r\n"
                + //
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"> <!-- Use the latest (edge) version of IE rendering engine -->\r\n"
                + //
                "    <meta name=\"x-apple-disable-message-reformatting\">  <!-- Disable auto-scale in iOS 10 Mail entirely -->\r\n"
                + //
                "    <title></title> <!-- The title tag shows in email notifications, like Android 4.4. -->\r\n" + //
                "\r\n" + //
                "    <link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,700\" rel=\"stylesheet\">\r\n" + //
                "\r\n" + //
                "    <!-- CSS Reset : BEGIN -->\r\n" + //
                "    <style>\r\n" + //
                "\r\n" + //
                "        /* What it does: Remove spaces around the email design added by some email clients. */\r\n" + //
                "        /* Beware: It can remove the padding / margin and add a background color to the compose a reply window. */\r\n"
                + //
                "        html,\r\n" + //
                "body {\r\n" + //
                "    margin: 0 auto !important;\r\n" + //
                "    padding: 0 !important;\r\n" + //
                "    height: 100% !important;\r\n" + //
                "    width: 100% !important;\r\n" + //
                "    background: #f1f1f1;\r\n" + //
                "}\r\n" + //
                "\r\n" + //
                "/* What it does: Stops email clients resizing small text. */\r\n" + //
                "* {\r\n" + //
                "    -ms-text-size-adjust: 100%;\r\n" + //
                "    -webkit-text-size-adjust: 100%;\r\n" + //
                "}\r\n" + //
                "\r\n" + //
                "/* What it does: Centers email on Android 4.4 */\r\n" + //
                "div[style*=\"margin: 16px 0\"] {\r\n" + //
                "    margin: 0 !important;\r\n" + //
                "}\r\n" + //
                "\r\n" + //
                "/* What it does: Stops Outlook from adding extra spacing to tables. */\r\n" + //
                "table,\r\n" + //
                "td {\r\n" + //
                "    mso-table-lspace: 0pt !important;\r\n" + //
                "    mso-table-rspace: 0pt !important;\r\n" + //
                "}\r\n" + //
                "\r\n" + //
                "/* What it does: Fixes webkit padding issue. */\r\n" + //
                "table {\r\n" + //
                "    border-spacing: 0 !important;\r\n" + //
                "    border-collapse: collapse !important;\r\n" + //
                "    table-layout: fixed !important;\r\n" + //
                "    margin: 0 auto !important;\r\n" + //
                "}\r\n" + //
                "\r\n" + //
                "/* What it does: Uses a better rendering method when resizing images in IE. */\r\n" + //
                "img {\r\n" + //
                "    -ms-interpolation-mode:bicubic;\r\n" + //
                "}\r\n" + //
                "\r\n" + //
                "/* What it does: Prevents Windows 10 Mail from underlining links despite inline CSS. Styles for underlined links should be inline. */\r\n"
                + //
                "a {\r\n" + //
                "    text-decoration: none;\r\n" + //
                "}\r\n" + //
                "\r\n" + //
                "/* What it does: A work-around for email clients meddling in triggered links. */\r\n" + //
                "*[x-apple-data-detectors],  /* iOS */\r\n" + //
                ".unstyle-auto-detected-links *,\r\n" + //
                ".aBn {\r\n" + //
                "    border-bottom: 0 !important;\r\n" + //
                "    cursor: default !important;\r\n" + //
                "    color: inherit !important;\r\n" + //
                "    text-decoration: none !important;\r\n" + //
                "    font-size: inherit !important;\r\n" + //
                "    font-family: inherit !important;\r\n" + //
                "    font-weight: inherit !important;\r\n" + //
                "    line-height: inherit !important;\r\n" + //
                "}\r\n" + //
                "\r\n" + //
                "/* What it does: Prevents Gmail from displaying a download button on large, non-linked images. */\r\n"
                + //
                ".a6S {\r\n" + //
                "    display: none !important;\r\n" + //
                "    opacity: 0.01 !important;\r\n" + //
                "}\r\n" + //
                "\r\n" + //
                "/* What it does: Prevents Gmail from changing the text color in conversation threads. */\r\n" + //
                ".im {\r\n" + //
                "    color: inherit !important;\r\n" + //
                "}\r\n" + //
                "\r\n" + //
                "/* If the above doesn't work, add a .g-img class to any image in question. */\r\n" + //
                "img.g-img + div {\r\n" + //
                "    display: none !important;\r\n" + //
                "}\r\n" + //
                "\r\n" + //
                "/* What it does: Removes right gutter in Gmail iOS app: https://github.com/TedGoas/Cerberus/issues/89  */\r\n"
                + //
                "/* Create one of these media queries for each additional viewport size you'd like to fix */\r\n" + //
                "\r\n" + //
                "/* iPhone 4, 4S, 5, 5S, 5C, and 5SE */\r\n" + //
                "@media only screen and (min-device-width: 320px) and (max-device-width: 374px) {\r\n" + //
                "    u ~ div .email-container {\r\n" + //
                "        min-width: 320px !important;\r\n" + //
                "    }\r\n" + //
                "}\r\n" + //
                "/* iPhone 6, 6S, 7, 8, and X */\r\n" + //
                "@media only screen and (min-device-width: 375px) and (max-device-width: 413px) {\r\n" + //
                "    u ~ div .email-container {\r\n" + //
                "        min-width: 375px !important;\r\n" + //
                "    }\r\n" + //
                "}\r\n" + //
                "/* iPhone 6+, 7+, and 8+ */\r\n" + //
                "@media only screen and (min-device-width: 414px) {\r\n" + //
                "    u ~ div .email-container {\r\n" + //
                "        min-width: 414px !important;\r\n" + //
                "    }\r\n" + //
                "}\r\n" + //
                "\r\n" + //
                "    </style>\r\n" + //
                "\r\n" + //
                "    <!-- CSS Reset : END -->\r\n" + //
                "\r\n" + //
                "    <!-- Progressive Enhancements : BEGIN -->\r\n" + //
                "    <style>\r\n" + //
                "\r\n" + //
                "\t    .primary{\r\n" + //
                "\tbackground: #30e3ca;\r\n" + //
                "}\r\n" + //
                ".bg_white{\r\n" + //
                "\tbackground: #ffffff;\r\n" + //
                "}\r\n" + //
                ".bg_light{\r\n" + //
                "\tbackground: #fafafa;\r\n" + //
                "}\r\n" + //
                ".bg_black{\r\n" + //
                "\tbackground: #000000;\r\n" + //
                "}\r\n" + //
                ".bg_dark{\r\n" + //
                "\tbackground: rgba(0,0,0,.8);\r\n" + //
                "}\r\n" + //
                ".email-section{\r\n" + //
                "\tpadding:2.5em;\r\n" + //
                "}\r\n" + //
                "\r\n" + //
                "/*BUTTON*/\r\n" + //
                ".btn{\r\n" + //
                "\tpadding: 10px 15px;\r\n" + //
                "\tdisplay: inline-block;\r\n" + //
                "}\r\n" + //
                ".btn.btn-primary{\r\n" + //
                "\tborder-radius: 5px;\r\n" + //
                "\tbackground: #30e3ca;\r\n" + //
                "\tcolor: #ffffff;\r\n" + //
                "}\r\n" + //
                ".btn.btn-white{\r\n" + //
                "\tborder-radius: 5px;\r\n" + //
                "\tbackground: #ffffff;\r\n" + //
                "\tcolor: #000000;\r\n" + //
                "}\r\n" + //
                ".btn.btn-white-outline{\r\n" + //
                "\tborder-radius: 5px;\r\n" + //
                "\tbackground: transparent;\r\n" + //
                "\tborder: 1px solid #fff;\r\n" + //
                "\tcolor: #fff;\r\n" + //
                "}\r\n" + //
                ".btn.btn-black-outline{\r\n" + //
                "\tborder-radius: 0px;\r\n" + //
                "\tbackground: transparent;\r\n" + //
                "\tborder: 2px solid #000;\r\n" + //
                "\tcolor: #000;\r\n" + //
                "\tfont-weight: 700;\r\n" + //
                "}\r\n" + //
                "\r\n" + //
                "h1,h2,h3,h4,h5,h6{\r\n" + //
                "\tfont-family: 'Lato', sans-serif;\r\n" + //
                "\tcolor: #000000;\r\n" + //
                "\tmargin-top: 0;\r\n" + //
                "\tfont-weight: 400;\r\n" + //
                "}\r\n" + //
                "\r\n" + //
                "body{\r\n" + //
                "\tfont-family: 'Lato', sans-serif;\r\n" + //
                "\tfont-weight: 400;\r\n" + //
                "\tfont-size: 15px;\r\n" + //
                "\tline-height: 1.8;\r\n" + //
                "\tcolor: rgba(0,0,0,.4);\r\n" + //
                "}\r\n" + //
                "\r\n" + //
                "a{\r\n" + //
                "\tcolor: #30e3ca;\r\n" + //
                "}\r\n" + //
                "\r\n" + //
                "table{\r\n" + //
                "}\r\n" + //
                "/*LOGO*/\r\n" + //
                "\r\n" + //
                ".logo h1{\r\n" + //
                "\tmargin: 0;\r\n" + //
                "}\r\n" + //
                ".logo h1 a{\r\n" + //
                "\tcolor: #30e3ca;\r\n" + //
                "\tfont-size: 24px;\r\n" + //
                "\tfont-weight: 700;\r\n" + //
                "\tfont-family: 'Lato', sans-serif;\r\n" + //
                "}\r\n" + //
                "\r\n" + //
                "/*HERO*/\r\n" + //
                ".hero{\r\n" + //
                "\tposition: relative;\r\n" + //
                "\tz-index: 0;\r\n" + //
                "}\r\n" + //
                "\r\n" + //
                ".hero .text{\r\n" + //
                "\tcolor: rgba(0,0,0,.3);\r\n" + //
                "}\r\n" + //
                ".hero .text h2{\r\n" + //
                "\tcolor: #000;\r\n" + //
                "\tfont-size: 40px;\r\n" + //
                "\tmargin-bottom: 0;\r\n" + //
                "\tfont-weight: 400;\r\n" + //
                "\tline-height: 1.4;\r\n" + //
                "}\r\n" + //
                ".hero .text h3{\r\n" + //
                "\tfont-size: 24px;\r\n" + //
                "\tfont-weight: 300;\r\n" + //
                "}\r\n" + //
                ".hero .text h2 span{\r\n" + //
                "\tfont-weight: 600;\r\n" + //
                "\tcolor: #30e3ca;\r\n" + //
                "}\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "/*HEADING SECTION*/\r\n" + //
                ".heading-section{\r\n" + //
                "}\r\n" + //
                ".heading-section h2{\r\n" + //
                "\tcolor: #000000;\r\n" + //
                "\tfont-size: 28px;\r\n" + //
                "\tmargin-top: 0;\r\n" + //
                "\tline-height: 1.4;\r\n" + //
                "\tfont-weight: 400;\r\n" + //
                "}\r\n" + //
                ".heading-section .subheading{\r\n" + //
                "\tmargin-bottom: 20px !important;\r\n" + //
                "\tdisplay: inline-block;\r\n" + //
                "\tfont-size: 13px;\r\n" + //
                "\ttext-transform: uppercase;\r\n" + //
                "\tletter-spacing: 2px;\r\n" + //
                "\tcolor: rgba(0,0,0,.4);\r\n" + //
                "\tposition: relative;\r\n" + //
                "}\r\n" + //
                ".heading-section .subheading::after{\r\n" + //
                "\tposition: absolute;\r\n" + //
                "\tleft: 0;\r\n" + //
                "\tright: 0;\r\n" + //
                "\tbottom: -10px;\r\n" + //
                "\tcontent: '';\r\n" + //
                "\twidth: 100%;\r\n" + //
                "\theight: 2px;\r\n" + //
                "\tbackground: #30e3ca;\r\n" + //
                "\tmargin: 0 auto;\r\n" + //
                "}\r\n" + //
                "\r\n" + //
                ".heading-section-white{\r\n" + //
                "\tcolor: rgba(255,255,255,.8);\r\n" + //
                "}\r\n" + //
                ".heading-section-white h2{\r\n" + //
                "\tfont-family: \r\n" + //
                "\tline-height: 1;\r\n" + //
                "\tpadding-bottom: 0;\r\n" + //
                "}\r\n" + //
                ".heading-section-white h2{\r\n" + //
                "\tcolor: #ffffff;\r\n" + //
                "}\r\n" + //
                ".heading-section-white .subheading{\r\n" + //
                "\tmargin-bottom: 0;\r\n" + //
                "\tdisplay: inline-block;\r\n" + //
                "\tfont-size: 13px;\r\n" + //
                "\ttext-transform: uppercase;\r\n" + //
                "\tletter-spacing: 2px;\r\n" + //
                "\tcolor: rgba(255,255,255,.4);\r\n" + //
                "}\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "ul.social{\r\n" + //
                "\tpadding: 0;\r\n" + //
                "}\r\n" + //
                "ul.social li{\r\n" + //
                "\tdisplay: inline-block;\r\n" + //
                "\tmargin-right: 10px;\r\n" + //
                "}\r\n" + //
                "\r\n" + //
                "/*FOOTER*/\r\n" + //
                "\r\n" + //
                ".footer{\r\n" + //
                "\tborder-top: 1px solid rgba(0,0,0,.05);\r\n" + //
                "\tcolor: rgba(0,0,0,.5);\r\n" + //
                "}\r\n" + //
                ".footer .heading{\r\n" + //
                "\tcolor: #000;\r\n" + //
                "\tfont-size: 20px;\r\n" + //
                "}\r\n" + //
                ".footer ul{\r\n" + //
                "\tmargin: 0;\r\n" + //
                "\tpadding: 0;\r\n" + //
                "}\r\n" + //
                ".footer ul li{\r\n" + //
                "\tlist-style: none;\r\n" + //
                "\tmargin-bottom: 10px;\r\n" + //
                "}\r\n" + //
                ".footer ul li a{\r\n" + //
                "\tcolor: rgba(0,0,0,1);\r\n" + //
                "}\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "@media screen and (max-width: 500px) {\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "}\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "    </style>\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "</head>\r\n" + //
                "\r\n" + //
                "<body width=\"100%\" style=\"margin: 0; padding: 0 !important; mso-line-height-rule: exactly; background-color: #f1f1f1;\">\r\n"
                + //
                "\t<center style=\"width: 100%; background-color: #f1f1f1;\">\r\n" + //
                "    <div style=\"display: none; font-size: 1px;max-height: 0px; max-width: 0px; opacity: 0; overflow: hidden; mso-hide: all; font-family: sans-serif;\">\r\n"
                + //
                "      &zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;&zwnj;&nbsp;\r\n"
                + //
                "    </div>\r\n" + //
                "    <div style=\"max-width: 600px; margin: 0 auto;\" class=\"email-container\">\r\n" + //
                "    \t<!-- BEGIN BODY -->\r\n" + //
                "      <table align=\"center\" role=\"presentation\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\" style=\"margin: auto;\">\r\n"
                + //
                "      \t<tr>\r\n" + //
                "          <td valign=\"top\" class=\"bg_white\" style=\"padding: 1em 2.5em 0 2.5em;\">\r\n" + //
                "          \t<table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n"
                + //
                "          \t\t<tr>\r\n" + //
                "          \t\t\t<td class=\"logo\" style=\"text-align: center;\">\r\n" + //
                "\t\t\t            <h1>Forget Password\r\n" + //
                "\t\t\t          </td>\r\n" + //
                "          \t\t</tr>\r\n" + //
                "          \t</table>\r\n" + //
                "          </td>\r\n" + //
                "\t\t\t\t<tr>\r\n" + //
                "          <td valign=\"middle\" class=\"hero bg_white\" style=\"padding: 2em 0 4em 0;\">\r\n" + //
                "            <table>\r\n" + //
                "            \t<tr>\r\n" + //
                "            \t\t<td>\r\n" + //
                "            \t\t\t<div class=\"text\" style=\"padding: 0 2.5em; text-align: center;\">\r\n" + //
                "            \t\t\t\t<h5>Hello " + username + ", your one time password is <b>" + otp + "</b></h5>\r\n" + //
                "            \t\t\t\t<h3>Please update your password after you login.\r\n" + //
                "            \t\t\t</div>\r\n" + //
                "            \t\t</td>\r\n" + //
                "            \t</tr>\r\n" + //
                "            </table>\r\n" + //
                "          </td>\r\n" + //
                "\t      </tr><!-- end tr -->\r\n" + //
                "      <!-- 1 Column Text + Button : END -->\r\n" + //
                "      </table>\r\n" + //

                "\r\n" + //
                "    </div>\r\n" + //
                "  </center>\r\n" + //
                "</body>\r\n" + //
                "</html>";

                return html;
    }
}
