package az.edu.ada.modules.module02.lesson13;

import java.util.List;

public interface TradingStrategy {

    boolean shouldExecuteTrade(List<Double> priceHistory);
}
