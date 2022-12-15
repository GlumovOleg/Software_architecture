package HomeWork.HomeWork2;

/**
 * Работник (базовый класс)
 */
public abstract class Employee {
    protected String name;
    protected String lastName;
    /**
     * ставка з/п сотрудника
     */
    protected double salary;


    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, String lastName, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }
    
    /*
     * Расчёт среднемесячной з/п
     */
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return super.toString();
    }
}
