package ru.itis;

public class Main {

    public static void main(String[] args) {
	    Object object = new Human("Марсель", 24, 1.85);
        System.out.println(object);

        Human kamilla = new Human("Камилла", 18, 1.58);
        System.out.println(kamilla);

        Human otherKamilla = kamilla;

        System.out.println(otherKamilla == kamilla);

        Human elseKamilla = new Human("Камилла", 18, 1.58);

        System.out.println(elseKamilla == kamilla);

        System.out.println(elseKamilla.equals(kamilla));

    }
}
