package az.edu.ada.modules.module02.lesson11;

public abstract class ToppingDecorator implements Pizza {

    protected Pizza wrapped;

    public ToppingDecorator(Pizza wrapped) {
        this.wrapped = wrapped;
    }
}
