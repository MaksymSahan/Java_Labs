package ua.lviv.iot.work;

public class CrawlerMachinery extends MilitaryMachinery {
    private String protecionOfCaterpillars;
    private MachineType type;

    public CrawlerMachinery(MachineType type) {
        super();
        this.type = type;
    }

    public String getProtecionOfCaterpillars() {
        return protecionOfCaterpillars;
    }

    public void setProtecionOfCaterpillars(String protecionOfCaterpillars) {
        this.protecionOfCaterpillars = protecionOfCaterpillars;
    }

    @Override
    public MachineType getType() {
        return this.type;
    }

    public String toString() {
        return super.toString() + " protecion of caterpillars " + this.protecionOfCaterpillars + " type " + this.type + "\n";
    }

    @Override
    public final String getHeaders() {
        return super.getHeaders() + ",protecionOfCaterpillars\n";
    }

    @Override
    public final String toCSV() {
        return super.getModel() + ", " + type + ", " + super.toCSV() + ", " + protecionOfCaterpillars + "\n";
    }
}
