public class Amen {
int roomNo;
int capacity;
int days;
String category;
String status;
String guest;
String Wifi
String Microwave;
String fridge;
String safe;

public Room(int roomNo, String category,,String status,int capacity, String Wifi, string Microwave, String fridge, string safe) {
this.category = category;
this.capacity = capacity;
this.status = status;
this.roomNo = roomNo;
this.Wifi = Wifi;
this.Microwave = Microwave;
this.fridge = fridge;
this.safe = safe
}

@Override
public String toString() {

return "\nRoom no. "+roomNo+"\nCategory: "+category+" \nCapacity: "+capacity+"\nWifi available: "+Wifi+"\nStatus:"+Microwave+"\nStatus:"+fridge+"\nStatus:"+safe+"\nStatus "+status+"\n\n";
}
}

