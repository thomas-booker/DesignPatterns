import org.junit.Test;

import static org.junit.Assert.assertNull;

public class ComputerFactoryTest {

    private static final String PC = "PC";
    private static final String SERVER = "Server";
    private static final String NOT_A_COMPUTER = "Nothing";

    @Test
    public void shouldReturnPC() {
        // Given
        Computer pc = ComputerFactory.getComputer(PC, "2GB", "500GB", "Intel i7");

        // When

        // Then
        assert(pc.getCPU()).equalsIgnoreCase("Intel i7");
        assert(pc.getComputerType()).equalsIgnoreCase("PC");
    }

    @Test
    public void shouldReturnServer() {
        // Given
        Computer server = ComputerFactory.getComputer(SERVER, "2GB", "2TB", "Intel Xeon");

        // When

        // Then
        assert(server.getCPU()).equalsIgnoreCase("Intel Xeon");
        assert(server.getComputerType()).equalsIgnoreCase("Server");
    }

    @Test
    public void shouldReturnNull() {
        // Given
        Computer nothing = ComputerFactory.getComputer(NOT_A_COMPUTER, "2GB", "500GB", "Intel i7");

        // When

        // Then
        assertNull(nothing);
    }
}
