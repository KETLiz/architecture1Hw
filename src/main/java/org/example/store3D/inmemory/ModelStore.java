package org.example.store3D.inmemory;

import org.example.store3D.models.Camera;
import org.example.store3D.models.Flash;
import org.example.store3D.models.PoligonModel;
import org.example.store3D.models.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements ModelChanger {

    private List<ModelChangedObserver> observers = new ArrayList<>();
    private List<PoligonModel> models = new ArrayList<>();
    private List<Flash> flashes = new ArrayList<>();
    private List<Scene> scenes = new ArrayList<>();
    private List<Camera> cameras = new ArrayList<>();

    public void add(PoligonModel model) {
        models.add(model);
        notifyChange();
    }

    @Override
    public void notifyChange() {
        for(ModelChangedObserver observer : observers) {
            observer.applyUpdateModel();
        }
    }

    @Override
    public void registerModelChanger(ModelChangedObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeModelChanger(ModelChangedObserver observer) {
        observers.remove(observer);
    }
}
