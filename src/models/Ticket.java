package models;

import java.util.Date;

public class Ticket {
    private Long id;
    private Long number;
    private Date entrytime;
    private  Vehicle vehicle;
    private  ParkingSpot parkingSpot;
    private  Gate gate;
}
