package ru.itis.generics;

/**
 * 03.12.2018
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {

    public static void printWithoutSpace(GenericArrayList<String> strings) {
            for (int i = 0; i < 2; i++) {
                System.out.println(strings.get(i).replace(" ", ""));
            }
    }

    public static void main(String[] args) {
        GenericArrayList<Integer> integerGenericArrayList = new GenericArrayList<>();
        integerGenericArrayList.add(12);
        integerGenericArrayList.add(13);
        integerGenericArrayList.add(14);
//        integerGenericArrayList.add("Hello");
        int valueFromList = integerGenericArrayList.get(2);

        GenericArrayList<String> stringGenericArrayList = new GenericArrayList<>();
        stringGenericArrayList.add("При в ет");
        stringGenericArrayList.add("Мар сель");
//        stringGenericArrayList.add(14);
        printWithoutSpace(stringGenericArrayList);
//        printWithoutSpace(integerGenericArrayList);
    }
}
