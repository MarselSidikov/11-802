package ru.itis.shapes;

/**
 * 17.10.2018
 * Sphere
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Sphere extends Shape implements Scalable, Movable {
    private double radius;

    public Sphere(double x, double y, double z, double radius) {
        super(x, y, z);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void scale(double value) {
        this.radius = this.radius * value;
    }

    @Override
    public void moveByX(double x) {
        this.x = x;
    }

    @Override
    public void moveByY(double y) {
        this.y = y;
    }

    @Override
    public void moveByZ(double z) {
        this.z = z;
    }

    @Override
    public void move(double x, double y, double z) {
        moveByX(x);
        moveByY(y);
        moveByZ(z);
    }
}
