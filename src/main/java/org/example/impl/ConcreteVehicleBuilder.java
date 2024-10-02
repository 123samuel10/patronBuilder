package org.example.impl;

import org.example.model.Vehicle;
import org.example.service.VehicleBuilder;

public class ConcreteVehicleBuilder implements VehicleBuilder {
    private Vehicle vehicle;
    // Constructor que inicializa un nuevo objeto Vehicle
    public ConcreteVehicleBuilder() {
        this.vehicle = new Vehicle();
    }
    // Establecer el tipo de vehículo
    @Override
    public VehicleBuilder setType(String type) {
        vehicle.setType(type);
        return this;
    }
    // Establecer el número de ruedas
    @Override
    public VehicleBuilder setNumberOfWheels(int numberOfWheels) {
        vehicle.setNumberOfWheels(numberOfWheels);
        return this;
    }
    // Establecer el color
    @Override
    public VehicleBuilder setColor(String color) {
        vehicle.setColor(color);
        return this;
    }
    // Establecer el modelo
    @Override
    public VehicleBuilder setModel(String model) {
        vehicle.setModel(model);
        return this;
    }
    // Construir el vehículo y devolverlo
    @Override
    public Vehicle build() {
        return this.vehicle;
    }
}
