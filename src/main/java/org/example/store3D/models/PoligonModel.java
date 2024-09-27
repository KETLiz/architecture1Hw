package org.example.store3D.models;

import java.util.ArrayList;
import java.util.List;

public class PoligonModel {
    List<Poligon> poligons;
    List<Texture> textures;

    public PoligonModel(List<Poligon> poligons) {
        this.poligons = poligons;
    }

    public PoligonModel(List<Poligon> poligons, List<Texture> textures) {
        this.poligons = poligons;
        this.textures = textures;
    }

    public List<Poligon> getPoligons() {
        return poligons;
    }

    public List<Texture> getTextures() {
        return textures;
    }
}
