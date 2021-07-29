public class ProxyExam {
    public static void main(String[] args) {
        MyService proxyMyService = new Proxy();
        System.out.println(proxyMyService.doSomething());
    }
}
