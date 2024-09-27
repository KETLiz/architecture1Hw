package org.example.store3D;

import org.example.store3D.inmemory.ModelStore;
import org.example.store3D.inmemory.Observer1;
import org.example.store3D.models.Poligon;
import org.example.store3D.models.PoligonModel;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Observer1 observer1 = new Observer1();

        ModelStore store = new ModelStore();
        store.registerModelChanger(observer1);

        Poligon poligon = new Poligon();
        List<Poligon> poligons = new ArrayList<>();

        PoligonModel model = new PoligonModel(poligons);
        store.add(model);
    }
}
