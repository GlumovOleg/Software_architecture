package HomeWork.HomeWork2;

public class App extends CreatorWorkers {

    public static void main(String[] args) {

        Worker worker1 = new Worker("Олег", "Глумов", 75000);
        System.out.println(worker1);
        FreeLance freeLance1 = new FreeLance("Дмитрий", "Иванов", 1000);
        System.out.println(freeLance1);

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

}
