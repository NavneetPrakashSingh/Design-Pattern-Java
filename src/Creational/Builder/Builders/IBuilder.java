package Creational.Builder.Builders;

import Creational.Builder.Feature.Engine;
import Creational.Builder.Feature.Gps;
import Creational.Builder.Feature.Transmission;

public interface IBuilder {
//    defining all the possible ways to configure a product
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setGPS(Gps gps);
}
