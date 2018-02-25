package military_machinery;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<MilitaryMachinery> machineries;

    public Stock() {
        machineries = new ArrayList<>();

        MilitaryMachinery mm1 = new WheelMacinery(Machines.APC);
        mm1.setFuelConsumtionInLitras(13);
        mm1.setWeightInTones(20);
        machineries.add(mm1);

        MilitaryMachinery mm2 = new WheelMacinery(Machines.TRUCK);
        mm2.setFuelConsumtionInLitras(15);
        mm2.setWeightInTones(8);
        machineries.add(mm2);

        MilitaryMachinery mm3 = new CrawlerMachinery(Caterpillars.IFV);
        mm3.setFuelConsumtionInLitras(18);
        mm3.setWeightInTones(8);
        machineries.add(mm3);

        MilitaryMachinery mm4 = new CrawlerMachinery(Caterpillars.SPA);
        mm4.setFuelConsumtionInLitras(250);
        mm4.setWeightInTones(15.1);
        machineries.add(mm4);

        MilitaryMachinery mm5 = new CrawlerMachinery(Caterpillars.TANK);
        mm5.setFuelConsumtionInLitras(450);
        mm5.setWeightInTones(45);
        machineries.add(mm5);

    }

    public List<MilitaryMachinery> getMachineries() {
        return machineries;
    }

    public void setMachineries(List<MilitaryMachinery> machineries) {
        this.machineries = machineries;
    }

}
