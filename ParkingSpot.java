package parkinglot;

public class ParkingSpot {
    private final ParkingSpotType spotype;// if this is final, defined it with a constructor
    private boolean available;
    private Vehicle vehicle;
    private ParkingLevel level;
    public ParkingSpot(ParkingSpotType spotype){

        this.spotype=spotype;
    }
    
}
