package Creational.Builder.Builders;

import Creational.Builder.Feature.Engine;
import Creational.Builder.Feature.Gps;
import Creational.Builder.Feature.Transmission;
import Creational.Builder.Product.Car;

public class CarBuilder implements IBuilder {
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private Gps gps;

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setGPS(Gps gps) {
        this.gps = gps;
    }

    public Car getResults() {
        Car car = new Car(this.seats, this.engine, this.gps, this.transmission);
        return car;
    }
}
