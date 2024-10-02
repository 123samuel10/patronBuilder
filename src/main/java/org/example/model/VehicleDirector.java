package org.example.model;

import org.example.service.VehicleBuilder;

public class VehicleDirector {
    private VehicleBuilder builder;
    // Constructor que toma un builder concreto
    public VehicleDirector(VehicleBuilder builder) {
        this.builder = builder;
    }

    // Método para construir un coche
    public Vehicle constructCar() {
        return builder.setType("Car")
                .setNumberOfWheels(4)
                .setColor("Red")
                .setModel("Sedan")
                .build();
    }
    // Método para construir una bicicleta
    public Vehicle constructBike() {
        return builder.setType("Bike")
                .setNumberOfWheels(2)
                .setColor("Blue")
                .setModel("Mountain")
                .build();
    }
    // Método para construir un camión
    public Vehicle constructTruck() {
        return builder.setType("Truck")
                .setNumberOfWheels(6)
                .setColor("White")
                .setModel("Heavy Duty")
                .build();
    }
}
