package com.example.springcars.Interface;

import java.util.List;

import com.example.springcars.Model.CarModel;

public interface CarService {
    List<String> BRANDS = List.of("Toyota", "Honda", "Ford", "TATA", "Volvo", "Tesla");
    List<String> COLORS = List.of("White", "Black", "Red", "Metalic", "Multi", "Orange");
    List<String> TYPE = List.of("Hatch back", "Sedan", "SUV", "MPV");
      
    CarModel generateCar();
}