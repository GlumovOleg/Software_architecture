package HomeWork.HomeWork1;

import HomeWork.HomeWork1.InMemoryModel.ModelStore;
import HomeWork.HomeWork1.ModelElements.Angle3D;
import HomeWork.HomeWork1.ModelElements.Camera;
import HomeWork.HomeWork1.ModelElements.Flash;
import HomeWork.HomeWork1.ModelElements.Point3D;
import HomeWork.HomeWork1.ModelElements.Poligon;
import HomeWork.HomeWork1.ModelElements.PoligonalModel;
import HomeWork.HomeWork1.ModelElements.Scene;
import HomeWork.HomeWork1.ModelElements.Texture;

public class App 
{
    public static void main( String[] args )
    {
        Poligon Poligon = new Poligon(new Point3D());
        Poligon.addPoint(new Point3D(1, 2, 3));
        Poligon.addPoint(new Point3D(4, 5, 6));

        PoligonalModel PoligonalModel = new PoligonalModel(null);
        PoligonalModel.addPoligon(Poligon);
        // PoligonalModel.addTexture(Texture);

        Flash flash = new Flash(new Point3D(), new Angle3D(), 0);

        Camera camera = new Camera(new Point3D(), new Angle3D());

        Scene scene = new Scene(PoligonalModel, camera);
        scene.addFlash(flash);

        ModelStore modelStore = new ModelStore(scene);
        Scene newScene = new Scene(PoligonalModel, camera);
        modelStore.addScene(newScene);
    }
}