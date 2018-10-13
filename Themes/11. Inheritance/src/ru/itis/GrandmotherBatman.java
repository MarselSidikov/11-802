package ru.itis;

/**
 * 13.10.2018
 * GrandmotherBatman
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class GrandmotherBatman extends Grandmother {
    private int enemiesCount;
    private String batMobileNumber;
    public int countOfGrandsons;

    public GrandmotherBatman(int age, String name, int countOfGrandsons,
                             int enemiesCount, String batMobileNumber) {
        super(age, name, countOfGrandsons);
        this.enemiesCount = enemiesCount;
        this.batMobileNumber = batMobileNumber;
    }

    public int getEnemiesCount() {
        return enemiesCount;
    }

    public String getBatMobileNumber() {
        return batMobileNumber;
    }

    @Override
    public void feedGrandsons() {
        for (int i = 0; i < countOfGrandsons; i++) {
            System.out.println("EAT IT MOTHERFATHERS");
        }
    }
}
