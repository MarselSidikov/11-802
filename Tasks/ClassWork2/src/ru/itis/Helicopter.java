package ru.itis;

/**
 * 03.12.2018
 * Helicopter
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Helicopter extends AbstractMilitaryTransport implements Flying {
    public Helicopter(double oilAmount, String registrationNumber) {
        super(oilAmount, registrationNumber);
    }

    @Override
    public void fly() {

    }
}
