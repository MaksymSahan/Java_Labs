package military_machinery;

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
}
