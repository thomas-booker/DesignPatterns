public abstract class Shape {

    protected Colour colour;

    public Shape(Colour colour) {
        this.colour = colour;
    }

    abstract public void applyColourToShape();

    abstract public Colour getColour();
}
