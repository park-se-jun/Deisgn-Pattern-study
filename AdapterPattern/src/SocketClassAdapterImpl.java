/*
    상속을 통한 SocketAdapter 구현체이다.
    Java는 다중 상속을 허용하지 않으므로, extends와 implements를 통하여 다중 상속을 흉내내었다.
 */
public class SocketClassAdapterImpl extends Socket implements SocketAdapter{
    public Volt get120Volt() {
        return getVolt();
    }

    public Volt get12Volt() {
        Volt v = getVolt();
        return convertVolt(v, 10);
    }

    public Volt get3Volt() {
        Volt v = getVolt();
        return convertVolt(v, 40);
    }

    public Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}
