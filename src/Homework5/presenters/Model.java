package Homework5.presenters;

import Homework5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    public Collection<Table> loadTable();

    int reservationTable(Date reservationDate, int tableNo, String name);

    int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}
