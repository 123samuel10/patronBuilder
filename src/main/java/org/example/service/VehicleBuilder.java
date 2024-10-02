package org.example.service;

import org.example.model.Vehicle;

public interface VehicleBuilder {
    // Métodos para establecer los atributos del vehículo
    VehicleBuilder setType(String type);
    VehicleBuilder setNumberOfWheels(int numberOfWheels);
    VehicleBuilder setColor(String color);
    VehicleBuilder setModel(String model);
    // Método que construye y devuelve el vehículo final
    Vehicle build();
}