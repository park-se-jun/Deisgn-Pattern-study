/*
    다양한 Volt를 취급할 수 있도록 하는 Adapter 이다.
    제공하는 Volt 외에도 필요하다면 추가로 정의하고 구현하면 된다.
 */
public interface SocketAdapter {
    public Volt get120Volt();
    public Volt get12Volt();
    public Volt get3Volt();
}
