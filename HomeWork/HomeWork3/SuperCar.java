package HomeWork.HomeWork3;

import Seminar.Seminar3.Features.FuelType;

public class SuperCar extends Car implements Washing {

    public SuperCar() {
        wheelsCount = 3;
        fuelType = FuelType.Gasoline;
    }

    public void fly(){
        System.out.println("Автомобиль взлетел!");
    }

    @Override
    public void movement() {
        fly();
        
    }

    @Override
    public void maintenance() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean gearShifting() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean switchWipers() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void wipMirrors() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void wipWindshield() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void wipHeadlights() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void fuel() {
        // TODO Auto-generated method stub
        
    }
    
}
