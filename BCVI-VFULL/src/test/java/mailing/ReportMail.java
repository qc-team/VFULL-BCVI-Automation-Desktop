package mailing;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;    
import javax.mail.internet.*;    

public class ReportMail{    
 public ReportMail() {    
	 String host="cqcehap001.qcenv.idemia.local"; 
	 String smtpPort="9191";
	  final String user="shelepy";  
	  final String password="123456";  
	    
	  String to="shelepy@eresidency.gov.eg";  
	  
	   //Get the session object  
	   Properties props = new Properties();  
	   props.put("mail.smtp.host",host); 
	   props.put("mail.smtp.port", smtpPort);
	   props.put("mail.smtp.auth", "true"); 
	   props.put("mail.smtp.starttls.enable", true);
	     
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
	      
	   //3) create MimeBodyPart object and set your message text     
	     BodyPart messageBodyPart1 = new MimeBodyPart();  
	     messageBodyPart1.setText("This is message body");  
	       
	     //4) create new MimeBodyPart object and set DataHandler object to this object      
	     MimeBodyPart messageBodyPart2 = new MimeBodyPart();  
	   
	     String filename = "Evisa/public/testReport.html";  
	     DataSource source = new FileDataSource(filename);  
	     messageBodyPart2.setDataHandler(new DataHandler(source));  
	     messageBodyPart2.setFileName(filename);  
	      
	      
	     //5) create Multipart object and add MimeBodyPart objects to this object      
	     Multipart multipart = new MimeMultipart();  
	     multipart.addBodyPart(messageBodyPart1);  
	     multipart.addBodyPart(messageBodyPart2);  
	   
	     //6) set the multiplart object to the message object  
	     message.setContent(multipart );  

	    //7) send the message  
	     Transport.send(message);  
	  
	     System.out.println("message sent successfully...");  
	   
	     } catch (MessagingException e) {e.printStackTrace();}  
	 
 }    
}