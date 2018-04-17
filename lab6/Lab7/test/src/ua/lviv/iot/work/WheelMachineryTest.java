package ua.lviv.iot.work;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ua.lviv.iot.work.MachineType;
import ua.lviv.iot.work.WheelMacinery;

public class WheelMachineryTest {
    @Test
    public void numberOfWheelsTest() {
        int value = 8;
        WheelMacinery wheelMachinery = new WheelMacinery(MachineType.APC);
        wheelMachinery.setNumberOfWheels(value);
        assertTrue(value == (wheelMachinery.getNumberOfWheels()));
    }
}
