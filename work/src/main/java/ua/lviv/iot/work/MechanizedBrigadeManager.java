package ua.lviv.iot.work;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.jvnet.hk2.annotations.Service;

@Service
public class MechanizedBrigadeManager {
    private List<MilitaryMachinery> militaryMachinery;

    public List<MilitaryMachinery> findByFuelConsumption(double fuelComsumptionInLitras) {
        List<MilitaryMachinery> result = new ArrayList<MilitaryMachinery>();
        for (MilitaryMachinery machinery : this.militaryMachinery) {
            if (machinery.getFuelConsumtionInLitras() <= fuelComsumptionInLitras) {
                result.add(machinery);
            }
        }
        return result;
    }

    public List<MilitaryMachinery> sortMachinesByWeight(List<MilitaryMachinery> machines) {
        machines.sort(Comparator.comparingDouble(MilitaryMachinery::getWeightInTones));
        return machines;
    }
    
    public List<MilitaryMachinery> getMilitaryMachinery() {
        return militaryMachinery;
    }

    public void setMilitaryMachinery(List<MilitaryMachinery> militaryMachinery) {
        this.militaryMachinery = militaryMachinery;
    }

}
