package Homework5.presenters;

import Homework5.models.Table;

import java.util.Collection;

public interface View {


    /**
     * Отобразить список всех столиков
     * @param tables столики
     */
    void showTables(Collection<Table> tables);


    /**
     * Установить наблюдателя, отслеживающего действия пользователя
     * @param observer наблюдатель
     */
    void setObserver(ViewObserver observer);


    /**
     * Отобразить результат резерва столика
     * @param reservationId номер брони
     */
    void showReservationTableStatus(int reservationId);
}
