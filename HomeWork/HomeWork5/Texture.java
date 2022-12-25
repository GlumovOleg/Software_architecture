package HomeWork.HomeWork5;

import HomeWork.HomeWork5.Interfaces.Entity;

/**  Текстура модели */
public class Texture implements Entity{

    private static int counter = 5000;

    private int id;

    public int getId() {
        return id;
    }

    {
        id = ++counter;
    }

    @Override
    public String toString() {
        return String.format("Texture #%s", id);
    }

}
