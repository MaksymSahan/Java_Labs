from machines.Machine import *
from enums.Fuel import *
from enums.MachinesName import *

class Ship(Machine):
    fuel_consumption = Fuel.L_1100
    machines_name = MachinesName.Ship

    def __init__(self, model, weightInTones, team, fuel, sailors):
            self.sailors = sailors
            Machine.__init__(self, model, weightInTones, team, fuel)
            self.sailors = sailors

    def __str__(self):
        return " Ship: " + str(self.model) + " ,weight in tones: " + str(self.weightInTones) + " ,fuel consumption: " + str(self.fuel) + " ,amount of sailors: " + str(self.sailors)
