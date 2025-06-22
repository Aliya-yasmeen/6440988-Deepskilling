
public class WebApp implements Observer {
    private String username;

    public WebApp(String username) {
        this.username = username;
    }

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("WebApp - " + username + " received update: " + stockName + " ₹" + stockPrice);
    }
}
