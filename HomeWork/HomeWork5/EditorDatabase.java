package HomeWork.HomeWork5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import HomeWork.HomeWork5.Interfaces.DataBase;
import HomeWork.HomeWork5.Interfaces.Entity;


/** БАза данных всех сущностей проекта Darabase Layer */

public class EditorDatabase implements DataBase {

    private final ProjectFile projectFile;
    
    private Collection<Entity> entities;
    private Random random = new Random();

    public EditorDatabase (ProjectFile projectFile){
        this.projectFile = projectFile;
        load();
    }

    @Override
    public void load() {
        // TODO Загрузка всех сущностей проекта (модели, текстуры)
        
    }

    @Override
    public void save() {
        // TODO Сохранение всех сущностей проекта (модели, текстуры)
        
    }


    @Override
    public Collection<Entity> getAll() {
        if (entities == null){
            entities = new ArrayList<>();

            int modelCount = 10 - random.nextInt(6);
            for (int i = 0; i < modelCount; i++) {
                generateModelAndTextures();
            }

        }
        return entities;
    }


    private void generateModelAndTextures(){
        Model3D model = new Model3D();
        int textureCount = random.nextInt(3);
        for (int i = 0; i < textureCount; i++) {
            Texture texture = new Texture();
            model.getTextures().add(texture);
            entities.add(texture);
        }
        entities.add(model);
    }
    
}
