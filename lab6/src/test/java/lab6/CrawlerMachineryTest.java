package lab6;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ua.lviv.iot.work.Caterpillars;
import ua.lviv.iot.work.CrawlerMachinery;

public class CrawlerMachineryTest {
    @Test
    public void protecionOfCaterpillarsTest() {
        String value = "no";
        CrawlerMachinery crawlerMachinery = new CrawlerMachinery(Caterpillars.IFV);
        crawlerMachinery.setProtecionOfCaterpillars(value);
        assertTrue(value.equals(crawlerMachinery.getProtecionOfCaterpillars()));
    }
}
