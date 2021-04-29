public class TestBuilderPattern {

    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("500GB", "2GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();

        Computer computer2 = new Computer.ComputerBuilder("300GB", "6GB")
                .setBluetoothEnabled(false)
                .setGraphicsCardEnabled(true)
                .build();

        computerStatistics(computer);
        computerStatistics(computer2);
    }

    private static void computerStatistics(Computer computer) {
        System.out.println("Computer HDD: " + computer.getHDD());
        System.out.println("Computer RAM: " + computer.getRam());
        System.out.println("Computer Bluetooth Enabled: " + computer.isBluetoothEnabled());
        System.out.println("Computer Graphics Card EnableD: " + computer.isGraphicsCardEnabled());
        System.out.println("================================");
    }
}
