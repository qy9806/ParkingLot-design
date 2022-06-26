package parkinglot;
public abstract class Vehicle {
    protected String name;
    protected String plate;
    protected final VehicleType type;// BE SUPERED
    // parent class of Vehicle, only need to know size of the Vehicle




    public Vehicle(VehicleType type){ 
        this.type=type;
    }

}
