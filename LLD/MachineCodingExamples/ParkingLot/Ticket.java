package LLD.MachineCodingExamples.ParkingLot;

import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket {
    private String ticketID;
    private ParkingSpot parkingSpot;
    private Vehicle vehicle;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    public Ticket(ParkingSpot parkingSpot, Vehicle vehicle) {
        this.ticketID = UUID.randomUUID().toString();
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
        this.entryTime = LocalDateTime.now();
        this.exitTime = null;
    }

    void printTicket() {
        System.out.println("Ticket ID: " + ticketID);
        System.out.println("Parking Spot: " + parkingSpot);
        System.out.println("Vehicle: " + vehicle);
        System.out.println("Entry Time: " + entryTime);
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }
}
