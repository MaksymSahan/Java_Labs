from machines.Machine import *
from enums.Fuel import *
from enums.MachinesName import *


class Tank(Machine):
    fuel_consumption = Fuel.L_450
    machines_name = MachinesName.Tank

    def __init__(self, model, weightInTones, team, fuel, protectionOnCaterpillars):
            self.protectionOnCaterpillars = protectionOnCaterpillars
            Machine.__init__(self, model, weightInTones, team, fuel)
            self.protectionOnCaterpillars = protectionOnCaterpillars

    def __str__(self):
        return " Tank: " + str(self.model) + " ,weight in tones: " + str(self.weightInTones) + " ,fuel consumption: " + str(self.fuel) + " ,protectoin on caterpillars: " + str(self.protectionOnCaterpillars)
