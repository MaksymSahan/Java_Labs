package ua.lviv.iot.work;

public class CrawlerMachinery extends MilitaryMachinery {
    private String protecionOfCaterpillars;
    private Caterpillars type;

    public CrawlerMachinery(Caterpillars type) {
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
    public String selectType() {
        return this.type.name();
    }
    
    public String toString() {
        return super.toString() + " protecion of caterpillars " + this.protecionOfCaterpillars + " type " + this.type + "\n";
    }
}
