package ua.lviv.iot.work;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CrawlerMachineryTest {
    @Test
    public void protecionOfCaterpillarsTest() {
        String value = "no";
        CrawlerMachinery crawlerMachinery = new CrawlerMachinery(MachineType.IFV);
        crawlerMachinery.setProtecionOfCaterpillars(value);
        assertTrue(value.equals(crawlerMachinery.getProtecionOfCaterpillars()));
    }
}
