import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ComputerTest {

    @Test
    public void shouldBuildComputerSuccessfully() {
        // Given
        String HDD = "1TB";
        String RAM = "16GB";

        boolean isGraphicsEnabled = true;
        boolean isBluetoothEnabled = true;

        // When
        Computer computer = buildAComputer(HDD, RAM, isGraphicsEnabled, isBluetoothEnabled);

        // Then
        assertTrue(computer.isBluetoothEnabled());
        assert(computer.getRam()).equalsIgnoreCase(RAM);
    }

    private Computer buildAComputer(String hdd, String ram, boolean graphics, boolean bluetooth) {
        return new Computer.ComputerBuilder(hdd, ram)
                .setGraphicsCardEnabled(graphics)
                .setBluetoothEnabled(bluetooth)
                .build();
    }
}
