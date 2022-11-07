import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class RoomPrice {

    private int roomPrice;
    private String firstNightDate;
    private String lastNightDate;
    private long nightsStayed;
    private int oneNightPrice;

    public RoomPrice(int roomPrice, String firstNightDate,
                     String lastNightDate, long nightsStayed) {
        this.roomPrice = roomPrice;
        this.firstNightDate = firstNightDate;
        this.lastNightDate = lastNightDate;
        this.nightsStayed = nightsStayed;

    }

    /**
     numOfStay returns the number of days reservation has been selected
     * */

    // (input date in this format: "YYYY-MM-DD")
    public static void numOfStay(CharSequence checkInDate, CharSequence checkOutDate,
                                 long nightsStayed) {
        try {
            LocalDate dateIn = LocalDate.parse(checkInDate);
            //CharSequence checkOutDate;
            LocalDate dateOut = LocalDate.parse(checkOutDate);

            nightsStayed = ChronoUnit.DAYS.between(dateIn, dateOut);
            System.out.println("The number of days between dates: " + nightsStayed);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public int roomPrice(long nightsStayed, int roomPrice,
                          int oneNightPrice) {

        roomPrice = oneNightPrice * nightsStayed;
        return roomPrice;
    }

}
