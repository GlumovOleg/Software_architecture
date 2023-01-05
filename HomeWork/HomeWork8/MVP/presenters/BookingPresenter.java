package HomeWork.HomeWork8.MVP.presenters;

import java.util.Collection;
import java.util.Date;

import HomeWork.HomeWork8.MVP.interfaces.Model;
import HomeWork.HomeWork8.MVP.interfaces.View;
import HomeWork.HomeWork8.MVP.interfaces.ViewObserver;
import HomeWork.HomeWork8.MVP.models.Table;

public class BookingPresenter implements ViewObserver {

    private final Model model;

    private final View view;

    private Collection<Table> tables;

    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.setObserver(this);
    }

    /*
     * Получить список всех столиков
     */
    public void loadTables() {
        tables = model.loadTables();
    }

    /*
     * Отобразить список столиков
     */
    public void updateView() {
        view.showTable(tables);
    }


    protected void printReservationTableResult(int tableNo, int reservationNo){
        view.printReservationTableResult(tableNo, reservationNo);
    }

    @Override
    public void onReservationTable(Date reservaitonDate, int tableNo, String name) {
        int reservationNo = model.reservationTable(reservaitonDate, tableNo, name);
        printReservationTableResult(tableNo, reservationNo);
    }

    protected void printChangeReservationTableResult(int tableNo, int reservationNo){
        view.printChangeReservationTableResult(tableNo, new Date());
    }

    @Override
    public void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        int reservationNo = model.changeReservationTable(oldReservation, reservationDate, tableNo, name);
        printChangeReservationTableResult(tableNo, reservationNo);
        
    }

}
