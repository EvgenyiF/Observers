package Customer;
import Interface.Observer;

public class ShopaholicCustomer implements Observer {
    @Override
    public void update(String message) {
        processMessage(message);
    }
    private void processMessage(String message) {
        System.out.println("Покупатель-шопоголик заинтересован в покупке товара на распродаже!");
    }
}
