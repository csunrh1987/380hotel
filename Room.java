public class Room {
   private int maxGuestCount;
   private int roomCount;
   private int bedCount;
   private String roomType;
   private int bathroomCount;
   private int showerCount;
   private Amenities amenities = new Amenities(); //to be implemented later when Amenities() is created

   public Room(int maxGuestCount, int roomCount, int bedCount, String roomType,
               int bathroomCount, int showerCount) {
      this.maxGuestCount = maxGuestCount;
      this.roomCount = roomCount;
      this.bedCount = bedCount;
      this.roomType = roomType;
      this.bathroomCount = bathroomCount;
      this.showerCount = showerCount;
   }

   public static String displaySize(int roomCount, int bedCount, String roomType) {
      return "Room type: " + roomType + "Bedrooms: " + roomCount + "Beds: " + bedCount;
   }

   public static int displayPrice(RoomPrice roomPrice) {;
      return roomPrice;
   }
}
