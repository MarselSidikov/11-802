package ru.itis;

public class Main {

    public static void main(String[] args) {
	    Fox fox = new Fox("Алиса", 10);
	    Mouse mouse = new Mouse("Мыш", 0.5);
	    Student student = new Student("НеМарк", 63);

	    // Animal animal = new Animal("Нечто", 90);

	    Animal a1 = fox;
	    Animal a2 = mouse;
	    Animal a3 = student;
	    // Animal a4 = animal;

	    // Animal animals[] = {a1, a2, a3};
        Animal animals[] = {fox, mouse, student};

	    for (int i = 0; i < animals.length; i++) {
	    	animals[i].sound();
		}
    }
}
