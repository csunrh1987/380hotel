package mail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Sends confirmation email to Customer upon payment completion. Email includes all booking information. 
 * */

public class JavaMailSender {
	/**
	 * Send the email via SMTP using TLS and SSL
	 */
	private static void sendEmail(String email) {
		// Create all the needed properties
		Properties connectionProperties = new Properties();
		// SMTP host
		connectionProperties.put("mail.smtp.host", "outlook.office365.com");

		// Is authentication enabled
		connectionProperties.put("mail.smtp.auth", "true");
		// Is TLS enabled
		connectionProperties.put("mail.smtp.starttls.enable", "true");
		// SSL Port
		connectionProperties.put("mail.smtp.socketFactory.port", "587");
		// SSL Socket Factory class
		connectionProperties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		// SMTP port, the same as SSL port :)
		connectionProperties.put("mail.smtp.port", "587");

		System.out.print("Creating the session...");

		// Create the session
		Session session = Session.getDefaultInstance(connectionProperties, new javax.mail.Authenticator() { // Authenticate sender email
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("javaDrinkers380@outlook.com", "JavaCoffee123");
			}
		});

		System.out.println("done!");

		// Create and send the message
		try {
			// Create the message
			Message message = new MimeMessage(session);
			// Set sender
			message.setFrom(new InternetAddress("javaDrinkers380@outlook.com"));
			// Set the recipients
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
			// Set message subject
			message.setSubject("Java Casino Resort & Spa: Your Reservation Confirmation!");
			
			// tempmessage for testing
			
			// Set message text
			message.setText("----------------------------------------------------------------------\n"
					+ hotel_name +"\n\n" 
					
					+ userName +", \n"
					+ "Check in             Check out\n"
					+ JavaMailSender.ConvertDate(checkin_day) +"         " + JavaMailSender.ConvertDate(checkout_day)+ "\n\n" 
					+ "Duration of stay\n" 
					+ JavaMailSender.numOfStay(checkin_day, checkout_day) +" nights\n\n" 
					
					+ "Address\n"
					+ "71324 Espresso Drive, Caramel, CA 91234, USA\n\n" 
					
					+ "Phone number\n" 
					+ "+1 111-222-3333\n\n"
					
					+ "Confirmation number\n"
					+ "QYATP\n----------------------------------------------------------------------");

			System.out.print("Sending message...");
			// Send the message
			Transport.send(message);

			System.out.println("done!");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void sendEmailDeleteConfirmation(String userName, String email, String hotel_name, String checkin_day, String checkout_day) {
			Properties connectionProperties = new Properties();
			// SMTP host
			connectionProperties.put("mail.smtp.host", "outlook.office365.com");

			// Is authentication enabled
			connectionProperties.put("mail.smtp.auth", "true");
			// Is TLS enabled
			connectionProperties.put("mail.smtp.starttls.enable", "true");
			// SSL Port
			connectionProperties.put("mail.smtp.socketFactory.port", "587");
			// SSL Socket Factory class
			connectionProperties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			// SMTP port, the same as SSL port :)
			connectionProperties.put("mail.smtp.port", "587");

			System.out.print("Creating the session...");

			// Create the session
			Session session = Session.getDefaultInstance(connectionProperties, new javax.mail.Authenticator() { // Define
																												// the																							// authenticator
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("javaDrinkers380@outlook.com", "JavaCoffee123");
				}
			});

			System.out.println("done!");

			// Create and send the message
			try {
				//Reservation myRes = new Reservation();
				// Create the message
				Message message = new MimeMessage(session);
				// Set sender
				message.setFrom(new InternetAddress("javaDrinkers380@outlook.com"));
				// Set the recipients
				message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
				// Set message subject
				message.setSubject(hotel_name + " Your Reservation has been successfully cancelled. ");
				// Set message text
				message.setText("----------------------------------------------------------------------\n"
						+ "Details below: \n "
						+ hotel_name +"\n\n" 
						
						+ userName +", \n"
						+ "Check in             Check out\n"
						+ JavaMailSender.ConvertDate(checkin_day) +"         " + JavaMailSender.ConvertDate(checkout_day)+ "\n\n" 
						+ "Duration of stay\n" 
						+ JavaMailSender.numOfStay(checkin_day, checkout_day) +" nights\n\n" 
						
						+ "Address\n"
						+ "71324 Espresso Drive, Caramel, CA 91234, USA\n\n" 
						
						+ "Phone number\n" 
						+ "+1 111-222-3333\n\n"
						
						+ "Confirmation number\n"
						+ "QYATP\n----------------------------------------------------------------------"
						+ "\nOrder cancelled complete. \n");

				System.out.print("Sending message...");
				// Send the message
				Transport.send(message);

				System.out.println("done!");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	/**
	  * returns the number of nights based on two different dates.  
	  * */
		public static long numOfStay(CharSequence checkInDate, CharSequence checkOutDate) {
			long daysDiff = 0;
			try {
				LocalDate dateBefore = LocalDate.parse(checkInDate);

				LocalDate dateAfter = LocalDate.parse(checkOutDate);
				
				 daysDiff = ChronoUnit.DAYS.between(dateBefore, dateAfter);
			 
				// System.out.println("Duration of stay: " + daysDiff);
						
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			return daysDiff;
			
		}
		
	/**
	  * returns converted date format.  
	  * */
		public static Date StringToDate(String dob) throws ParseException {
			// Instantiating the SimpleDateFormat class
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			// Parsing the given String to Date object
			Date date = formatter.parse(dob);
			// aSystem.out.println("Date object value: "+ date);
			return date;

		}

		public static String ConvertDate(String input) throws ParseException {

			// Converting String to Date
			Date date = StringToDate(input);

			//System.out.println(new SimpleDateFormat("MM-dd-yyyy").format(date));

			String newDate = new SimpleDateFormat("MM-dd-yyyy").format(date);

			return newDate;
		}

}
