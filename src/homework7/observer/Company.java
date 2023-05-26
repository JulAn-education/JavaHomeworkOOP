package homework7.observer;
import java.util.Random;
/**
 * Компания
 */

public class Company {

    private Random random;
    private String nameCompany;
    private double maxSalary;
    private Vacancy vacancy;

    private Publisher jobAgency;

    public Company(String nameCompany, double maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        vacancy = new Vacancy(nameCompany);
        random = new Random();
    }

    public void needEmployee(){
        double salary = random.nextDouble(3000, maxSalary);
        vacancy.setSalary(salary);
        jobAgency.sendOffer(vacancy);
    }
}
