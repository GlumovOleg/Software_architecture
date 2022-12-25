package HomeWork.HomeWork5;

import java.util.ArrayList;
import java.util.Collection;

import HomeWork.HomeWork5.Interfaces.Entity;



/** 3D модель */
public class Model3D implements Entity {

    private static int counter = 1000;
    private int id;

    private Collection<Texture> textures = new ArrayList<>();

    public Collection<Texture> getTextures() {
        return textures;
    }

    public int getId() {
        return id;
    }

    {
        id = ++counter;
    }

    @Override
    public String toString() {
        return String.format("Model #%s", id);
    }

    

}
