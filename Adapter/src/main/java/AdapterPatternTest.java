public class AdapterPatternTest {

    public static void main(String[] args) {
        testClassAdapter();
        testObjectAdapter();
    }

    private static void testObjectAdapter() {
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();

        setupObjectVolts(socketAdapter);
    }

    private static void setupObjectVolts(SocketAdapter socketAdapter) {
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);

        System.out.println("v3 volts using Object adapter: " + v3.getVolts());
        System.out.println("v12 volts using Object adapter: " + v12.getVolts());
        System.out.println("V120 volts using Object adapter: " + v120.getVolts());
    }

    private static void testClassAdapter() {
        SocketAdapter socketAdapter = new SocketClassAdapterImpl();

        setupClassVolts(socketAdapter);
    }

    private static void setupClassVolts(SocketAdapter socketAdapter) {
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);

        System.out.println("v3 volts using Class adapter: " + v3.getVolts());
        System.out.println("v12 volts using Class adapter: " + v12.getVolts());
        System.out.println("V120 volts using Class adapter: " + v120.getVolts());
        System.out.println("==========================================");
    }

    private static Volt getVolt(SocketAdapter socketAdapter, int i) {
        switch (i) {
            case 3: return socketAdapter.get3Volt();
            case 12: return socketAdapter.get12Volt();
            case 120: return socketAdapter.get120Volt();
            default: return socketAdapter.get120Volt();
        }
    }
}
