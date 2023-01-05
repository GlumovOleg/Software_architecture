package HomeWork.HomeWork8.MVP.interfaces;

import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date reservaitonDate, int tableNo, String name);

    void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);

}
