package mailing;

import java.util.Properties;    
import javax.mail.*;    
import javax.mail.internet.*;    

public class ReportMail{    
 public ReportMail() {    
	 String host="cqcehap001.qcenv.idemia.local";  
	  final String user="shelepy";  
	  final String password="123456";  
	    
	  String to="shelepy@eresidency.gov.eg";  
	  
	   //Get the session object  
	   Properties props = new Properties();  
	   props.put("mail.smtp.host",host);  
	   props.put("mail.smtp.auth", "true");  
	     
	   Session session = Session.getDefaultInstance(props,  
	    new javax.mail.Authenticator() {  
	      protected PasswordAuthentication getPasswordAuthentication() {  
	    return new PasswordAuthentication(user,password);  
	      }  
	    });  
	  
	   //Compose the message  
	    try {  
	     MimeMessage message = new MimeMessage(session);  
	     message.setFrom(new InternetAddress(user));  
	     message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
	     message.setSubject("Test Report");  
	     message.setText("This is a test report for running test cases of the system");  
	       
	    //send the message  
	     Transport.send(message);  
	  
	     System.out.println("message sent successfully...");  
	   
	     } catch (MessagingException e) {e.printStackTrace();}  
	 
 }    
}