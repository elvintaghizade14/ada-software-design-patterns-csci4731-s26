package az.edu.ada.modules.module02.lesson10;

public class CcrProxyImpl implements CcrProxy {
    @Override
    public String getCcrByPin(String pin) {
        return "Hello " + pin;
    }
}
