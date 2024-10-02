package org.example;

import org.example.impl.ConcreteVehicleBuilder;
import org.example.model.Vehicle;
import org.example.model.VehicleDirector;
import org.example.service.VehicleBuilder;

public class Main {
    public static void main(String[] args) {
        // Crear un builder concreto
        VehicleBuilder builder = new ConcreteVehicleBuilder();
        VehicleDirector director = new VehicleDirector(builder);

        // Crear un coche
        Vehicle car = director.constructCar();
        System.out.println("Vehicle built: " + car);

        // Crear una bicicleta
        Vehicle bike = director.constructBike();
        System.out.println("Vehicle built: " + bike);

        // Crear un camión
        Vehicle truck = director.constructTruck();
        System.out.println("Vehicle built: " + truck);
    }
}