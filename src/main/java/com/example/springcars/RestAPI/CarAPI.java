package com.example.springcars.RestAPI;

import org. springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.springcars.Interface.CarService;
import com.example.springcars.Model.CarModel;

@RestController
@RequestMapping("/api/car/v1")
public class CarAPI {
    @Autowired
    private CarService carService;
    

    @RequestMapping(value = "/random", method = RequestMethod.GET)
    public CarModel random()
    {
        return carService.generateCar();
    }

}
