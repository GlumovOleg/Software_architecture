package HomeWork.HomeWork5;

import java.util.Collection;
import java.util.Random;

import HomeWork.HomeWork5.Interfaces.BusinessLogicalLayer;
import HomeWork.HomeWork5.Interfaces.DatabaseAccess;

/**
 * Базовая бизнес-логика
 * Описываю реализацию конкретных функций приложения.
 */
public class EditorBusinessLogicalLayer implements BusinessLogicalLayer {
    
    private final DatabaseAccess databaseAccess;
    private Random random = new Random();

    public EditorBusinessLogicalLayer(DatabaseAccess databaseAccess) {
        this.databaseAccess = databaseAccess;
    }

    @Override
    public Collection<Model3D> getAllModel() {
        return databaseAccess.getAllModels();
    }

    @Override
    public Collection<Texture> getAllTextures() {
        return databaseAccess.getAllTextures();
    }

    @Override
    public void renderModel(Model3D model) {
        processRender(model);
    }

    @Override
    public void renderAllModels() {
        for (Model3D model : getAllModel()) {
            processRender(model);
        }

    }

    private void processRender(Model3D model) {
        try {
            Thread.sleep(2500 - random.nextInt(2001));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
