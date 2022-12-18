package HomeWork.HomeWork3;

import Seminar.Seminar3.Features.FuelType;

/*
 * Заправочная станция (интерфейс)
 */

public interface Refueling {

    // заправка
    void fuel(FuelType fuelType);

}

/*
 * Мойка
 */
interface Washing {

    // протирка зеркал
    void wipMirrors();

    // протирка лобового стекла
    void wipWindshield();

    // протирка фар
    void wipHeadlights();
}