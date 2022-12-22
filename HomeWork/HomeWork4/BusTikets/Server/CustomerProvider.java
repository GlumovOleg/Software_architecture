package HomeWork.HomeWork4.BusTikets.Server;

import HomeWork.HomeWork4.BusTikets.Database;
import HomeWork.HomeWork4.BusTikets.Customer;

public class CustomerProvider {

    private final Database database;

    public CustomerProvider(HomeWork.HomeWork4.BusTikets.Database database2) {
        this.database = database2;
    }

    public Customer getCustomer(String login, String password) {

        return database.getCustomers().stream().findFirst().get();

        
    }
    
}
