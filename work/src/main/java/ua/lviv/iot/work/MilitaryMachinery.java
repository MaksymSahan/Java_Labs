package ua.lviv.iot.work;

public abstract class MilitaryMachinery {
    private String model = "No name";
    private double weightInTones;
    private int team;
    private double fuelConsumtionInLitras;
    public abstract String selectType();
    
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getWeightInTones() {
        return weightInTones;
    }
    public void setWeightInTones(double weightInTones) {
        this.weightInTones = weightInTones;
    }
    public int getTeam() {
        return team;
    }
    public void setTeam(int team) {
        this.team = team;
    }
    public double getFuelConsumtionInLitras() {
        return fuelConsumtionInLitras;
    }
    public void setFuelConsumtionInLitras(double fuelConsumtionInLitras) {
        this.fuelConsumtionInLitras = fuelConsumtionInLitras;
    }
    public String toString() {
        return " model = " + this.model + " weight " + this.weightInTones + " team " + this.team + " fuel consumption " + this.fuelConsumtionInLitras;
    }

    public void setNumberOfWheels(int i) {
       
        
    }

    public void setProtectionOfCaterpillars(String string) {
       
        
    }
}