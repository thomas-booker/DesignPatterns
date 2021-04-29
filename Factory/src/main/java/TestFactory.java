public class TestFactory {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "2GB", "500GB", "Intel i7");
        Computer server = ComputerFactory.getComputer("server", "8GB", "2TB", "Intel Xeon");
        Computer nothing = ComputerFactory.getComputer("bike", "1GB", "1TB", "Intel Bike");

        System.out.println("Factory PC Config: " + pc);
        System.out.println("Server Server Config: " + server);
        System.out.println("Bike Server Config: " + nothing);
    }
}
