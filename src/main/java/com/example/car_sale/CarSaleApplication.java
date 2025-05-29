package com.example.car_sale;

import com.example.car_sale.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CarSaleApplication {

    @Autowired
    private CarService carService;

    public static void main(String[] args) {
        SpringApplication.run(CarSaleApplication.class, args);
    }

    @PostConstruct
    public void init() {
        carService.seedData();
    }
}
