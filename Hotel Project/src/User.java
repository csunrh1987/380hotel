public class User {

public int userId;
private String first_name;
public String last_name;
public Date dateOfBirth; //changed this to Date type
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

/*making reservation method - moved these to Hotel class. Discuss?
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

public void setLastName(String last_name){
	this.first_name = last_name;
	}
public void setEmail(String email){
	this.email = email;
	}
public void setAddress(String street, String city, int zip_code){
	this.street = street;
	this.city = city;
	this.zip_code = zip_cide;
	}
public void setPhoneNum(int phone_num){
	this.phone_num = phone_num;
	}

	
//getters
public String getFirstName(){
	return first_name;
	}
public String getLastName(){
	return last_name;
	}
public Date getDOB(){
	return dateOfBirth;
	}
public String getEmail(){
	return email;
	}
public String getAddress(){
	return street+" " + city + " " + zipcode;
	}

public 	int getPhoneNumber(){
	return phone_num;
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
