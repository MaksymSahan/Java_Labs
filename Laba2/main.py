from MilitaryMachinery import *
from machines.BTR import *
from machines.Plane import *
from machines.Ship import *
from machines.Tank import *

if __name__ == '__main__':
    militaryMachinery = MilitaryMachinery()

    btr = BTR("E_4", 20, 6, 13, 8)
    ship = Ship("Сагайдачний", 1000, 200, 1100, 150)
    plane = Plane("ANTONOV", 500, 80, 400, "machine guns")
    tank = Tank("OPLOT", 45, 4, 450, "yes")

    militaryMachinery.machines = [btr, ship, plane, tank]
    print("Previous list:")
    militaryMachinery.printList()

    militaryMachinery.sortByFuelConsumption()
    print("Sorted list")
    militaryMachinery.printList()

