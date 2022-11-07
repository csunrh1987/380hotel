import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class RoomPrice {

    private int roomPrice;
    private String firstNightDate;
    private String lastNightDate;
    private long nightsStayed;

    public RoomPrice(int roomPrice, String firstNightDate,
                     String lastNightDate, long nightsStayed) {
        this.roomPrice = roomPrice;
        this.firstNightDate = firstNightDate;
        this.lastNightDate = lastNightDate;
        this.nightsStayed = nightsStayed;

    }
    // needs testing
    public long calculateTotalNights (int roomPrice, String firstNightDate, String lastNightDate,
                                     long nightsStayed) throws IOException {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        firstNightDate = reader.readLine();
        lastNightDate = reader.readLine();
        LocalDate firstDate = LocalDate.parse(firstNightDate, formatter);
        LocalDate lastDate = LocalDate.parse(lastNightDate, formatter);
        nightsStayed = ChronoUnit.DAYS.between(firstDate, lastDate);
        System.out.println("Nights stayed: " + nightsStayed); //REMOVE

        return nightsStayed;
    }

    public int roomPrice(int nightsStayed, int roomPrice) {
        return roomPrice;
    }

}
