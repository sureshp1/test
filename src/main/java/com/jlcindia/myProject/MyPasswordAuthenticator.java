package com.jlcindia.myProject;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MyPasswordAuthenticator extends Authenticator {

protected PasswordAuthentication getPasswordAuthentication(){
	
	return new PasswordAuthentication(MailService.EMAIL, MailService.PSWD);
}

}
