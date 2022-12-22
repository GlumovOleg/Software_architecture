package HomeWork.HomeWork4.BusTikets;

import java.util.Date;

public class Order {
    
    private Date date;
    private double amount;
    private boolean orderBeenPaid = false;

    public boolean setOrderBeenPaid(){
        return orderBeenPaid;
    }
    
    public void setOrderBeenPaid(boolean orderBeenPaid) {
        this.orderBeenPaid = orderBeenPaid;
    }

    public Order(Date date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    

}
