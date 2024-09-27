package org.example.store3D.inmemory;

public interface ModelChanger {

    void notifyChange();

    void registerModelChanger(ModelChangedObserver observer);

    void removeModelChanger(ModelChangedObserver observer);
}
