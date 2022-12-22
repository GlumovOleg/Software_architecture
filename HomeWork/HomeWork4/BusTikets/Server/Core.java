package HomeWork.HomeWork4.BusTikets.Server;

import HomeWork.HomeWork4.BusTikets.Database;
import HomeWork.HomeWork4.BusTikets.PaymentProvider;

public class Core {

    private final CustomerProvider customerProvider;
    private final TicketProvider ticketProvider;
    private final PaymentProvider paymentProvider;
    private final Database database;

    public Core() {
        database = new Database();
        paymentProvider = new PaymentProvider();
        customerProvider = new CustomerProvider(database);
        ticketProvider = new TicketProvider(database, paymentProvider);
    }

    public CustomerProvider getCustomerProvider() {
        return customerProvider;
    }

    public TicketProvider getTicketProvider() {
        return ticketProvider;
    }

    

}
