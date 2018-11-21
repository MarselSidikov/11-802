package ru.itis;

public class Main {

    public static void main(String[] args) {
        // оберточный тип Integer

        // boxing - оборачивание примитивного значения
        // в объект класса-обертки
	    // Integer i1 = new Integer(10);

        // autoboxing
        Integer i1 = 10;

        // unboxing
//        int i2 = i1.intValue();

        // autounboxing
        int i2 = i1;

        Integer i3 = null;

        int i4 = i3;
    }
}
