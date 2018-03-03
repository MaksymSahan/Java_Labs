package ua.lviv.iot.work;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<MilitaryMachinery> machineries;

    public Stock() {
        machineries = new ArrayList<MilitaryMachinery>();

        MilitaryMachinery mm1 = new WheelMacinery(Machines.APC);
        mm1.setModel("¡“–-3");
        mm1.setTeam(6);
        mm1.setNumberOfWheels(8);
        mm1.setFuelConsumtionInLitras(13);
        mm1.setWeightInTones(20);
        machineries.add(mm1);

        MilitaryMachinery mm2 = new WheelMacinery(Machines.TRUCK);
        mm2.setModel(" –¿«");
        mm2.setTeam(20);
        mm2.setNumberOfWheels(6);
        mm2.setFuelConsumtionInLitras(15);
        mm2.setWeightInTones(8);
        machineries.add(mm2);

        MilitaryMachinery mm3 = new CrawlerMachinery(Caterpillars.IFV);
        mm3.setFuelConsumtionInLitras(18);
        mm3.setModel("Pantera");
        mm3.setTeam(8);
        mm3.setProtectionOfCaterpillars("no");
        mm3.setWeightInTones(8);
        machineries.add(mm3);

        MilitaryMachinery mm4 = new CrawlerMachinery(Caterpillars.SPA);
        mm4.setFuelConsumtionInLitras(250);
        mm4.setModel("√‚ÓÁ‰ËÍ‡");
        mm4.setTeam(4);
        mm4.setProtectionOfCaterpillars("no");
        mm4.setWeightInTones(15.1);
        machineries.add(mm4);

        MilitaryMachinery mm5 = new CrawlerMachinery(Caterpillars.TANK);
        mm5.setFuelConsumtionInLitras(450);
        mm5.setModel("ŒÔÎÓÚ-·");
        mm5.setTeam(3);
        mm5.setProtectionOfCaterpillars("yes");
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
