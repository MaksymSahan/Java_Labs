package ua.lviv.iot.work;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ua.lviv.iot.work.MachineType;
import ua.lviv.iot.work.CrawlerMachinery;
import ua.lviv.iot.work.MilitaryMachinery;

public class MilitaryMachineryTest {
    @Test
    public void modelTest() {
        String value = "√воздика";
        CrawlerMachinery militaryMachinery = new CrawlerMachinery(MachineType.IFV);
        militaryMachinery.setModel(value);
        assertTrue(value.equals(militaryMachinery.getModel()));
    }

    @Test
    public void weightInTonesTest() {
        double value = 8;
        CrawlerMachinery militaryMachinery = new CrawlerMachinery(MachineType.IFV);
        militaryMachinery.setWeightInTones(value);
        assertEquals(value,militaryMachinery.getWeightInTones(), 0.0001);
    }

    @Test
    public void teamTest() {
        int value = 8;
        CrawlerMachinery militaryMachinery = new CrawlerMachinery(MachineType.IFV);
        militaryMachinery.setTeam(value);
        assertTrue(value == militaryMachinery.getTeam());
    }

    @Test
    public void fuelConsumtionInLitrasTest() {
        int value = 8;
        CrawlerMachinery militaryMachinery = new CrawlerMachinery(MachineType.IFV);
        militaryMachinery.setFuelConsumtionInLitras(value);
        assertTrue(value == militaryMachinery.getFuelConsumtionInLitras());
    }

}
