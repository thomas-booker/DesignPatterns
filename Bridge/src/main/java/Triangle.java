public class Triangle extends Shape {

    public Triangle(Colour colour) {
        super(colour);
    }

    @Override
    public void applyColourToShape() {
        System.out.print("Triangle filled with colour ");
        colour.applyColourToColour();
    }

    @Override
    public Colour getColour() {
        return colour;
    }
}
