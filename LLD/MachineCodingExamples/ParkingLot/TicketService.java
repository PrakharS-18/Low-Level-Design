package LLD.MachineCodingExamples.ParkingLot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TicketService {

    private List<Ticket> tickets;
    private HashMap<String, Object> mapVehicleToTicket;


    TicketService() {
        this.tickets = new ArrayList<>();
        this.mapVehicleToTicket = new HashMap<>();
    }

    Ticket generateTicket(ParkingSpot parkingSpot, Vehicle vehicle) {
        Ticket ticket = new Ticket(parkingSpot, vehicle);
        tickets.add(ticket);
        mapVehicleToTicket.put(vehicle.getVehicleNumber(), ticket);
        return ticket;
    }

    Ticket getTicketByVehicleNumber(String vehicleNumber) {
        return (Ticket) mapVehicleToTicket.get(vehicleNumber);
    }

    void printTicket(Ticket ticket) {
        System.out.println("------------ PRINTING TICKET -------------");
        System.out.println(ticket.getTicketID());
        System.out.println(ticket.getVehicle().getVehicleNumber());
        System.out.println(ticket.getParkingSpot().getParkingSpotId());
        System.out.println(ticket.getParkingSpot().getParkingFloorId());
        System.out.println("------------ END PRINTING TICKET -------------");
    }
}
