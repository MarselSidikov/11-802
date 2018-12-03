package ru.itis;

/**
 * 03.12.2018
 * BugattiVeyron
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class BugattiVeyron extends AbstractSportTransport {
    public BugattiVeyron(double oilAmount, String registrationNumber) {
        super(oilAmount, registrationNumber);
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public void drive() {

    }
}
