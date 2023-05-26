package homework7.observer;

public class Specialist implements Observer{

    private String name;
    private double salary;

    public Specialist(String name) {
        this.name = name;
        salary = 50000;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (this.salary < vacancy.getSalary()){
            System.out.printf("Специалист %s >>> Мне нужна эта работа! [%s - %.2f]\n",
                    name, vacancy.getNameCompany(), vacancy.getSalary());
            this.salary = vacancy.getSalary();
        }
        else{
            System.out.printf("Специалист %s >>> Я найду работу получше! [%s - %.2f]\n",
                    name, vacancy.getNameCompany(), vacancy.getSalary());
        }
    }

}
