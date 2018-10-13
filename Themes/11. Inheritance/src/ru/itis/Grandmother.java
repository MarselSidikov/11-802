package ru.itis;

/**
 * 13.10.2018
 * Grandmother
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Grandmother {
    private final static int DEFAULT_GRANDMOTHER_AGE = 32;

    private int age;
    private String name;
    protected int countOfGrandsons;

    public Grandmother(int age, String name, int countOfGrandsons) {
        if (age < DEFAULT_GRANDMOTHER_AGE) {
            this.age = DEFAULT_GRANDMOTHER_AGE;
        } else {
            this.age = age;
        }
        this.name = name;
        if (countOfGrandsons < 0) {
            this.countOfGrandsons = 0;
        } else {
            this.countOfGrandsons = countOfGrandsons;
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getCountOfGrandsons() {
        return countOfGrandsons;
    }

    public void feedGrandsons() {
        for (int i = 0; i < countOfGrandsons; i++) {
            System.out.println("Покушай, внучок, пельмешки, ватрушки, борщик, соленья, пирожки, пироги, компотика бидон, котлетки с макарошками нет с пюрешкой");
        }
    }
}
