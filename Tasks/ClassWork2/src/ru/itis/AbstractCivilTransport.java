package ru.itis;

/**
 * 03.12.2018
 * AbstractCivilTransport
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public abstract class AbstractCivilTransport extends Transport implements CivilTransport {

    private int maxCountOfPassengers;

    public AbstractCivilTransport(int maxCountOfPassengers, double oilAmount, String registrationNumber) {
        super(oilAmount, registrationNumber);
        this.maxCountOfPassengers = maxCountOfPassengers;
    }

    @Override
    public void addPassenger(Passenger passenger) {

    }

    @Override
    public void removePassenger(Passenger passenger) {

    }

    @Override
    public int countOfPassenger() {
        return 0;
    }

    @Override
    public void drive() {

    }

    public int getMaxCountOfPassengers() {
        return maxCountOfPassengers;
    }
}
