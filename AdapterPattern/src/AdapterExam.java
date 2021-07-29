public class AdapterExam {
    public static void main(String[] args) {
        SocketClassAdapterImpl socketClassAdapter = new SocketClassAdapterImpl();
        SocketObjectAdapterImpl socketObjectAdapter = new SocketObjectAdapterImpl();
        System.out.println("Init two socket");
        System.out.println("Change 120V socketClassAdapter = " + socketClassAdapter.get120Volt().getVolts());
        System.out.println("Change 3V socketObjectAdapter = " + socketObjectAdapter.get3Volt().getVolts());
        System.out.println("Change 12V socketClassAdapter = " + socketClassAdapter.get12Volt().getVolts());
        System.out.println("Change 12V socketObjectAdapter = " + socketObjectAdapter.get12Volt().getVolts());
    }
}
