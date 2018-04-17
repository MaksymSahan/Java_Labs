package ua.lviv.iot.work;

public class WheelMacinery extends MilitaryMachinery {

    private int numberOfWheels;
    private MachineType type;

    public WheelMacinery(MachineType type) {
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
    public MachineType getType() {
        return this.type;
    }

    public String toString() {
        return super.toString() + " number of wheels " + this.numberOfWheels + " type " + this.type + "\n";
    }
    @Override
    public final String getHeaders() {
        return super.getHeaders() + ",numberOfWheels\n";
    }

    @Override
    public final String toCSV() {
        return super.getModel() + ", " + type + ", " + super.toCSV() + ", " + numberOfWheels + "\n";
    }
}
