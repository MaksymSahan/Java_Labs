from machines.Machine import *
from enums.Fuel import *
from enums.MachinesName import *


class BTR(Machine):
    fuel_consumption = Fuel.L_13
    machines_name = MachinesName.BTR

    def __init__(self, model, weightInTones, team, fuel, numberOfWheels,):
            self.numberOfWheels = numberOfWheels
            Machine.__init__(self, model, weightInTones, team, fuel)
            self.numberOfWheels = numberOfWheels

    def __str__(self):
        return " BTR: " + str(self.model) + " ,weight in tones: " + str(self.weightInTones) + " ,fuel consumption: " + str(self.fuel) + " ,number of wheels: " + str(self.numberOfWheels)
