package homework7.observer;

public class Master implements Observer{

    private String name;
    private double salary;

    public Master(String name) {
        this.name = name;
        salary = 80000;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (this.salary < vacancy.getSalary()){
            System.out.printf("Мастер %s >>> Мне нужна эта работа! [%s - %.2f]\n",
                    name, vacancy.getNameCompany(), vacancy.getSalary());
            this.salary = vacancy.getSalary();
        }
        else{
            System.out.printf("Мастер %s >>> Я найду работу получше! [%s - %.2f]\n",
                    name, vacancy.getNameCompany(), vacancy.getSalary());
        }
    }
}
