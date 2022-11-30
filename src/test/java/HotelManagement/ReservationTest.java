/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package HotelManagement;

import java.text.SimpleDateFormat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;


/**
 *
 * @author Randy
 */
public class ReservationTest {
    
    public ReservationTest() {
    }

    /**
     * Test of Connect method, of class Reservation.
     */
    @Test
    public void testConnect() {
    }

    /**
     * Test of autoID method, of class Reservation.
     */
    @Test
    public void testAutoID() {
    }

    /**
     * Test of RoomTypeL method, of class Reservation.
     */
    @Test
    public void testRoomTypeL() {
    }

    /**
     * Test of loadReservation method, of class Reservation.
     */
    @Test
    public void testLoadReservation() {
    }

    /**
     * Test of loadRoom method, of class Reservation.
     */
    @Test
    public void testLoadRoom() {
    
    }

    /**
     * Test of RoomNo method, of class Reservation.
     */
    @Test
    public void testRoomNo() {
    }

    /**
     * Test of BedType method, of class Reservation.
     */
    @Test
    public void testBedType() {
    }

    /**
     * Test of StringToDate method, of class Reservation.
     */
    @Test
    
    //Tested by Randy, Gabe, Riley
    public void testStringToDate() throws Exception {
    Reservation test = new Reservation();
    Date expected = test.StringToDate("Jan 10,2023");
    Date actual = new Date(123,0,10); //According to Java, humanity started in 1900 and months begin at 0
    assertEquals(expected,actual);
   
    
    }

    /**
     * Test of ConvertDate method, of class Reservation.
     */
    @Test
   
    //Tested by Randy, Oscar
    public void testConvertDate() throws Exception {    
    Reservation test = new Reservation();
    String expected = test.ConvertDate("Jan 10,2023");
    String actual = "2023-01-10";
    assertEquals(expected, actual);
    
    
    }

    /**
     * Test of numOfStay method, of class Reservation.
     */
    @Test
    
    //Tested by Riley, Gabe
    public void testNumOfStay() {
    Reservation test = new Reservation(); 
    long expected = test.numOfStay("2023-02-10", "2023-02-15");
    long actual = 5;
    assertEquals(expected, actual, 0.000001);
   
   
    
    
    }

    /**
     * Test of main method, of class Reservation.
     */
    @Test
    public void testMain() {
    }
    
}
