/**
   A reservation holds all of user information including all booking details 
 */
import java.util.Date;
import java.text.SimpleDateFormat;
//import java.text.ParseException;

public class Reservation {
	public int reservation_id;
	public int user_id;
	public int hotel_id;
	
	public int checkin_day;
	public int checkout_day;
	public int stay_duration; // numOfStay
	public int guest_count;
	
	private boolean has_payed;
	
	public String room_type;
	public String currDate;
	
	/**
	 * Class constructor to display Reservation informatation
	 */
	public Reservation() {};

	public Reservation(int reservation_id, int user_id, int hotel_id, int stay_duration, 
			int guest_count, boolean has_payed , String currDate) {
		this.reservation_id = reservation_id;
		this.user_id = user_id;
		this.hotel_id = hotel_id;
		this.stay_duration = stay_duration;
		this.guest_count = guest_count;
		this.has_payed = has_payed;
		this.currDate = currDate;
		
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
	
}




