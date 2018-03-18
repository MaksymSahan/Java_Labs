package lab6;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ua.lviv.iot.work.Machines;
import ua.lviv.iot.work.WheelMacinery;

public class WheelMachineryTest {
    @Test
    public void numberOfWheelsTest() {
        int value = 8;
        WheelMacinery wheelMachinery = new WheelMacinery(Machines.APC);
        wheelMachinery.setNumberOfWheels(value);
        assertTrue(value == (wheelMachinery.getNumberOfWheels()));
    }
}
