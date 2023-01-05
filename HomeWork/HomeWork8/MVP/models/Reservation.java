package HomeWork.HomeWork8.MVP.models;

import java.util.Date;

public class Reservation {
    
    private static int posetitel;

    private final int id;
    private Date date;
    private String name;

    {
        id = ++posetitel;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public Reservation(Date date, String name) {
        this.date = date;
        this.name = name;
    }

    

}
