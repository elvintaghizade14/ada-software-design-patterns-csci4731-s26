package az.edu.ada.modules.module02.lesson13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TradingBot {

    private final List<Double> priceHistory;
    private final Map<String, TradingStrategy> strategyRegistry;

    private TradingStrategy currentStrategy;

    public TradingBot() {
        this.priceHistory = new ArrayList<>();
        this.strategyRegistry = new HashMap<>();

        strategyRegistry.put("TREND", new TrendFollowerStrategy());
        strategyRegistry.put("CONTRARIAN", new ContrarianStrategy());
        strategyRegistry.put("PANIC", new PanicDropStrategy());
    }

    public void setStrategy(String strategyName) {
        TradingStrategy selected = strategyRegistry.get(strategyName.toUpperCase());

        if (selected == null) {
            throw new IllegalArgumentException("Invalid Trading Algorithm: " + strategyName);
        }

        this.currentStrategy = selected;
        System.out.println("Strategy swapped to: " + strategyName);
    }

    public void addPrice(double price) {
        priceHistory.add(price);
        System.out.println("Market Tick: $" + price);
    }

    public void evaluate() {
        if (currentStrategy == null) {
            System.out.println("No strategy set.");
            return;
        }

        if (currentStrategy.shouldExecuteTrade(priceHistory)) {
            double latestPrice = priceHistory.getLast();
            System.out.println(">>> TRADE EXECUTED AT PRICE: $" + latestPrice + " <<<");
        }
    }
}
