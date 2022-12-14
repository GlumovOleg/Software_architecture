package HomeWork.HomeWork1.ModelElements;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Scene {
    private final UUID id;
    private final Set<PoligonalModel> models;
    private final Set<Flash> flashes;
    private final Set<Camera> cameras;

    public Scene(PoligonalModel model, Camera camera) {
        this.id = UUID.randomUUID();
        this.models = new HashSet<>();
        this.flashes = new HashSet<>();
        this.cameras = new HashSet<>();
        this.models.add(model);
        this.cameras.add(camera);
    }

    public boolean addModel(PoligonalModel model) {
        return models.add(model);
    }

    public boolean removeModel(PoligonalModel model) {
        return models.remove(model);
    }

    public boolean addFlash(Flash flash) {
        return flashes.add(flash);
    }

    public boolean removeFlash(Flash flash) {
        return flashes.remove(flash);
    }

    public boolean addCamera(Camera camera) {
        return cameras.add(camera);
    }

    public boolean removeCamera(Camera camera) {
        return cameras.remove(camera);
    }

    public UUID getId() {
        return id;
    }

    public Set<PoligonalModel> getModels() {
        return models;
    }

    public Set<Flash> getFlashes() {
        return flashes;
    }
}