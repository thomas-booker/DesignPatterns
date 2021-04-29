public class RedColour implements Colour {

    private static final String COLOUR = "RED";

    public void applyColourToColour() {
        System.out.println("red. ");
    }

    @Override
    public String getColour() {
        return COLOUR;
    }
}
