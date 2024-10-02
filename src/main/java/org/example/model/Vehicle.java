package org.example.model;

public class Vehicle {
    private String type;            // Tipo de vehículo (coche, bicicleta, camión)
    private int numberOfWheels;     // Número de ruedas
    private String color;           // Color del vehículo
    private String model;           // Modelo del vehículo

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    // Método toString para mostrar los atributos del vehículo
    @Override
    public String toString() {
        return "Vehicle [tipo=" + type + ", numbero de ruedas=" + numberOfWheels + ", color=" + color + ", modelo=" + model + "]";
    }
}
