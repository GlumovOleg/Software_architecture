package HomeWork.HomeWork4.BusTikets;

import java.util.Date;

import HomeWork.HomeWork4.BusTikets.Server.CustomerProvider;
import HomeWork.HomeWork4.BusTikets.Server.TicketProvider;


/** Мобильное приложение */
public class MobileApp {

    private final TicketProvider ticketProvider;

    private final Customer customer;

    public MobileApp(CustomerProvider customerProvider, TicketProvider ticketProvider) {
        this.ticketProvider = ticketProvider;
        customer = customerProvider.getCustomer("login", "password");
    }

    public void serchTicket(Date date) {
        customer.setTikets(ticketProvider.serchTicket(customer.getId(), new Date()));
    }

    public boolean buyButton(String cardNo) {
        return ticketProvider.buyTikets(customer.getId(), cardNo);
    }

}
