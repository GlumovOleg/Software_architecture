package HomeWork.HomeWork8.MVP.views;

import java.util.Collection;
import java.util.Date;

import HomeWork.HomeWork8.MVP.interfaces.View;
import HomeWork.HomeWork8.MVP.interfaces.ViewObserver;
import HomeWork.HomeWork8.MVP.models.Table;

public class BookingView implements View {

    private ViewObserver observer;

    /**
     * Отобразить список столиков
     * 
     * @param tables столики
     */
    public void showTable(Collection<Table> tables) {
        for (Table table : tables) {
            System.out.println(table);
        }
    }

    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;

    }

    /**
     * Действия пользователя (пользователь нажал на кнопку бронирования),
     * бронирование столика
     * 
     * @param reservaitonDate дата бронирования
     * @param tableNo         номер столика
     * @param name            имя клиента
     */
    public void reservationTable(Date reservaitonDate, int tableNo, String name) {
        observer.onReservationTable(reservaitonDate, tableNo, name);
    }

    // TODO: Домашняя работа:
    // доработать метод changeReservationTable, протянуть возможность изменения
    // резерва столика
    // на уровне компонент BookingPresenter и BookingModel.
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        observer.onChangeReservationTable(oldReservation, reservationDate, tableNo, name);
    }

    public void printChangeReservationTableResult(int tableNo, Date reservationDate) {
        System.out.printf("Столик #%d успешно перебронирован. Новая дата: #%s\n", tableNo, reservationDate);
    }

    public void printReservationTableResult(int tableNo, int reservationNo) {
        System.out.printf("Столик #%d успешно забронирован. Номер вашей брони: #%d\n", tableNo, reservationNo);
    }

}
