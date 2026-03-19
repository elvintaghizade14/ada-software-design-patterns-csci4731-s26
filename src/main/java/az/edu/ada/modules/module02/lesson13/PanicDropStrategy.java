package az.edu.ada.modules.module02.lesson13;

import java.util.List;

public class PanicDropStrategy implements TradingStrategy {

    @Override
    public boolean shouldExecuteTrade(List<Double> priceHistory) {
        if (priceHistory.isEmpty()) {
            return false;
        }

        double firstPrice = priceHistory.getFirst();
        double latestPrice = priceHistory.getLast();

        // True if the latest price dropped by more than 10% from the first price
        return latestPrice < (firstPrice * 0.90);
    }
}
