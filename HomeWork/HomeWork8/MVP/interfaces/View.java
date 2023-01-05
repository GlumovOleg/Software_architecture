package HomeWork.HomeWork8.MVP.interfaces;

import java.util.Collection;
import java.util.Date;

import HomeWork.HomeWork8.MVP.models.Table;

public interface View {

    void showTable(Collection<Table> tables);
    void setObserver(ViewObserver observer);
    void printReservationTableResult(int tableNo, int reservationNo);
    void printChangeReservationTableResult(int tableNo, Date reservationDate);
}
