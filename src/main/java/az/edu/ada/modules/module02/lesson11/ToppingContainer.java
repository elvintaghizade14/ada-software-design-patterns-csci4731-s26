package az.edu.ada.modules.module02.lesson11;

public class ToppingContainer {

    public static class Cheese extends ToppingDecorator {

        public Cheese(Pizza wrapped) {
            super(wrapped);
        }

        public double getCost() {
            return wrapped.getCost() + 2.00; // Inner cost + my cost
        }

        public String getDescription() {
            return wrapped.getDescription() + ", Cheese";
        }
    }

    public static class Pepperoni extends ToppingDecorator {

        public Pepperoni(Pizza wrapped) {
            super(wrapped);
        }

        public double getCost() {
            return wrapped.getCost() + 2.50;
        }

        public String getDescription() {
            return wrapped.getDescription() + ", Pepperoni";
        }
    }
}
