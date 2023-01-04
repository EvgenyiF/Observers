package Store;

import Interface.Observer;
import Interface.Subject;

import java.util.ArrayList;
import java.util.List;

public class Store implements Subject {
    private List<Observer> customers = new ArrayList<>();

    @Override
    public void addSubscriber(Observer customer) {
        customers.add(customer);
    }
    @Override
    public void removeSubscriber(Observer customer) {
        customers.remove(customer);
    }
    @Override
    public void notifySubscribers() {
        System.out.println("Новый товар поступил в продажу! Действуйте быстро, пока его не раскупили!");
        for(Observer customer: customers) {
            customer.update("Распродажа!");
        }
    }
}