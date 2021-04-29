public class Pentagon extends Shape {

    private String PENTAGON_COLOUR = "";

    public Pentagon(Colour colour) {
        super(colour);
    }

    @Override
    public void applyColourToShape() {
        System.out.print("Pentagon filled with colour ");
        colour.applyColourToColour();
        setPentagonColour(colour.getColour());
    }

    @Override
    public Colour getColour() {
        return colour;
    }

    public void setPentagonColour(String colour) {
        this.PENTAGON_COLOUR = colour;
    }

    public String getPentagonColour() {
        return PENTAGON_COLOUR;
    }
}
