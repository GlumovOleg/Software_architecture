package HomeWork.HomeWork4.BusTikets;

import java.util.ArrayList;
import java.util.Collection;

public class Database {

    private static int counter;

    private Collection<Ticket> tikets = new ArrayList<>();
    private Collection<Customer> customers = new ArrayList<>();

    /**
     * Получить актуальную стоимость билета.
     * 
     * @return возврат цены на текущий момент
     */
    public double getTiketsAmout() {
        return 45;
    }

    /**
     * Получить идентификатор заявки на покупку билета.
     * @param clientId
     * @return
     */
    public int createTiketOrder(int clientId){
        return ++counter;
    }

    public Collection<Ticket> getTikets() {
        return tikets;
    }

    public Collection<Customer> getCustomers() {
        return customers;
    }

}
