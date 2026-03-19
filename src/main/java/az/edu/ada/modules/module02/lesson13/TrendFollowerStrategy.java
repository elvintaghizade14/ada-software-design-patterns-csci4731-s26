package az.edu.ada.modules.module02.lesson13;

import java.util.List;

public class TrendFollowerStrategy implements TradingStrategy {

    @Override
    public boolean shouldExecuteTrade(List<Double> priceHistory) {
        int n = priceHistory.size();
        // We need at least 4 prices (the latest + 3 previous) to evaluate
        if (n < 4) {
            return false;
        }

        final double latest = priceHistory.get(n - 1);
        return latest > priceHistory.get(n - 2)
                && latest > priceHistory.get(n - 3)
                && latest > priceHistory.get(n - 4);
    }
}
