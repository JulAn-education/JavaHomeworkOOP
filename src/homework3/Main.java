package homework3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    private static Random random = new Random();

    /**
     * Переработать метод generateEmployee().
     * Метод должен возвращать сотрудника разного типа (Worker, Freelancer)
     * @return
     */


    public static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        Employee[] employees = {new Worker(), new Freelancer()};

        int salary = random.nextInt(900, 1500);
        int salaryIndex = random.nextInt(28,31);
        Employee employee = employees[random.nextInt(2)];
        employee.setFirstName(names[random.nextInt(10)]);
        employee.setSurName(surnames[random.nextInt(10)]);
        employee.setSalary(salary * salaryIndex);
        employee.setAge(random.nextInt(18, 40));
        return employee;
    }


    public static void main(String[] args) {

//        Worker worker = new Worker("Глеб", "Григорьев", 120000);
//        System.out.println(worker);

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++){
            employees[i] = generateEmployee();
        }
        for (Employee employee: employees) {
            System.out.println(employee);
        }

        //Arrays.sort(employees, new SalaryComparator());
        //Arrays.sort(employees, new SurNameComparator());
        //Arrays.sort(employees);
        Arrays.sort(employees, new AgeComparator());

        System.out.println("\n*** Отсортированный массив сотрудников ***\n");

        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }
}


abstract class Employee implements Comparable<Employee>{
    protected String firstName;
    protected String surName;
    protected double salary;
    protected int age;

    public Employee(String firstName, String surName, double salary, int age) {
        this.firstName = firstName;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    public Employee() {

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract double calculateSalary();


    @Override
    public String toString() {
        return String.format("Сотрудник: %s %s; Возраст: %d; Ставка: %.2f; Среднемесячная зарплата: %.2f;",
                surName, firstName, age, salary, calculateSalary());
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(calculateSalary(), o.calculateSalary());
    }
}

class SalaryComparator implements Comparator<Employee>{
    //
    @Override
    public int compare(Employee o1, Employee o2) {

        //return Double.compare(o1.calculateSalary(), o2.calculateSalary());
        return Double.compare(o2.calculateSalary(), o1.calculateSalary());

//        return o1.calculateSalary() == o2.calculateSalary() ? 0 :
//                (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);
    }
}

class SurNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        return o1.surName.compareTo(o2.surName);
    }
}

class AgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o2.age, o1.age);
    }
}

class Worker extends Employee{

    public Worker(String firstName, String surName, double salary, int age) {
        super(firstName, surName, salary, age);
    }

    public Worker() {

    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; %d; Рабочий; Среднемесячная зарплата: %.2f;",
                surName, firstName, age, calculateSalary());
    }
}


/**
 * Разработать самостоятельно
 */
class Freelancer extends Employee{

    public Freelancer(String firstName, String surName, double salary, int age) {
        super(firstName, surName, salary, age);
    }

    public Freelancer() {
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; %d; Фрилансер; Среднемесячная зарплата: %.2f;",
                surName, firstName, age, calculateSalary());
    }

}
