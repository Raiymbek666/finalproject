package kz.epam.raiymbek.dao.impl;

import kz.epam.raiymbek.dao.CarDAO;
import kz.epam.raiymbek.entity.Car;
import kz.epam.raiymbek.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CarDAOImpl implements CarDAO {
    @Override
    public List<Car> listAllCars() {
        List<Car> cars = new ArrayList<>();
        String sql = "SELECT * FROM CARS";
        try(Connection connection = DBUtil.getDataSource().getConnection();
            Statement statement =connection .createStatement();
            ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                int carId = resultSet.getInt("car_id");
                String mark = resultSet.getString("mark");
                String model = resultSet.getString("model");
                int year = resultSet.getInt("year");
                String color = resultSet.getString("color");
                Car car = new Car(carId,mark,model,year,color);
                cars.add(car);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cars;
    }

    @Override
    public boolean addCar(Car car) {
        String sql = "INSERT INTO CARS (car_id, mark, model, year, color) VALUES (?, ?, ?, ?, ?)";
        boolean rowInserted = false;
        try(Connection connection = DBUtil.getDataSource().getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);) {
            ps.setInt(1, car.getCarId());
            ps.setString(2, car.getMark());
            ps.setString(3, car.getModel());
            ps.setInt(4, car.getYear());
            ps.setString(5, car.getColor());
            ps.executeUpdate();
            rowInserted = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rowInserted;
    }

    @Override
    public boolean editCar(Car car) {
        String sql = "UPDATE CARS SET mark = ?, model = ?, year = ?, color = ? WHERE car_id = ?";
        boolean rowUpdated = false;
        try(Connection connection = DBUtil.getDataSource().getConnection();
            PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, car.getMark());
            ps.setString(2, car.getModel());
            ps.setInt(3, car.getYear());
            ps.setString(4, car.getColor());
            ps.setInt(5, car.getCarId());
            ps.executeUpdate();
            rowUpdated = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rowUpdated;
    }

    @Override
    public boolean deleteCar(Car car) {
        String sql = "DELETE FROM CARS WHERE car_id = ?";
        boolean rowDeleted = false;
        try(Connection connection = DBUtil.getDataSource().getConnection();
            PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, car.getCarId());
            ps.executeUpdate();
            rowDeleted = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rowDeleted;
    }

    @Override
    public Car getCar(int id) {
        Car car = null;
        String sql = "SELECT * FROM CARS WHERE car_id = ?";
        try(Connection connection = DBUtil.getDataSource().getConnection();
            PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                String mark = resultSet.getString("mark");
                String model = resultSet.getString("model");
                int year = resultSet.getInt("year");
                String color = resultSet.getString("color");
                car = new Car(id, model, mark, year,color);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return car;    }
}
