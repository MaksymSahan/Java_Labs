package ua.lviv.iot.work;

public class WheelMacinery extends MilitaryMachinery {

    private int numberOfWheels;
    private Machines type;
    
    public WheelMacinery(Machines type) {
        super();
        this.type = type;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public String selectType() {
        return this.type.name();
    }
    
    public String toString() {
        return super.toString() + " number of wheels " + this.numberOfWheels + " type " + this.type + "\n";
    }
}
