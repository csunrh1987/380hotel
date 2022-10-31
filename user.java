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


public User(){
	this.userId = -1;
	this.first_name = "nobody"
	this.dateOfBirth = 01011900;
	this.email = "noreply@email.com"
	}
	
public User(int userId, String first_name, String last_name, int dateOfBirth, String email.... ){ //constructor
	this.userName = userName;
	this.dateOfBirth = dateOfBirth;
	this. email = email;
	...
	}

public static void makeReservation(Hotel hotelName){ //making reservation method
	Reservation myReservation = new Reservation(...);
	System.out.print("You made a reservation");
	}

public static void deleteReservation(Reservation givenReservation){ //delete reservation method
	givenReservation = new Reservation(); //you set the given Reservation values to default
	System.out.print("You deleted a reservation");
	}
public static void setFirstName(String first_name){
	this.first_name = first_name;
	}
public static void getFirst(){
	return first_name;
	}
...

public static void displaysRooms(){ //worry about this later
	
	System.out.print("Hotel" + hotelName + " has " Hotel.numRooms + "...);
	
	//if found, return true
        //else false
	}	
	
public static boolean displayHotels(Hotel hotelName){ //under consideration, add more at a later time
	//if found, return true
	//else false
	//depends on number of hotels
	}
}
