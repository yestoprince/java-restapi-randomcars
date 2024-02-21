package com.example.springcars.Model;

public class CarModel {
    private String brand;
    private String color; 
    private String type;   


    public CarModel(String brand, String color, String type) {
        this.brand = brand;
        this.color = color;
        this.type = type;
    }

    
    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }


    // @Override
    // public String toString() {
    //     return "{Car" +
    //         " brand='" + getBrand() + "'" +
    //         ", color='" + getColor() + "'" +
    //         ", type='" + getType() + "'" +
    //         "}";
    // }

}

    