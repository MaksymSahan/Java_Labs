package lab6;

import java.util.List;

import org.junit.Test;

import ua.lviv.iot.work.Main;
import ua.lviv.iot.work.MechanizedBrigadeManager;
import ua.lviv.iot.work.MilitaryMachinery;
import ua.lviv.iot.work.Stock;

public class MainTest {
@Test 
public void menuTest() {
    Stock stock = new Stock();

    List<MilitaryMachinery> machineries = stock.getMachineries();

    MechanizedBrigadeManager manager = new MechanizedBrigadeManager();
    manager.setMilitaryMachinery(machineries);
    List<MilitaryMachinery> result = manager.findByFuelConsumption(20);
    result = manager.sortMachinesByWeight(result);
    Main.menu(machineries, result);
}
}
