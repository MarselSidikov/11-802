package ru.itis.shapes;

/**
 * 17.10.2018
 * Point
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Point extends Shape implements Movable {

    public Point(double x, double y, double z) {
        super(x, y, z);
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
