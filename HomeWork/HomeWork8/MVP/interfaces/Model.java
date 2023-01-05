package HomeWork.HomeWork8.MVP.interfaces;

import java.util.Collection;
import java.util.Date;

import HomeWork.HomeWork8.MVP.models.Table;

public interface Model {
    
    Collection<Table> loadTables();

    int reservationTable(Date reservaitonDate, int tableNo, String name);
    
    int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);

}
