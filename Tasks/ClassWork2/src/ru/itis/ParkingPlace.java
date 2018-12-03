package ru.itis;

/**
 * 03.12.2018
 * ParkingPlace
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ParkingPlace {
    private final int MAX_PARKING_SIZE = 5;
    private int count;

    private Transport transports[];

    public ParkingPlace() {
        this.transports = new Transport[MAX_PARKING_SIZE];
        this.count = 0;
    }

    public void addTransport(Transport transport) {
        if (count < transports.length) {
            transports[count++] = transport;
            count++;
        }
    }

    public void goFromParkingPlace(Transport transport) {
        for (Transport current : transports) {
            if (current.getRegistrationNumber().equals(transport.getRegistrationNumber())) {
                // TODO: убираем с парковки
            }
        }
    }
}
