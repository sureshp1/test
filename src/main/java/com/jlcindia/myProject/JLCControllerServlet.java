package com.jlcindia.myProject;
import java.io.IOException;
import org.apache.log4j.*;
//import java.util.logging.Logger;

import javax.servlet.*;
import javax.servlet.http.*;
public class JLCControllerServlet extends HttpServlet{
Logger log=Logger.getLogger(JLCControllerServlet.class);
LoginAction loginaction=null;
RegisterAction regAction=null;
ForgotPWAction fpwAction=null;
JLCBaseAction action=null;

public void init(ServletConfig sc){
log.info("Initialising JLCControllerServlet");
loginaction=new LoginAction();
regAction= new RegisterAction();
fpwAction=new ForgotPWAction();
}

public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
log.info("JLCControllerServlet  processing the request");
String URI=req.getRequestURI();
log.info("Requesting the URI :"+URI);
if(URI.endsWith("login.jlc")){
action=loginaction;
}
else if(URI.endsWith("register.jlc")){
action=regAction;
}
else if(URI.endsWith("forgotpw.jlc")){
action=fpwAction;
}
String result="";
try{
result=action.service(req,res);

}catch(Exception e){

log.error(e);

}

log.info("Resultant Resource: "+result);
RequestDispatcher rd=req.getRequestDispatcher(result);
rd.forward(req,res);
log.info("JLCControllerServlet  PROCESSING COMPLETED");
}
}

