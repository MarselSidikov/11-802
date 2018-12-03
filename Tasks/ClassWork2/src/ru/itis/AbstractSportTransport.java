package ru.itis;

/**
 * 03.12.2018
 * AbstractSportTransport
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public abstract class AbstractSportTransport extends Transport implements SportTransport {

    public AbstractSportTransport(double oilAmount, String registrationNumber) {
        super(oilAmount, registrationNumber);
    }
}
