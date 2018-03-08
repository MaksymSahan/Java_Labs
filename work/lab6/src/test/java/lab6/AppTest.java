package lab6;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

import ua.lviv.iot.work.Main;
import ua.lviv.iot.work.MechanizedBrigadeManager;
import ua.lviv.iot.work.MilitaryMachinery;
import ua.lviv.iot.work.Stock;

public class AppTest {
    
    @Test
    public void appTest() {
        Stock stock = new Stock();
        List<MilitaryMachinery> machineries = stock.getMachineries();
        MechanizedBrigadeManager manager = new MechanizedBrigadeManager();
        manager.setMilitaryMachinery(machineries);
        List<MilitaryMachinery> result = manager.findByFuelConsumption(20);
        for (MilitaryMachinery machinery: result) {
            assertTrue(machinery.getFuelConsumtionInLitras() <= 20);
        }
    }
    @Test
    public void appTest2() {
        Stock stock = new Stock();
        List<MilitaryMachinery> machineries = stock.getMachineries();
        MechanizedBrigadeManager manager = new MechanizedBrigadeManager();
        manager.setMilitaryMachinery(machineries);
        List<MilitaryMachinery> result = manager.findByFuelConsumption(20);
        result = manager.sortMachinesByWeight(result);
        MilitaryMachinery tmp = null;
        for (MilitaryMachinery machinery : result) {
            if (tmp == null) {
                tmp = machinery;
            } else {
                assertTrue(tmp.getWeightInTones() >= machinery.getWeightInTones());
            }
        }
    }
 /*   @Test
    public void appTest3() {
        Stock stock = new Stock();

        List<MilitaryMachinery> machineries = stock.getMachineries();

        MechanizedBrigadeManager manager = new MechanizedBrigadeManager();
        manager.setMilitaryMachinery(machineries);
        List<MilitaryMachinery> result = manager.findByFuelConsumption(20);
        result = manager.sortMachinesByWeight(result);
        boolean menu = true;
        while (menu) {

            System.out.println("Menu:");
            System.out.println("1 - Print list of Machines;");
            System.out.println("2 - Print weight of Machines;");
            System.out.println("3 - Find machines by fuel consumption;");
            System.out.println("4 - Exit;");

            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            // scan.close();

            switch (num) {
            case 1: {
                for (MilitaryMachinery machinery : machineries) {
                    System.out.println(machinery);
                }
                break;
            }
            case 2: {
                for (MilitaryMachinery machinery : result) {
                    System.out.println(machinery.selectType() + " " + "Weight:" + machinery.getWeightInTones());
                }
                break;
            }
            case 3: {
                for (MilitaryMachinery machinery : result) {
                    System.out.println(machinery.selectType() + " " + " Fuel consumption:"
                            + machinery.getFuelConsumtionInLitras());
                }
                break;
            }
            case 4:
            default: {
                menu = false;
                System.out.println("Exit program...");
                break;
            }
            }
        }
    }
 */   
    @Test
    public void appTest4() {
        String[] args = null;
        Main.main(args);
    }
}
