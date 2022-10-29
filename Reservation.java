/**
   A reservation holds all of user information including all booking details 
 */
import java.util.Date;
import java.text.SimpleDateFormat;
//import java.text.ParseException;

public class Reservation {
	public int bookingId;
	public int userId;
	public int hotelId;
	public int durationOfStay;
	public int guestCount;	
	public String currDate;
	private boolean paymentStatus = false;
	//private Room myRoom = new Room(); // implemented later. 
	
	/**
	 * Class constructor to display Reservation informatation
	 */
	public Reservation() {};

	public Reservation(int bookingId, int userId, int hotelId, int durationOfStay, 
			int guestCount, String currDate, boolean paymentStatus) {
		this.bookingId = bookingId;
		this.userId = userId;
		this.hotelId = hotelId;
		this.durationOfStay = durationOfStay;
		this.guestCount = guestCount;
		this.currDate = currDate;
		this.paymentStatus = paymentStatus;
	}
	
	public static String searchLocation(String destlocation) {
		// searches for location
		// location may or not be avilable based on space and availability.  
		return "";
	}
	
	public static int priceRange(int min, int max){
		// filters searches based on price range
		return -1;
	}
	
	public static String roomType(String room) {
		// returns roomType option 
		return "";
	}
	
	/**
	  returns current day of viewing  
	 * */
	public static String currentDate() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yy");
		String str = formatter.format(date);
		return str;
	}
	
	// this method might be redundant, but goal is to save date of when reservation is made. 
	// that way this date can be sent to user via email to keep in record. 
	public static String reservationDateMade() {
		String reservationMade = "";
		reservationMade = (currentDate());
		return reservationMade;
	}	
}




