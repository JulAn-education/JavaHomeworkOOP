package Homework5;

import Homework5.models.TableModel;
import Homework5.presenters.BookingPresenter;
import Homework5.views.BookingView;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(model, view);

        bookingPresenter.loadTables();
        bookingPresenter.updateView();

        view.reservationTable(new Date(),2, "Станислав");

        /**
         * Метод должен заработать. ДЗ.
         */
        view.changeReservationTable(1001, new Date(), 3, "Станислав");
    }
}
