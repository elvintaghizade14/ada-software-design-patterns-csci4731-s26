package az.edu.ada.modules.module02.lesson10;

public class ProxyApp {

    private final CcrProxy ccrProxy;

    public ProxyApp(CcrProxy ccrProxy) {
        this.ccrProxy = ccrProxy;
    }

    public static void main(String[] args) {
        System.out.println(new ProxyApp(new CcrProxyImpl())
                .ccrProxy.getCcrByPin("ABC1234"));
    }
}
