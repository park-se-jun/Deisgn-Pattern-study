/*
    클라이언트가 myService의 doSomething을 호출하기 이전에, 프록시가
    대신하여 doSomething을 호출하고 그 반환 값을 클라이언트에게 전달한다.
 */
public class Proxy implements MyService{
    MyService myService = new MyServiceImpl();

    @Override
    public String doSomething() {
        System.out.println("myService Proxy!");
        return myService.doSomething();
    }
}
