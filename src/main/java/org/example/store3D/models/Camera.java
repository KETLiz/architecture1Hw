package org.example.store3D.models;

public class Camera {
    private Point3D location;
    private Angle3D angle;

    public void rotate(Angle3D angle) {
        this.angle = angle;
    }

    public void move(Point3D location) {
        this.location = location;
    }
}
