package ru.itis;

public class Main {

    public static void main(String[] args) {
	    Grandmother grandmother =
                new Grandmother(74, "Лия", 4);
	    grandmother.feedGrandsons();

	    GrandmotherBatman grandmotherBatman =
                new GrandmotherBatman(120, "БабушкаБэтмен Ильинична",
                        10, 99, "777");

	    grandmotherBatman.feedGrandsons();
	    grandmother.countOfGrandsons = -100;
    }
}
