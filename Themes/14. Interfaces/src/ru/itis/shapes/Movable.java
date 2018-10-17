package ru.itis.shapes;

/**
 * 17.10.2018
 * Movable
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface Movable extends MovableByDirection {
    void moveByX(double x);
    void moveByY(double y);
    void moveByZ(double z);
}
