package HomeWork.HomeWork2;

public class FreeLance extends Employee {

    public FreeLance(String name, String lastName, double salary) {
        super(name, lastName, salary);
    }

    @Override
    public double calculateSalary() {
        return 16 * 6 * salary;
    }

    @Override
    public String toString() {
        return "Фрилансер : " + name + " "
         + lastName + ", Среднемесячная заработная плата(сдельная оплата): " 
         + calculateSalary() + "(руб.)" + ", Почасовая ставка: " 
         + salary + "(руб.)";
    }
    
}
