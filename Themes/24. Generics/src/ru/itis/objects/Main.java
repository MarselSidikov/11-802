package ru.itis.objects;

/**
 * 03.12.2018
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        ObjectArrayList stringArrayList = new ObjectArrayList();

        stringArrayList.add("Марсель");
        stringArrayList.add("Пошел");
        stringArrayList.add("Гулять");

        String stringValueFromList = (String)stringArrayList.get(2);

        ObjectArrayList integerArrayList = new ObjectArrayList();

        integerArrayList.add(4);
        integerArrayList.add(5);
        integerArrayList.add(7);

        int integerValueFromList = (int)integerArrayList.get(2);

        System.out.println(stringValueFromList);
        System.out.println(integerValueFromList);

        integerArrayList.add("Марсель ломает систему");

        integerValueFromList = (int)integerArrayList.get(3);
    }
}
