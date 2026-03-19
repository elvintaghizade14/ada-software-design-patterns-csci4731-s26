package az.edu.ada.modules.module02.lesson13;

import java.util.List;

public class ContrarianStrategy implements TradingStrategy {

    @Override
    public boolean shouldExecuteTrade(List<Double> priceHistory) {
        int n = priceHistory.size();
        // We need at least 4 prices to evaluate
        if (n < 4) {
            return false;
        }

        double latest = priceHistory.get(n - 1);
        return latest < priceHistory.get(n - 2)
                && latest < priceHistory.get(n - 3)
                && latest < priceHistory.get(n - 4);
    }
}
