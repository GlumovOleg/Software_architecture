package HomeWork.HomeWork3;

import Seminar.Seminar3.Features.FuelType;

/*
 * Заправочная станция
 */
public class RefuelingStation implements Refueling {
    
    public void fuel(FuelType fuelType){
        switch (fuelType) {
            case Gasoline:
                System.out.println("Заправка 98 бензином");
                break;
            case Diesel:
                System.out.println("Заправка дизилем");
                break;
        }
    }
}

class RefuelingStation1 implements Refueling {
    
    public void fuel(FuelType fuelType){
        switch (fuelType) {
            case Gasoline:
                System.out.println("Заправка 95 бензином");
                break;
            case Diesel:
                System.out.println("Заправка дизелем");
                break;
        }
    }
}

class RefuelingStation2 implements Refueling{
    
    public void fuel(FuelType fuelType){
        switch (fuelType) {
            case Gasoline:
                System.out.println("Заправка 98 бензином");
            case Diesel:
                // throw new RuntimeException("Дизельное топливо отсутствует");
                System.out.println("Заправка дизелем не возможна");
                break;
        }
    }
}

