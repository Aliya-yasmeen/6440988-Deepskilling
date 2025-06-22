
public class StockObserverTest {
    public static void main(String[] args) {
        // Create subject
        StockMarket relianceStock = new StockMarket("RELIANCE");

        // Create observers
        Observer aliyaMobile = new MobileApp("Aliya");
        Observer yasmeenWeb = new WebApp("Yasmeen");

        // Register observers
        relianceStock.registerObserver(aliyaMobile);
        relianceStock.registerObserver(yasmeenWeb);

        // Price changes
        relianceStock.setStockPrice(2850.50);
        relianceStock.setStockPrice(2890.75);

        // Remove one observer
        relianceStock.removeObserver(yasmeenWeb);

        // Another price change
        relianceStock.setStockPrice(2950.00);
    }
}
