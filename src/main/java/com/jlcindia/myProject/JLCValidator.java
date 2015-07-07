package com.jlcindia.myProject;
import org.apache.log4j.Logger;

public class JLCValidator{
static Logger log=Logger.getLogger(JLCValidator.class);
public static boolean validateRequired(String val){
log.info("ValidateRequirde\t:"+val);
if(val==null ||val.trim().length()==0){return true;}
return false;
}
public static boolean validateMinLength(String val,int len)
{
log.info("ValidateMinLength\t:"+val+"\t"+len);
if(val.trim().length()<len){return true;}
return false;
}
public static boolean validateMaxLength(String val,int len)
{
log.info("ValidateMaxLength\t:"+val+"\t"+len);
if(val.trim().length()>len){return true;}
return false;
}
public static boolean validateLength(String val,int len)
{
log.info("ValidateMinLength\t:"+val+"\t"+len);
if(val.trim().length()!=len){return true;}
return false;
}
public static boolean validateEmail(String val){
final String EMAIL_PATTERN="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.A-Za-z){2,})$";
if(!val.matches(EMAIL_PATTERN)){return true;}
return false;
}
}

