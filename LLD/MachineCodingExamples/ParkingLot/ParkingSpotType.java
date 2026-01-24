package LLD.MachineCodingExamples.ParkingLot;

public enum ParkingSpotType {
    SMALL(1),
    MEDIUM(2),
    LARGE(3);

    private final int value;

    ParkingSpotType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
