from machines.Machine import *
from enums.Fuel import *
from enums.MachinesName import *


class Plane(Machine):
    fuel_consumption = Fuel.L_500
    machines_name = MachinesName.Plane

    def __init__(self, model, weightInTones, team, fuel, weapon):
            self.weapon = weapon
            Machine.__init__(self, model, weightInTones, team, fuel)
            self.weapon = weapon

    def __str__(self):
        return " Plane: " + str(self.model) + " ,weight in tones: " + str(self.weightInTones) + " ,fuel consumption: " + str(self.fuel) + " ,weapon: " + str(self.weapon)
