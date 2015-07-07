package com.jlcindia.myProject;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public abstract class JLCBaseAction{
static Logger log=Logger.getLogger("JLCBaseAction.class");
static UserService userService=null;
static{
//userService=new userService();
log.info("JLCBaseAction:userService created");

}
public abstract String service(HttpServletRequest req,HttpServletResponse res) throws Exception;

}

