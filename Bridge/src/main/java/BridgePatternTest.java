public class BridgePatternTest {

    public static void main(String[] args) {
        Shape triangle = new Triangle(new RedColour());
        triangle.applyColourToShape();

        Shape pentagon = new Pentagon(new GreenColour());
        pentagon.applyColourToShape();
    }
}
