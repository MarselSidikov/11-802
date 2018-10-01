package ru.itis;

public class Main {

    public static void main(String[] args) {
	    SomeClass object1 = new SomeClass(10);
	    object1.someStaticField = 20;
	    SomeClass object2 = new SomeClass(15);
		object2.someStaticField = 30;
	    int i = 0;
	    SomeClass.someStaticField = 50;
	    // SomeClass.someField;
	    object1.someField = 10;
		System.out.println(object2.someStaticField);

		object1.sum(object2);
		System.out.println(object1.someField);

		SomeClass object3 = SomeClass.sum(object1, object2);

    }
}
