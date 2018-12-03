package ru.itis;

/**
 * 03.12.2018
 * Tu154
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Tu154 extends AbstractCivilTransport implements Flying {

    public Tu154(int maxCountOfPassengers, double oilAmount, String registrationNumber) {
        super(maxCountOfPassengers, oilAmount, registrationNumber);
    }

    @Override
    public void fly() {

    }
}
