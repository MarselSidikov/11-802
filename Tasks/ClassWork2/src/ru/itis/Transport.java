package ru.itis;

/**
 * 03.12.2018
 * Transport
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public abstract class Transport {
    private double oilAmount;
    private String registrationNumber;

    public Transport(double oilAmount, String registrationNumber) {
        this.oilAmount = oilAmount;
        this.registrationNumber = registrationNumber;
    }

    public double getOilAmount() {
        return oilAmount;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public abstract void drive();
}
