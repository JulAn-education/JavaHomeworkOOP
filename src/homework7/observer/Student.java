package homework7.observer;

public class Student implements Observer {

    private String name;
    private double salary;

    public Student(String name) {
        this.name = name;
        salary = 5000;
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (this.salary < vacancy.getSalary()){
            System.out.printf("Студент %s >>> Мне нужна эта работа! [%s - %.2f]\n",
                    name, vacancy.getNameCompany(), vacancy.getSalary());
            this.salary = vacancy.getSalary();
        }
        else{
            System.out.printf("Студент %s >>> Я найду работу получше! [%s - %.2f]\n",
                    name, vacancy.getNameCompany(), vacancy.getSalary());
        }
    }
}
