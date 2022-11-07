public class User {

public int userId;
private String first_name;
public String last_name;
public int dateOfBirth;
public String email;
public String street;
public String city;
public int zip_code;
public int phone_num;


public User(){
	this.userId = -1;
	this.first_name = "nobody";
	this.dateOfBirth = 1900;
	this.email = "noreply@email.com";
	}
	
public User(String first_name, String last_name, int dateOfBirth, String email){ //constructor
	this.userId = generateId();
	this.first_name = first_name;
	this.last_name = last_name;
	this.dateOfBirth = dateOfBirth;
	this. email = email;
	}

/*making reservation method
public static void makeReservation(Hotel hotelName){ 
	Reservation myReservation = new Reservation(...);
	System.out.print("You made a reservation");
	}*/

/*//delete reservation method
public static void deleteReservation(Reservation givenReservation){
	givenReservation = new Reservation(); //you set the given Reservation values to default
	System.out.print("You deleted a reservation");
	}
*/

public void setFirstName(String first_name){
	this.first_name = first_name;
	}
public String getFirst(){
	return first_name;
	}
//generating user
private int generateId(){
		int id = (int)(Math.random() * 100000000) + 1 ;
		return id;
	}

/*display rooms method
public static void displaysRooms(){ //worry about this later
	
	System.out.print("Hotel" + hotelName + " has " Hotel.numRooms + "...);
	
	//if found, return true
        //else false
	}
*/	
	
/*display Hotels method	
public static boolean displayHotels(Hotel hotelName){ //under consideration, add more at a later time
	//if found, return true
	//else false
	//depends on number of hotels
	}*/
}
