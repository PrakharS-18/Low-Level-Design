package LLD.MachineCodingExamples.ParkingLot;

/**
 * Calculates the parking fee based on the given ticket.
 *
 * The implementation of this method should consider the entry and exit times
 * of the ticket, as well as any other relevant factors such as the type of
 * vehicle or parking spot.
 *
 * @param ticket the ticket for which to calculate the fee
 * @return the calculated parking fee
 */
public interface FeeCalculationStrategy {
    long calculateFee(Ticket ticket);
}
