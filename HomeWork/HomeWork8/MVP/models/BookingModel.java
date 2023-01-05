package HomeWork.HomeWork8.MVP.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;

import HomeWork.HomeWork8.MVP.interfaces.Model;

public class BookingModel implements Model {

    private Collection<Table> tables;

    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());

        }

        return tables;
    }

    /**
     * Бронирование столика
     * 
     * @param reservaitonDate дата бронирования
     * @param tableNo         номер столика
     * @param name            имя клиента
     * @return номер бронирования
     */

    public int reservationTable(Date reservaitonDate, int tableNo, String name) {
        Optional<Table> table = loadTables().stream().filter(t -> t.getNo() == tableNo).findFirst();
        if (table.isPresent()) {
            Reservation reservation = new Reservation(reservaitonDate, name);
            table.get().getReservation().add(reservation);
            return reservation.getId();
        }
        throw new RuntimeException("Некорректный номер столика.");
    }

    /**
     * Изменение в бронировании столика
     * 
     * @param oldReservation  старая дата бронирования
     * @param reservationDate новая дата бронировния
     * @param tableNo         номер столика
     * @param name            имя клиента
     */

    @Override
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        Table tableToRemoveReservation = null;
        for (Table table : tables) {
            Optional<Reservation> reserv = table.getReservation().stream().filter(r -> r.getId() == oldReservation).findFirst();
            if (reserv.isPresent()) {
                tableToRemoveReservation = table;
            }
        }
        if (tableToRemoveReservation != null && tableToRemoveReservation.removeReservation(oldReservation)) {

            return this.reservationTable(reservationDate, tableNo, name);
        }
        else throw new RuntimeException("Error");
    }

}
