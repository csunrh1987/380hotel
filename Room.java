public class Room {
   private int maxGuestCount;
   private int roomCount;
   private int bedCount;
   private String roomSuite;
   private int bathroomCount;
   private int showerCount;
   //private Amenities amenities = new Amenities(); //to be implemented later when Amenities() is created

   public Room(int maxGuestCount, int roomCount, int bedCount, String roomSuite,
               int bathroomCount, int showerCount) {
      this.maxGuestCount = maxGuestCount;
      this.roomCount = roomCount;
      this.bedCount = bedCount;
      this.roomSuite = roomSuite;
      this.bathroomCount = bathroomCount;
      this.showerCount = showerCount;
   }

   public static String displaySize(int roomCount, int bedCount, String roomSuite) {
      return "Room: " + roomSuite + "Bedrooms: " + roomCount + "Beds: " + bedCount;
   }

   public int displayPrice(RoomPrice roomPrice) { //RoomPrice still needs to be implemented
      //return roomPrice;
      return 1; //DEBUG
   }
}
