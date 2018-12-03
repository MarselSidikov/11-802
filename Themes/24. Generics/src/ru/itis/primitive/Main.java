package ru.itis.primitive;

public class Main {

    public static void main(String[] args) {
        IntegerArrayList integerArrayList = new IntegerArrayList();
        integerArrayList.add(4);
        integerArrayList.add(5);
        integerArrayList.add(7);

        System.out.println(integerArrayList.get(0));
        System.out.println(integerArrayList.get(1));
        System.out.println(integerArrayList.get(2));

        StringArrayList stringArrayList = new StringArrayList();
        stringArrayList.add("Марсель");
        stringArrayList.add("Пошел");
        stringArrayList.add("Учить");

        System.out.println(stringArrayList.get(0));
        System.out.println(stringArrayList.get(1));
        System.out.println(stringArrayList.get(2));
    }
}
