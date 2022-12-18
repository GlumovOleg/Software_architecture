package HomeWork.HomeWork3;

import Seminar.Seminar3.Features.CarTapy;
import Seminar.Seminar3.Features.FuelType;
import Seminar.Seminar3.Features.GearboxType;

public abstract class Car {

    // #region Methods

    private Refueling refuelingStation;

    public void setRefuelingStation(Refueling refuelingStation) {

        this.refuelingStation = refuelingStation;
    }

    public void fuel() {

        refuelingStation.fuel(fuelType);
    }

    // Движение
    public abstract void movement();

    // Обслуживание
    public abstract void maintenance();

    // Переключение передач
    public abstract boolean gearShifting();

    // Включение фар
    public abstract boolean switchHeadlights();

    // Включение дворников
    public abstract boolean switchWipers();

    // Включение противотуманных фар
    public boolean switchFogLights() {
        fogLights = !fogLights;
        return fogLights;
    }

    public void shipping() {
        System.out.printf("Автомобиль перевозит груз весом: %d кг. \n", loadCapacity);
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    // #endregion

    // #region Private Fields

    // Противотуманные фары (состояние)
    private boolean fogLights = false;

    // Вес перевозимого груза
    private int loadCapacity;

    // Марка
    private String make;
    // Модель
    private String model;
    // Цвет кузова
    private String color;
    // Тип кузова
    protected CarTapy carTapy;
    // Кол-во колёс
    protected int wheelsCount;
    // Тип топлива
    protected FuelType fuelType;
    // Тип кузова
    private GearboxType gearboxType;
    // Объём двигателя
    private double engineCapacity;

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public CarTapy getCarTapy() {
        return carTapy;
    }

    public void setCarTapy(CarTapy carTapy) {
        this.carTapy = carTapy;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public GearboxType getGearboxType() {
        return gearboxType;
    }

    public void setGearboxType(GearboxType gearboxType) {
        this.gearboxType = gearboxType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    // #endregion

}
