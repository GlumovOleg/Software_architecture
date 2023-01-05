package HomeWork.HomeWork8.MVP;

import java.util.Date;

import HomeWork.HomeWork8.MVP.models.BookingModel;
import HomeWork.HomeWork8.MVP.presenters.BookingPresenter;
import HomeWork.HomeWork8.MVP.views.BookingView;

public class App {
    public static void main(String[] args) {

        BookingModel bookingModel = new BookingModel();
        BookingView bookingView = new BookingView();

        BookingPresenter bookingPresenter = new BookingPresenter(bookingModel, bookingView);
        bookingPresenter.loadTables();
        bookingPresenter.updateView();


        System.out.println(" ");
        bookingView.reservationTable(new Date(), 2, "Oleg");
        System.out.println(" ");

        bookingView.changeReservationTable(1, new Date(), 2, "Oleg");

    }
}
