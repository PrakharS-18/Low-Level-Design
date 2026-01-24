package LLD.MachineCodingExamples.ParkingLot;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ParkingMain {
    public static void main(String[] args) {
        System.out.println("Vehicle Creation");
        Vehicle vehicle = new Vehicle("BMW", VehicleType.LARGE, "fskjbo-sdvs-111");

        System.out.println("Defining Parking Area and spots");
        ParkingSpot parkingSpot1 = new ParkingSpot(ParkingSpotType.SMALL,1,1);
        ParkingSpot parkingSpot2 = new ParkingSpot(ParkingSpotType.SMALL,1,2);
        ParkingSpot parkingSpot3 = new ParkingSpot(ParkingSpotType.MEDIUM,1,3);
        ParkingSpot parkingSpot4 = new ParkingSpot(ParkingSpotType.MEDIUM,1,4);
        ParkingSpot parkingSpot5 = new ParkingSpot(ParkingSpotType.LARGE,1,5);
        ParkingSpot parkingSpot6 = new ParkingSpot(ParkingSpotType.LARGE,1,6);
        ParkingSpot parkingSpot7 = new ParkingSpot(ParkingSpotType.LARGE,2,7);
        List<ParkingSpot> parkingSpots = new ArrayList<>();
        parkingSpots.add(parkingSpot1);
        parkingSpots.add(parkingSpot2);
        parkingSpots.add(parkingSpot3);
        parkingSpots.add(parkingSpot4);
        parkingSpots.add(parkingSpot5);
        parkingSpots.add(parkingSpot6);
        parkingSpots.add(parkingSpot7);

        ParkingArea parkingArea = new ParkingArea(parkingSpots);

        System.out.println("we will start functioning:");
        ParkingLotManagement parkingLotManagement = new ParkingLotManagement(parkingArea);

        parkingLotManagement.allocateParkingSpot(vehicle);

//        parkingLotManagement.printTicket();

        Ticket ticket = parkingLotManagement.getTicketByVehicleNumber(vehicle.getVehicleNumber());

        ticket.setExitTime(LocalDateTime.now().plusHours(3));

        System.out.println(parkingLotManagement.calculateParkingFee(ticket));

    }
}
