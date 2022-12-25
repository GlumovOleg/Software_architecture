package HomeWork.HomeWork5.Interfaces;

/**
 * User Interface Layer
 */

public interface UILayer {

    void openProject(String fileName);
    void showProjectSettings();
    void saveProject();
    void printAllModels();
    void printAllTextures();
    void renderModel(int i);
    void renderAll();
}
