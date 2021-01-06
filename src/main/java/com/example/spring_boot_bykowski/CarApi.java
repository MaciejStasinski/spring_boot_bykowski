package com.example.spring_boot_bykowski;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarApi {

    //adnotacja nad polem klasy
//    @Autowired
    private CarManager carManager;

    //adnotacja nad konstruktorem
    @Autowired
    public CarApi(CarManager carManager){
        this.carManager=carManager;
    }
    //adnotacja nad setterem
//    @Autowired
    public void setCarManager(CarManager carManager) {
        this.carManager = carManager;
    }

    @GetMapping("/getCars")
    public List<Car> getCars(){
        return carManager.getCarList();
    }

    @PostMapping("/addCar")
    public boolean addCars(@RequestBody Car car){
        return carManager.addCar(car);
    }
    @GetMapping("/sayHello")
    public String main (@RequestParam String name){
        return "Hello "+name;
    }

}
