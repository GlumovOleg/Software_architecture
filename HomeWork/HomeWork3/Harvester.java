package HomeWork.HomeWork3;

import Seminar.Seminar3.Features.FuelType;

public class Harvester extends Car implements Washing {

    public Harvester(){
        wheelsCount = 6;
        fuelType = FuelType.Diesel;
    }

    @Override
    public void shipping() {
        super.shipping();
    }

    public void sweeping() {
        System.out.println("Автомобиль моет улицу.  ");
    }

    @Override
    public void movement() {
        // TODO Auto-generated method stub

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

}
