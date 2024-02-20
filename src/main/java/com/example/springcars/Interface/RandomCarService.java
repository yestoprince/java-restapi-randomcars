package com.example.springcars.Interface;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

import com.example.springcars.Model.CarModel;

@Service
public class RandomCarService implements CarService {

    @Override
    public CarModel generateCar() {
        var brand = BRANDS.get(ThreadLocalRandom.current().nextInt(BRANDS.size()));
        var color = COLORS.get(ThreadLocalRandom.current().nextInt(COLORS.size()));
        var type = TYPE.get(ThreadLocalRandom.current().nextInt(TYPE.size()));
        return new CarModel(brand, color, type);
        
    }
    
}
