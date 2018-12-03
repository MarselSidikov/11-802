package ru.itis.shapes;

/**
 * 17.10.2018
 * Box
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Box extends Shape implements Scalable, Movable {

    private double height;
    private double width;
    private double length;

    public Box(double x, double y, double z, double height, double width, double length) {
        super(x, y, z);
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public void scale(double value) {
        this.width = this.width * value;
        this.height = this.height * value;
        this.length = this.length * value;
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
