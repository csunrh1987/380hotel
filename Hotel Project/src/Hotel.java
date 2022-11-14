public class Hotel
{
public String name;
public String location;
public String parking;
public int parkingPrice;
public int numFloors;
private Reservation[] reservation = new Reservation[50]; //assuming 50 reservations max
/* to do
public Facilities hotelFacilities
*/

 public Hotel(){
  this.name = NULL;
  this.location = NULL;
  this.parking = NULL;
  this.parkingPrice = -1;
  this.numFloors = -1;

}

  
//missing Facilities paramater
public Hotel(String name, String location, String parking, int parkingPrice, int numFloors){
  this.name = name;
  this.location = location;
  this.parking = parking;
  this.parkingPrice = parkingPrice;
  this.numFloors = numFloors;
}

public String displayInfo(){
  String output = name + ", " + location; //missing roomPrice
  return output;
}
public String displayAmeneties(){
  String output = parking + parkingPrice; //missing Ameneties
  return output;
}
 
public void makeReservation(int reservation_id, int user_id, int hotel_id, int stay_duration, int guest_count, boolean has_paid, String currDate){
  for (int i=0; i<reservation.length; i++){
      if(reservation[i] == NULL){
        reservation[i] = new Reservation(reservation_id,user_id,hotel_id,stay_duration,guest_count,has_paid,currDate);
        }
      else {
        System.out.print("No more reservations possible");
        break;
        }
    }
}

public void deleteReservation(int reservation_id){
 for(int i=0; i<reservation.lenght; i++) {
  if(reservation[i].getId() = reservation_id) {
      reservation[i] = new Reservation();
   }
 else {
     System.out.print("Reserve not found");
      }
   }
}
        
}
