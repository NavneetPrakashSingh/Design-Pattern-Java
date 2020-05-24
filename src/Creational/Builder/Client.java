package Creational.Builder;

import Creational.Builder.Builders.CarBuilder;
import Creational.Builder.Builders.IBuilder;
import Creational.Builder.Director.Director;
import Creational.Builder.Product.Car;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();

        director.constructSportsCar(carBuilder);
        Car results = carBuilder.getResults();
        System.out.println(results.getGps().gpsSoftwareVersion);
    }
}
