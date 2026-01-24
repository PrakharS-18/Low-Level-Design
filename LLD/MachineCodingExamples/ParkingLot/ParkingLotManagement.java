package LLD.MachineCodingExamples.ParkingLot;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ParkingLotManagement {

    private final ParkingArea parkingArea;
    private HashSet<ParkingSpot> smallParkingSpots = new HashSet<>();
    private HashSet<ParkingSpot> mediumParkingSpots = new HashSet<>();
    private HashSet<ParkingSpot> largeParkingSpots = new HashSet<>();
    private boolean isConfigured;
    private List<Ticket> tickets = new ArrayList<>();


    public ParkingLotManagement(ParkingArea parkingArea) {
        this.parkingArea = parkingArea;
    }

    private void configureParkingSpots() {
        List<ParkingSpot> parkingSpotList = parkingArea.getParkingSpotList();

        for (ParkingSpot spot : parkingSpotList) {
            if (spot.getParkingSpotType().equals(ParkingSpotType.SMALL)) {
                smallParkingSpots.add(spot);
            } else if (spot.getParkingSpotType().equals(ParkingSpotType.MEDIUM)) {
                mediumParkingSpots.add(spot);
            } else {
                largeParkingSpots.add(spot);
            }
        }
    }

    long calculateParkingFee(Ticket ticket) {
        if(ticket.getExitTime()==null) {
            throw new IllegalArgumentException("Ticket exit time is null");
        }

        ParkingSpot parkingSpotAlloted = ticket.getParkingSpot();

        if (parkingSpotAlloted.getParkingSpotType().equals(ParkingSpotType.SMALL)) {
            return 10 * (Duration.between(ticket.getEntryTime(), ticket.getExitTime()).toHours());
        } else if (parkingSpotAlloted.getParkingSpotType().equals(ParkingSpotType.MEDIUM)) {
            return 20 * (Duration.between(ticket.getEntryTime(), ticket.getExitTime()).toHours());
        } else {
            return 30 * (Duration.between(ticket.getEntryTime(), ticket.getExitTime()).toHours());
        }

    }

    Ticket getTicketByVehicleNumber(String vehicleNumber) {
        for (Ticket ticket : tickets) {
            if (ticket.getVehicle().getVehicleNumber().equals(vehicleNumber)) {
                return ticket;
            }
        }
        return null;
    }

    private Ticket generateTicket(ParkingSpot parkingSpot, Vehicle vehicle) {
        return new Ticket(parkingSpot, vehicle);
    }

    void allocateParkingSpot(Vehicle vehicle) {
        /*
        This function need to find the available parking spot for Vehicle
         */
        ParkingSpot freeSpot = null;

        if (!isConfigured) {
            configureParkingSpots();
            isConfigured = true;
        }

        if (vehicle.getVehicleType().equals(VehicleType.SMALL)) {
            /*
            we have to find the SMALL available Parking spot from any floor
             */
            if (!smallParkingSpots.isEmpty()) {
                freeSpot = smallParkingSpots.stream().findFirst().get();
                smallParkingSpots.remove(freeSpot);
            }
        } else if (vehicle.getVehicleType().equals(VehicleType.MEDIUM)) {
            if (!mediumParkingSpots.isEmpty()) {
                freeSpot = mediumParkingSpots.stream().findFirst().get();
                mediumParkingSpots.remove(freeSpot);
            }
        } else {
            if (!largeParkingSpots.isEmpty()) {
                freeSpot = largeParkingSpots.stream().findFirst().get();
                largeParkingSpots.remove(freeSpot);
            }
        }
        Ticket ticket = generateTicket(freeSpot, vehicle);
        tickets.add(ticket);
        System.out.println("Printing ticket so that i am aware about the id");
        ticket.printTicket();
        System.out.println("-----------------------------------------------------------------------------");

    }



}
