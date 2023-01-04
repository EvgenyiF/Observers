import Customer.PassiveCustomer;
import Customer.ShopaholicCustomer;
import Interface.Observer;
import Interface.Subject;
import Store.Store;

public class Main {
    public static void main(String[] args) {
        // Инициализация
        Subject store = new Store();
        Observer customer1 = new PassiveCustomer();
        Observer customer2 = new ShopaholicCustomer();
        Observer customer3 = new ShopaholicCustomer();

        // Добавление двух покупателей в рассылку новостей
        store.addSubscriber(customer1);
        store.addSubscriber(customer2);

        // Уведомление
        store.notifySubscribers();

        // Покупатель отписался от рассылки новостей
        store.removeSubscriber(customer1);

        // Покупатель2 сообщил покупателю3 о распродаже
        store.addSubscriber(customer3);

        // Уведомление об обновленном списке покупателей
        store.notifySubscribers();
    }
}
