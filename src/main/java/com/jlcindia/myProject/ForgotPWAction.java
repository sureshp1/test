package com.jlcindia.myProject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

public class ForgotPWAction extends JLCBaseAction{
Logger log=Logger.getLogger(ForgotPWAction.class);
public String service(HttpServletRequest req,HttpServletResponse res) throws Exception{
String result="forgotpw.jsp";
log.info("ForgotPWAction-service()");
String em=req.getParameter("email");
String em1[]={em};
log.info("Email :"+em);
req.setAttribute("EML",em);
if(JLCValidator.validateEmail(em)){
req.setAttribute("MSG","Email is required");
return result;
}
else if(JLCValidator.validateEmail(em)){
req.setAttribute("MSG","Provide Valid Email");
return result;
}
String pw=userService.getPasswordByEmail(em);
if(pw!=null){
result="pwstatus.jsp";
String sub="Your Password is here !";
String body="<h1>Hi...Your Password is "+pw+"<h1>";
MailService.sendMail(em1,sub,body);
}else
{
req.setAttribute("MSG","Email is not registered-Try Again");
}
log.info("Result "+result);
return result;
}
}

