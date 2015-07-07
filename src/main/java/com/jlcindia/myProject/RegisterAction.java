package com.jlcindia.myProject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
public class RegisterAction extends JLCBaseAction{
Logger log=Logger.getLogger(RegisterAction.class);
public String service(HttpServletRequest req,HttpServletResponse res) throws Exception{
log.info("RegisterAction-service()");
String result="register.jsp";
String fn=req.getParameter("fname");
String em=req.getParameter("email");
String[] em1={em};
String ph=req.getParameter("phone");
String un=req.getParameter("username");
String pw=req.getParameter("password");
req.setAttribute("FNM",fn);
req.setAttribute("EML",em);
req.setAttribute("PHN",ph);
req.setAttribute("UNM",un);
boolean error=false;
long ph1=0;
if(JLCValidator.validateRequired(un)){
req.setAttribute("UNMERR","Username is required");
error=true;
}
else if(JLCValidator.validateMaxLength(un,15)){
req.setAttribute("UNMERR","Username must be 15 character long");
error=true;
}
else if(JLCValidator.validateMinLength(un,8)){
req.setAttribute("UNMERR","Username must be minimum 8 character long");
error=true;
}
if(JLCValidator.validateRequired(pw)){
req.setAttribute("PWDERR","Password is required");
error=true;
}
else if(JLCValidator.validateMaxLength(pw,15)){
req.setAttribute("PWDERR","Password must be 15 character long");
error=true;
}
else if(JLCValidator.validateMinLength(pw,8)){
req.setAttribute("PWDERR","Password must be minimum 8 character long");
error=true;
}
if(JLCValidator.validateRequired(fn)){
req.setAttribute("FNMERR","Fullname is required");
error=true;
}
else if(JLCValidator.validateMaxLength(fn,35)){
req.setAttribute("FNMERR","Fullname must be 35 character long");
error=true;
}
else if(JLCValidator.validateMinLength(fn,2)){
req.setAttribute("FNMERR","Fullname must be minimum 2 character long");
error=true;
}
if(JLCValidator.validateRequired(ph)){
req.setAttribute("PHNERR","Phone is required");
error=true;
}
else{
try{
ph1=Long.parseLong(ph);
if(JLCValidator.validateLength(ph,10)){
req.setAttribute("PHNERR","Phone must be 10 digits");
error=true;
}
}catch(Exception e){
req.setAttribute("PHNERR","Phone must be digits");
log.error("Phone is not number\n",e);
error=true;
}
}
if(JLCValidator.validateRequired(em)){
req.setAttribute("EMLERR", "Email is required");
error=true;
}
else if(JLCValidator.validateEmail(em)){
req.setAttribute("EMLERR", "Provide valid Email");
error=true;
}
else if(JLCValidator.validateMaxLength(em,50)){
req.setAttribute("EMLERR","Email");
error=true;
}
else if(JLCValidator.validateMinLength(fn,2)){
req.setAttribute("EMLERR","Email must be minimum 2 character long");
error=true;
}
if(error){return result;}
UserTo uto=new UserTo(0,fn,em,ph1,un,pw);
int x=userService.registerUser(uto);
if(x==1)
{
HttpSession session=req.getSession();
session.setAttribute("UN",un);
result="home.jsp";
String sub="Registration Success";
String body="<h1>Hi"+fn+"Your registration has been completed Successfully</h1>";
MailService.sendMail(em1,sub,body);

}
else{
req.setAttribute("MSG","Registration failed-Try again");
}
return result;
}
}