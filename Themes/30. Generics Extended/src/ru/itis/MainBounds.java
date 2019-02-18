package ru.itis;

import java.util.ArrayList;
import java.util.List;

/**
 * 18.02.2019
 * MainBounds
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainBounds {

    public static int sumOfAll(List<? extends Number> numbers) {
        int result = 0;
        for (Number number : numbers) {
            result += number.intValue();
        }
        return result;
    }

    public static void addValues(List<? super Integer> numbers) {
        for (int i = 0; i < 10; i++) {
            numbers.add(20);
        }

//        int i = numbers.get(0);
    }


    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(17);
        List superList = integers;
        superList.add(17);
        int value = (int)superList.get(0);
        System.out.println(value);

        // List<Number> numbers = integers;
        List<?> something = integers;
//        something.add(17);
//        something.add("Hello");
//        something.add(new Object());
        Object o = something.get(0);


    }
}
