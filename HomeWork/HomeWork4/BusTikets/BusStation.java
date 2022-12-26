package HomeWork.HomeWork4.BusTikets;


import HomeWork.HomeWork4.BusTikets.Server.TicketProvider;


/** Автобусная станция */
public class BusStation{
    
// Доработать данный модуль
// Переработать любой модуль, в рамках соответствия принципам контрактно-ориентированного программирования.
    private TicketProvider ticketProvider;

    public BusStation (TicketProvider ticketProvider){
        this.ticketProvider = ticketProvider;
    }

    public void passagerOnBus(Ticket ticket){
        try {
            if (ticketProvider.checkTiket(ticket.getQrcode())){
                System.out.println("Можете проходить");
            }
            else{
                System.out.println("Пожалуйста, купите билет");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
