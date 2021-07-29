/*
    객체를 이용한 SocketAdapter 구현체이다.
    클래스 내부에서 Socket 객체를 생성하고, 생성된 객체를 사용한다.
*/
public class SocketObjectAdapterImpl implements SocketAdapter {
    private Socket sock = new Socket();

    public Volt get120Volt() {
        return sock.getVolt();
    }

    public Volt get12Volt() {
        Volt v = sock.getVolt();
        return convertVolt(v, 10);
    }

    public Volt get3Volt() {
        Volt v = sock.getVolt();
        return convertVolt(v, 40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }

}
