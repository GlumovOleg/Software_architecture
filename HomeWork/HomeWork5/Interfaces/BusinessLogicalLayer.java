package HomeWork.HomeWork5.Interfaces;

import java.util.Collection;


import HomeWork.HomeWork5.Model3D;
import HomeWork.HomeWork5.Texture;

/**
 * Базовая бизнес-логика
 */
public interface BusinessLogicalLayer {
    
    Collection<Model3D> getAllModel();
    Collection<Texture> getAllTextures();

    void renderModel(Model3D model);
    void renderAllModels();


}
