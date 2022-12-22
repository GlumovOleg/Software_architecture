package HomeWork.HomeWork4.BusTikets;

import java.util.Collection;

public class Customer {

    private static int counter = 0;
    private final int id;
    private String name;
    private String lastName;
    private Collection<Ticket> tikets;

    public int getId() {
        return id;
    }

    public Collection<Ticket> getTikets() {
        return tikets;
    }

    public Customer(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setTikets(Collection<Ticket> tikets) {
        this.tikets = tikets;
    }

    {
        id = ++counter;
    }

}
