package com.example.inheritancestrategies.controller.perclass;

import com.example.inheritancestrategies.model.perclass.Car;
import com.example.inheritancestrategies.model.perclass.Manufacturer;
import com.example.inheritancestrategies.model.perclass.Truck;
import com.example.inheritancestrategies.model.perclass.Vehicle;
import com.example.inheritancestrategies.repository.perclass.CarRepository;
import com.example.inheritancestrategies.repository.perclass.ManufacturerRepository;
import com.example.inheritancestrategies.repository.perclass.TruckRepository;
import com.example.inheritancestrategies.repository.perclass.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("vehicle/")
public class VehicleController {
    @Autowired
    ManufacturerRepository manufacturerRepository;

    @Autowired
    VehicleRepository vehicleRepository;

    @Autowired
    CarRepository carRepository;

    @Autowired
    TruckRepository truckRepository;

    @PostMapping("addmanufacturers")
    public List<Manufacturer> addManufacturers(@RequestBody List<Manufacturer> manufacturers) {
        return manufacturerRepository.saveAll(manufacturers);
    }
    @PostMapping("addvehicles")
    public List<Vehicle> addVehicles(@RequestBody List<Vehicle> vehicles) {
        return vehicleRepository.saveAll(vehicles);
    }
    @PostMapping("addcars")
    public List<Car> addCars(@RequestBody List<Car> cars) {
        return carRepository.saveAll(cars);
    }
    @PostMapping("addtrucks")
    public List<Truck> addTrucks(@RequestBody List<Truck> trucks) {
        return truckRepository.saveAll(trucks);
    }

}
