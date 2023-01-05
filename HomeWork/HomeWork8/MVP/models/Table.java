package HomeWork.HomeWork8.MVP.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Optional;

public class Table {

    private static int counter = 0;

    private final int no;

    private final Collection<Reservation> reservation = new ArrayList<>();

    {
        no = ++counter;
    }

    public int getNo() {
        return no;
    }

    public Collection<Reservation> getReservation() {
        return reservation;
    }

    public boolean removeReservation(int idTableRemove) {
        Reservation reservTable = reservation.stream().filter(r -> r.getId() == idTableRemove).findFirst().orElseThrow(() -> new RuntimeException("Резерв не найден"));

            return reservation.remove(reservTable);
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(), "Столик #%d", no);
    }

}
