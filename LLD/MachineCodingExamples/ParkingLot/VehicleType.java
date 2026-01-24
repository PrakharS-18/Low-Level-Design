package LLD.MachineCodingExamples.ParkingLot;

public enum VehicleType {
    SMALL(1),
    MEDIUM(2),
    LARGE(3);

    private final int value;

    VehicleType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
