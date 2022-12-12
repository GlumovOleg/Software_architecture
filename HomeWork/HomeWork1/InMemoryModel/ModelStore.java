package HomeWork.HomeWork1.InMemoryModel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import HomeWork.HomeWork1.ModelElements.Camera;
import HomeWork.HomeWork1.ModelElements.Flash;
import HomeWork.HomeWork1.ModelElements.PoligonalModel;
import HomeWork.HomeWork1.ModelElements.Scene;

public class ModelStore implements ModelChenger {
    private final List<ModelChengeObserver> changeObservers = new ArrayList<>();
    private Set<PoligonalModel> models;
    private Set<Flash> flashes;
    private Set<Camera> cameras;

    private final Set<Scene> scenes = new HashSet<>();

    public ModelStore(Scene scene) {

        this.scenes.add(scene);
    }

    public Scene getScene(UUID uuid) {
        return scenes.stream()
                .filter(x -> x.getId().equals(uuid))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No scene found"));
    }


    public boolean addScene(Scene scene) {
        if (scenes.add(scene)) {
            this.NotifyChanger(this);
            return true;
        }
        return false;
    }


    @Override
    public void RigisterModelChenger(ModelChengeObserver o) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void RemoveModelChenger(ModelChengeObserver o) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void NotifyChanger(ModelStore o) {
        // TODO Auto-generated method stub
        
    }
}