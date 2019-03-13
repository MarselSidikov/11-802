package ru.itis;

/**
 * 13.03.2019
 * EXAMPLE_WITH_ТРИ_ТОЧКИ
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class EXAMPLE_WITH_ТРИ_ТОЧКИ {

    public static void some(String name, int ... anotherArgs) {
//        System.out.println(anotherArgs[0]);
    }

    public static void some2(int anotherArgs[]) {

    }

    public static void main(String[] args) {
        int array[] = {2, 3, 4};
        some2(array);
        some("Марсель", 2, 3, 5);
        some("Марсель", 2, 3, 5, 7, 8);
        some("Марсель");
    }
}
