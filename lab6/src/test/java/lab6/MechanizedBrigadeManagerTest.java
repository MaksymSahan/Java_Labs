package lab6;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import ua.lviv.iot.work.MechanizedBrigadeManager;
import ua.lviv.iot.work.MilitaryMachinery;
import ua.lviv.iot.work.Stock;

public class MechanizedBrigadeManagerTest {
    @Test
    public void findByFuelConsumptionTest() {
        MechanizedBrigadeManager manager = getMechanizedManager();
        int litras =20;
        List<MilitaryMachinery> result = manager.findByFuelConsumption(litras);
        for (MilitaryMachinery machinery: result) {
            assertTrue(machinery.getFuelConsumtionInLitras() <= litras);
        }
        
    }
    @Test
    public void sortMachinesByWeightTest() {
        MechanizedBrigadeManager manager = getMechanizedManager();
        List<MilitaryMachinery> result = manager.sortMachinesByWeight(manager.getMilitaryMachinery());
        MilitaryMachinery tmp = null;
        for (MilitaryMachinery machinery : result) {
            if (tmp == null) {
                tmp = machinery;
            } else {
                assertTrue(tmp.getWeightInTones() >= machinery.getWeightInTones());
            }
        }

    }
    
    private List<MilitaryMachinery> getMachines(){
        Stock stock =new Stock();
        return stock.getMachineries();
    }
    
    private MechanizedBrigadeManager getMechanizedManager() {
        MechanizedBrigadeManager manager = new MechanizedBrigadeManager();
        manager.setMilitaryMachinery(getMachines());
        return manager;
    }
}
