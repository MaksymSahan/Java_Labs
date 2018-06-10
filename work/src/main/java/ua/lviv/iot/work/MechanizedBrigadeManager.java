package ua.lviv.iot.work;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

import org.jvnet.hk2.annotations.Service;

@Service
@SessionScoped
public class MechanizedBrigadeManager {
    private List<MilitaryMachinery> militaryMachinery;
    
    @Inject
    private MilitaryMachineryDao dao;
    
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
