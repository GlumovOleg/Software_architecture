package HomeWork.HomeWork5;

import java.util.ArrayList;

import HomeWork.HomeWork5.Interfaces.BusinessLogicalLayer;
import HomeWork.HomeWork5.Interfaces.DataBase;
import HomeWork.HomeWork5.Interfaces.DatabaseAccess;
import HomeWork.HomeWork5.Interfaces.UILayer;

public class Editor3D implements UILayer {

    private ProjectFile projectFile;
    private DatabaseAccess databaseAccess;
    private BusinessLogicalLayer businessLogicalLayer;
    private DataBase dataBase;

    private void checkProjectFile() {
        if (projectFile == null) {
            throw new RuntimeException("Файл прокета не определён.");
        }
    }

    @Override
    public void openProject(String fileName) {

        projectFile = new ProjectFile(fileName);
        dataBase = new EditorDatabase(projectFile);
        databaseAccess = new EditorDatabaseAcceess(dataBase);
        businessLogicalLayer = new EditorBusinessLogicalLayer(databaseAccess);
    }

    @Override
    public void showProjectSettings() {

        // Предусловие
        checkProjectFile();

        System.out.println("*** Project v1 ***");
        System.out.println("*******************");
        System.out.printf("fileName: %s\n", projectFile.getFilename());
        System.out.printf("setting1: %s\n", projectFile.getSetting1());
        System.out.printf("setting2: %s\n", projectFile.getSetting2());
        System.out.printf("setting3: %s\n", projectFile.getSetting3());
        System.out.println("*******************");

    }

    @Override
    public void saveProject() {
        // TODO Auto-generated method stub

    }

    @Override
    public void printAllModels() {

        // Предусловие
        checkProjectFile();

        ArrayList<Model3D> models = (ArrayList<Model3D>) businessLogicalLayer.getAllModel();
        for (int i = 0; i < models.size(); i++) {
            System.out.printf("===%d===", i);
            System.out.println(models.get(i));
            for (Texture texture : models.get(i).getTextures()) {
                System.out.printf("\t%s\n", texture);
            }
        }

    }

    @Override
    public void printAllTextures() {

        // Предусловие
        checkProjectFile();

        ArrayList<Texture> textures = (ArrayList<Texture>) businessLogicalLayer.getAllTextures();
        for (int i = 0; i < textures.size(); i++) {
            System.out.printf("===%d===\n", i);
            System.out.println(textures.get(i));
        }
    }

    @Override
    public void renderModel(int i) {

        // Предусловие
        checkProjectFile();

        // Предусловие
        ArrayList<Model3D> models = (ArrayList<Model3D>) businessLogicalLayer.getAllModel();
        if (i < 0 || i > models.size() - 1) {
            throw new RuntimeException("Номер модели указан не корректно.");
        }

        System.out.println("Подождите...");
        long startTime = System.currentTimeMillis();
        businessLogicalLayer.renderModel(models.get(i));
        long endTime = (System.currentTimeMillis() - startTime);
        System.out.printf("Операция выполнена за %d мс.\n", endTime);

    }

    @Override
    public void renderAll() {

        // Предусловие
        checkProjectFile();

        System.out.println("Подождите...");
        long startTime = System.currentTimeMillis();
        businessLogicalLayer.renderAllModels();
        long endTime = (System.currentTimeMillis() - startTime);
        System.out.printf("Операция выполнена за %d мс.\n", endTime);
    }

}
