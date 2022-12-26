package HomeWork.HomeWork4.BusTikets.Server;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import HomeWork.HomeWork4.BusTikets.Database;
import HomeWork.HomeWork4.BusTikets.PaymentProvider;
import HomeWork.HomeWork4.BusTikets.Ticket;

public class TicketProvider {

    private final Database database;
    private final PaymentProvider paymentProvider;

    public TicketProvider(Database database, PaymentProvider paymentProvider) {
        this.database = database;
        this.paymentProvider = paymentProvider;
    }

    public Collection<Ticket> serchTicket(int clientId, Date date) {

        Collection<Ticket> tickets = new ArrayList<>();
        for (Ticket ticket : database.getTikets()) {
            if (ticket.getCustomerId() == clientId && ticket.getDate().equals(date));
                tickets.add(ticket);
        }
        return tickets;
    }

    public boolean buyTikets(int clientId, String cardNo) {

        // Предусловие
        
        if (cardNo == null){
            throw new RuntimeException("Ошибка ввода карты");
        }

        int orderId = database.createTiketOrder(clientId);
        double amount = database.getTiketsAmout();

        // постусловие
        if (!paymentProvider.buy(orderId, cardNo, amount)){
            throw new RuntimeException("Покупка билета не удалась");
        }
        return paymentProvider.buy(orderId, cardNo, amount);

    }

    public boolean checkTiket(String qrcode) {
        for (Ticket element : database.getTikets()) {
            if (element.getQrcode().equals(qrcode)) {
                element.setEnable(false);
                // Save database....
                return true;
            }
        }
        return false;
    }

}
