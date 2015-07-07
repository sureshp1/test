package com.jlcindia.myProject;
import java.io.*;
import java.util.*;

import javax.activation.*;
import javax.mail.*;
import javax.mail.Message.RecipientType;
import javax.mail.internet.*;

import org.omg.CORBA.FixedHolder;

public class MailService {
	
	protected static String EMAIL="sudhasnsu.gec@gmail.com";
	protected static String PSWD="saswat10!@";
	public static void sendMail(String[] recs,String sub,String textmsg){
		
		try{
			
			Properties p=new Properties();
			p.put("mail.smtp.host","smtp.gmail.com");
			p.put("mail.smtp.SocketFactory.port","465");
			p.put("mail.smtp.SocketFactory.class","javax.net.ssl.SSLSocketFactory");
			p.put("mail.smtp.auth","true");
			p.put("mail.smtp.port","465");
			Authenticator auth=new MyPasswordAuthenticator();
			Session sess=Session.getInstance(p, auth);
			Message msg=new MimeMessage(sess);
			Address[] adds=new Address[recs.length];
			for(int i=0;i<recs.length;i++){
				
				adds[i]=new InternetAddress(recs[i]);
				
			}
			msg.setRecipients(RecipientType.TO,adds);
			msg.setFrom(new InternetAddress(EMAIL, "Hello JLC"));
			msg.setSentDate(new Date());
			msg.setSubject(sub);
			Multipart multipart=new MimeMultipart();
			BodyPart part1=new MimeBodyPart();
			part1.setContent(textmsg,"text/html");
			multipart.addBodyPart(part1);
		/*	if(files!=null&& files.size()>0)
			{
				
				for(File file:files){
					
					BodyPart part=new MimeBodyPart();
					DataSource dsource=new FileDataSource(file);
					DataHandler handler=new DataHandler(dsource);
					part.setDataHandler(handler);
					part.setFileName(file.getName());
					multipart.addBodyPart(part);
					System.out.println(file.getName()+" attached");
			
					
				}
			}*/
			msg.setContent(multipart);
			Transport.send(msg);
		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
			
		}
		
		
	} 



