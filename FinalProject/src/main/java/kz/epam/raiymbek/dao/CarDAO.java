package kz.epam.raiymbek.dao;

import kz.epam.raiymbek.entity.Car;

import java.util.List;

public interface CarDAO {
    List<Car> listAllCars();
    boolean addCar(Car car);
    boolean editCar(Car car);
    boolean deleteCar(Car car);
    Car getCar(int id);
}
