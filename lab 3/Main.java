package military_machinery;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Stock stock = new Stock();

        List<MilitaryMachinery> machineries = stock.getMachineries();

        MechanizedBrigadeManager manager = new MechanizedBrigadeManager();
        manager.setMilitaryMachinery(machineries);
        List<MilitaryMachinery> result = manager.findByFuelConsumption(20);
        result = manager.sortMachinesByWeight(result);
        for (MilitaryMachinery machinery : result) {
            System.out.println(machinery.selectType() + " " + "Weight:" + machinery.getWeightInTones()
                    + " Fuel consumption:" + machinery.getFuelConsumtionInLitras());
        }
    }
}
