public class DecoratorPatternTest {

    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n******");

        Car luxurySportsCar = new SportsCar(new LuxuryCar(new BasicCar()));
        luxurySportsCar.assemble();
    }
}
