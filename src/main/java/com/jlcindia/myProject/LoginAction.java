package com.jlcindia.myProject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;



public class LoginAction extends JLCBaseAction{

Logger log=Logger.getLogger(LoginAction.class);
public String service(HttpServletRequest req,HttpServletResponse res) throws Exception{

log.info("Login Action Service");

String un=req.getParameter("username");
String pw=req.getParameter("password");
String result="index.jsp";

log.info("un :"+un+"/t"+un.length());
log.info("pw :"+pw);
boolean error=false;
if(JLCValidator.validateRequired(un)){
req.setAttribute("UNMERR","Username is required");
error=true;
}
if(JLCValidator.validateRequired(pw)){
req.setAttribute("PWDERR","Password is required");
error=true;
}

if(error){
req.setAttribute("UNM",un);
return result;
}
int x=userService.verifyUser(un,pw);

HttpSession session=req.getSession();
if(x==1){

session.setAttribute("UN",un);
result="home.jsp";
}
else{

req.setAttribute("MSG","Invalis Username or Password");
}

return result;
}
}
