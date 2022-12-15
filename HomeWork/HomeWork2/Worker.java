package HomeWork.HomeWork2;

public class Worker extends Employee {

    public Worker(String name, String lastName, double salary) {
        super(name, lastName, salary);
    }

    @Override
    public double calculateSalary() {
        return 21 * 8 * salary;
    }

    @Override
    public String toString() {
        return  "Рабочий : " + name + " "
          + lastName + ", Среднемесячная заработная плата(фиксированная оплата): " 
          + calculateSalary() + "(руб.)";
    }
    
}
