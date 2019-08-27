package kz.epam.raiymbek.service.impl;

import kz.epam.raiymbek.dao.impl.CarDAOImpl;
import kz.epam.raiymbek.entity.Car;
import kz.epam.raiymbek.service.CarService;

import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public boolean createCar(Car car) {
        return new CarDAOImpl().addCar(car);
    }

    @Override
    public List<Car> getAllCarsInfo() {
        return new CarDAOImpl().listAllCars();
    }

    @Override
    public boolean deleteCarInfo(Car car) {
        return new CarDAOImpl().deleteCar(car);
    }

    @Override
    public boolean updateCarInfo(Car car) {
        return new CarDAOImpl().editCar(car);
    }

    @Override
    public Car getCarById(int id) {
        return new CarDAOImpl().getCar(id);
    }
}
