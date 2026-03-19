package az.edu.ada.modules.module02.lesson13;

public class AlgoTradeApp {

    public static void main(String[] args) {
        TradingBot bot = new TradingBot();

        bot.setStrategy("CONTRARIAN");
        double[] contrarianMarket = {150.0, 148.0, 145.0, 142.0};
        for (double price : contrarianMarket) {
            bot.addPrice(price);
            bot.evaluate();
        }

        bot.setStrategy("TREND");
        double[] trendMarket = {144.0, 146.0, 149.0, 155.0};
        for (double price : trendMarket) {
            bot.addPrice(price);
            bot.evaluate();
        }
    }
}
