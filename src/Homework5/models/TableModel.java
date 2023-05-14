package Homework5.models;

import Homework5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {
    private Collection<Table> tables;

    /**
     * Получение списка всех столиков
     * @return столики
     */
    public Collection<Table> loadTable(){
        if (tables == null){
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
     * @param reservationDate дата брони
     * @param tableNo номер столика
     * @param name имя клиента
     * @return номер брони
     */
    public int reservationTable(Date reservationDate, int tableNo, String name){
        for (Table table: tables){
            if(table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
        //throw new RuntimeException("Невозможно забронировать столик.");
    }

    /**
     *Разработать самостоятельно
     */
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        for (Table table : tables){
            for (Reservation reservation: table.getReservations()){
                if (reservation.getId() == oldReservation){
                    Reservation newReservation = new Reservation(reservationDate, name);
                    table.getReservations().remove(reservation);
                    table.getReservations().add(newReservation);
                    return newReservation.getId();
                }
            }

        }

        return -1;
    }
}
