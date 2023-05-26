package homework7.observer;

public class Vacancy {
    private String nameCompany;
    private double salary;

    public Vacancy(String nameCompany) {
        this.nameCompany = nameCompany;

    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s, %f", nameCompany, salary);
    }
}
