package ua.lviv.iot.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
        Collections.sort(machines, new Comparator<MilitaryMachinery>() {
            public int compare(MilitaryMachinery arg0, MilitaryMachinery arg1) {
                if (arg0.getWeightInTones() < arg1.getWeightInTones()) {
                    return 1;
                } else {
                    if (arg0.getWeightInTones() > arg1.getWeightInTones()) {
                        return -1;
                    }
                }
                return 0;
            }
        });
        return machines;
    }
    
    
    
    public List<MilitaryMachinery> getMilitaryMachinery() {
        return militaryMachinery;
    }

    public void setMilitaryMachinery(List<MilitaryMachinery> militaryMachinery) {
        this.militaryMachinery = militaryMachinery;
    }

}
