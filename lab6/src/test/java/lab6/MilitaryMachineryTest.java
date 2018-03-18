package lab6;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ua.lviv.iot.work.Caterpillars;
import ua.lviv.iot.work.CrawlerMachinery;
import ua.lviv.iot.work.MilitaryMachinery;

public class MilitaryMachineryTest {
    @Test
    public void modelTest() {
        String value = "√воздика";
        CrawlerMachinery militaryMachinery = new CrawlerMachinery(Caterpillars.IFV);
        militaryMachinery.setModel(value);
        assertTrue(value.equals(militaryMachinery.getModel()));
    }

    @Test
    public void weightInTonesTest() {
        double value = 8;
        CrawlerMachinery militaryMachinery = new CrawlerMachinery(Caterpillars.IFV);
        militaryMachinery.setWeightInTones(value);
        assertTrue(value == militaryMachinery.getWeightInTones());
    }

    @Test
    public void teamTest() {
        int value = 8;
        CrawlerMachinery militaryMachinery = new CrawlerMachinery(Caterpillars.IFV);
        militaryMachinery.setTeam(value);
        assertTrue(value == militaryMachinery.getTeam());
    }

    @Test
    public void fuelConsumtionInLitrasTest() {
        int value = 8;
        CrawlerMachinery militaryMachinery = new CrawlerMachinery(Caterpillars.IFV);
        militaryMachinery.setFuelConsumtionInLitras(value);
        assertTrue(value == militaryMachinery.getFuelConsumtionInLitras());
    }

}
