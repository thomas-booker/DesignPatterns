public class GreenColour implements Colour {

    private static final String COLOUR = "GREEN";

    public void applyColourToColour() {
        System.out.println("green. ");
    }

    @Override
    public String getColour() {
        return COLOUR;
    }
}
