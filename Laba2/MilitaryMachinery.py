class MilitaryMachinery:
    militaryMachinery = []

    def __init__(self):
        pass

    def sortByFuelConsumption(self):
        self.machines.sort(key=lambda machine: machine.fuel)

    def findByFuelConsumption(self):
        foundMachine = []

        for militaryMachinery in self.machines:
                if militaryMachinery.fuel == militaryMachinery:
                    foundMachine.append(militaryMachinery)

        return foundMachine

    def addMachine(self, machine):
        self.machines += machine

    def printList(self):
        for good in self.machines:
            print(good)
        print("\n")
