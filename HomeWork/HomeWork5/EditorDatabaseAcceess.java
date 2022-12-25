package HomeWork.HomeWork5;

import java.util.ArrayList;
import java.util.Collection;

import HomeWork.HomeWork5.Interfaces.DataBase;
import HomeWork.HomeWork5.Interfaces.DatabaseAccess;
import HomeWork.HomeWork5.Interfaces.Entity;



/**
 * Data Access Layer
 */
public class EditorDatabaseAcceess implements DatabaseAccess {

    private final DataBase editorDataBase;

    public EditorDatabaseAcceess(DataBase editorDataBase){
        this.editorDataBase = editorDataBase;
    }

    @Override
    public void addEntity(Entity entiry) {
        editorDataBase.getAll().add(entiry);
        
    }

    @Override
    public void removeEntitu(Entity entiry) {
        editorDataBase.getAll().remove(entiry);
        
    }

    /**
     * Получить список всех текстур
     */
    @Override
    public Collection<Texture> getAllTextures() {
        
        Collection<Texture> textures = new ArrayList<>();
        for (Entity entity : editorDataBase.getAll()) {
            if (entity instanceof Texture){
                textures.add((Texture)entity);
            }
        }

        return textures;
    }

    /**
     * Получить список всех моделей
     */
    @Override
    public Collection<Model3D> getAllModels() {
        
        Collection<Model3D> models = new ArrayList<>();
        for (Entity entity : editorDataBase.getAll()) {
            if (entity instanceof Model3D){
                models.add((Model3D)entity);
            }
        }
        return models;
    }
    
}
