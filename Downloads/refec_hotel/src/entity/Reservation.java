package entity;

import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Reservation {


    public Customer customer;
    public Room room;
//    public String customerName;
//    public String customerPhoneNumber;
//    public String  roomSize;
//    public String roomPrice;
//    public String roomNumber;
    public DateTimeFormatter reservationDate;
    public UUID reservationNumber;


}
