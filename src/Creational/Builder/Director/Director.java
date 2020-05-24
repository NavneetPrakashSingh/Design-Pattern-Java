package Creational.Builder.Director;

import Creational.Builder.Builders.IBuilder;
import Creational.Builder.Feature.Engine;
import Creational.Builder.Feature.Gps;
import Creational.Builder.Feature.Transmission;

public class Director {
    //stores all the steps required to build the object
    public void constructSUVCar(IBuilder builder){
        builder.setGPS(new Gps("1.0"));
        builder.setEngine(new Engine("V2 Engine",2));
        builder.setSeats(4);
        builder.setTransmission(Transmission.AUTOMATIC);
    }
    public void constructSportsCar(IBuilder builder){
        builder.setGPS(new Gps("1.1"));
        builder.setEngine(new Engine("V1",3));
        builder.setSeats(2);
        builder.setTransmission(Transmission.MANUAL);
    }
}
