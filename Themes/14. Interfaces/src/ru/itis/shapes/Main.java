package ru.itis.shapes;

public class Main {

    public static void main(String[] args) {
        Point point = new Point(3, 3, 3);
        Box box = new Box(1, 1, 1, 10, 10, 15);
        Sphere sphere = new Sphere(10, 10, 10, 5);

        Movable movables[] = {box, sphere, point};

        for (Movable movable : movables) {
            movable.move(10, 10, 10);
        }

        Scalable scalables[] = {box, sphere};
        Shape shapes[] = {point, box, sphere};
    }
}
