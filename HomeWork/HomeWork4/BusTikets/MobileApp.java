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

        // Предусловие
        
        if (customerProvider.getCustomer(null, null) == null){
            throw new RuntimeException("Поле логин или пароль не заполнено.");
        }
        customer = customerProvider.getCustomer("login", "password");
    }

    public void serchTicket(Date date) {
        customer.setTikets(ticketProvider.serchTicket(customer.getId(), new Date()));
    }

    public boolean buyTicket(String cardNo){
        return ticketProvider.buyTikets(customer.getId(), cardNo);
    }
}
