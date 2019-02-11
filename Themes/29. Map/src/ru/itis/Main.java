package ru.itis;

public class Main {

    public static void main(String[] args) {
	    Map<String, Integer> ages = new PrimitiveMapImpl<>();
	    ages.put("Марсель", 25);
	    ages.put("Дамир", 20);
	    ages.put("Айрат", 20);
	    ages.put("Аделя", 19);
	    ages.put("Марк", 17);
	    ages.put("Камилла", 18);
	    ages.put("Даниил", 19);
	    ages.put("Даниил", 18);

        System.out.println(ages.get("Камилла"));
        System.out.println(ages.get("Аделя"));
        System.out.println(ages.get("Марсель"));
        System.out.println(ages.get("Айрат"));
        System.out.println(ages.get("Дамир"));

        String marsel = "Марсель";
        System.out.println(marsel.hashCode());
    }
}
