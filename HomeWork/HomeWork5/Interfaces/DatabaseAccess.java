package HomeWork.HomeWork5.Interfaces;

import java.util.Collection;


import HomeWork.HomeWork5.Model3D;
import HomeWork.HomeWork5.Texture;


/** Data Access Layer */

public interface DatabaseAccess {

    void addEntity(Entity entiry);
    void removeEntitu(Entity entiry);
    Collection<Texture> getAllTextures();
    Collection<Model3D> getAllModels();

    
}
