package HomeWork.HomeWork3;

public class STO {
    public static double calculateMaintenance(Car car){

        if(car.getWheelsCount() == 6){
            return 6 * 900;
        }
        else {
            return 4*1000;
        }

    }
}
