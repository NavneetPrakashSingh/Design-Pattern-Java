package Creational.Builder.Product;

import Creational.Builder.Feature.Engine;
import Creational.Builder.Feature.Gps;
import Creational.Builder.Feature.Transmission;

public class CarManual {

    //car is the product that the client want. This class is being populated by the carmanualbuilder
    private int seats;
    private Engine engine;
    private Gps gps;
    private Transmission transmission;

    public CarManual(int seats, Engine engine, Gps gps, Transmission transmission) {
        this.seats = seats;
        this.engine = engine;
        this.gps = gps;
        this.transmission = transmission;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Gps getGps() {
        return gps;
    }

    public void setGps(Gps gps) {
        this.gps = gps;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
}
