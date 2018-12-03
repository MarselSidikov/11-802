package ru.itis;

/**
 * 03.12.2018
 * AbstractMilitaryTransport
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public abstract class AbstractMilitaryTransport extends Transport implements MilitaryTransport {

    public AbstractMilitaryTransport(double oilAmount, String registrationNumber) {
        super(oilAmount, registrationNumber);
    }

    @Override
    public int countOfWeapons() {
        return 0;
    }

    @Override
    public void fire() {

    }

    @Override
    public void drive() {

    }
}
