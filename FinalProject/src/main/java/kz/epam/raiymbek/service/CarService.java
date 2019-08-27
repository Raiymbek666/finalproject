package kz.epam.raiymbek.service;

import kz.epam.raiymbek.entity.Car;

import java.util.List;

public interface CarService {
    boolean createCar(Car car);
    List<Car> getAllCarsInfo();
    boolean deleteCarInfo(Car car);
    boolean updateCarInfo(Car car);
    Car getCarById(int id);
}
