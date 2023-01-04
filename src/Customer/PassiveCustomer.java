package Customer;

import Interface.Observer;

public class PassiveCustomer implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Пассивный клиент обратил внимание на распродажу.");
    }
}