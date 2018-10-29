package ru.itis;

public class Main {

    public static void main(String[] args) {
        ObjectsArrayList list = new ObjectsArrayList();
        list.add("Marsel");
        list.add("Rimma");
        list.add("Mark");
        list.add("Kamilla");
        list.add("Veronika");

        Iterator iterator = list.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
