package homework7.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Агенство по поиску сотрудников
 */

public class JobAgency implements Publisher {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Реализация рассылки сообщений
     * @param nameCompany
     * @param salary
     */
    @Override
    public void sendOffer(Vacancy vacancy) {
        for (Observer observer : observers){
            observer.receiveOffer(vacancy);
        }
    }
}
