package mailer;

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

	// Run the mail example
	public static void main(String[] args) {
		// Send email
		sendEmail("javaDrinkers380@gmail.com");
	}

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
			message.setText("----------------------------------------------------------------------------------------\n"
					+ "Java Casino, Resort and Spa\n\n" + "Check in             Check out\n"
					+ "Dec 17–19, 2022        Dec 19, 2022\n\n" + "Duration of stay\n" + "2 nights\n\n" + "Address\n"
					+ "71324 Espresso Drive, Caramel, CA 91234, USA\n\n" + "Phone number\n" + "+1 111-222-3333\n\n"
					+ "Confirmation number\n"
					+ "QYATP\n----------------------------------------------------------------------------------------");

			System.out.print("Sending message...");
			// Send the message
			Transport.send(message);

			System.out.println("done!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
}
