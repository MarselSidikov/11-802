package ru.itis;

/**
 * 01.10.2018
 * SomeClass
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class SomeClass {
    public int someField;

    public static int someStaticField;

    static {
        someStaticField = 100;
    }

    public SomeClass(int someField) {
        this.someField = someField;
    }

    public void sum(SomeClass other) {
        this.someField += other.someField;
    }

    public static SomeClass sum(SomeClass a, SomeClass b) {
        return new SomeClass(a.someField + b.someField);
    }

    public static void print() {
        System.out.println(someStaticField);
    }
}
