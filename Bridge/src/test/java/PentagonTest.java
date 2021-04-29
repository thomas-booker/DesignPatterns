import org.junit.Test;

public class PentagonTest {

    @Test
    public void shouldCreatePentagon() {
        // Given
        Pentagon pentagon = new Pentagon(new RedColour());
        pentagon.applyColourToShape();

        // When

        // Then
        assert(pentagon.getPentagonColour()).equals("RED");
    }
}
