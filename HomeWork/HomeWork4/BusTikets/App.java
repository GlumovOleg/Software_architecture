package HomeWork.HomeWork4.BusTikets;

import java.util.Date;

import HomeWork.HomeWork4.BusTikets.Server.Core;


/**
 * Разработать контракты и компаненты системы "Покупка онлайн билетов на автобус в час-пик"
 * 
 * 5,6,7,8 - не обязательные задания.
 * 
 * 
 * 1. Предусловие.
 * 2. Постусловие.
 * 3. Инвариант.
 * 4. Определить абстрактные и конкретные классы.
 * 5. Определить интерфейсы.
 * 6. Реализовать наследование.
 * 7. Выявить компаненты.
 * 8. Разработать диаграмму компанент используя натацию UML 2.0. Общая без деталей.
 * 
 */

public class App {
    public static void main(String[] args) {
        
        Core core = new Core();

        MobileApp mobileApp = new MobileApp(core.getCustomerProvider(), core.getTicketProvider());

        mobileApp.serchTicket(new Date());
        mobileApp.buyButton("100000000000042");

        BusStation busStation = new BusStation();
    }
}
