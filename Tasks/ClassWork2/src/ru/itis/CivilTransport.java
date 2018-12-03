package ru.itis;

/**
 * 03.12.2018
 * CivilTransport
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface CivilTransport {
    void addPassenger(Passenger passenger);
    void removePassenger(Passenger passenger);
    int countOfPassenger();

}
