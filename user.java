public class User {

public int userId;
public String first_name;
public String last_name;
public int dateOfBirth;
public String email;
public String street;
public String city;
public int zip_code;
public int phone_num;

	

public User(int userName, int dateOfBirth, String email){ //constructor

	this.userName = userName;
	this.dateOfBirth = dateOfBirth;
	this. email = email;
	}

public static void makeReservation(Hotel hotelName){ //making reservation method
	Reservation myReservation = new Reservation(....);
	System.out.print("You made a reservation");
	}

public static void makeReservation(Hotel hotelName){ //making reservation method
	Reservation myReservation = new Reservation(....);
	System.out.print("You made a reservation");
	}

public static boolean searchForHotel(Hotel hotelName){
	//if found, return true
	//else false
	
	}
public static boolean searchForRoom(string roomType){
	//if found, return true
	//else false

}
}
