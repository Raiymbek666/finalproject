package kz.epam.raiymbek.command.impl;

import kz.epam.raiymbek.command.Command;
import kz.epam.raiymbek.command.PageContainer;
import kz.epam.raiymbek.entity.Car;
import kz.epam.raiymbek.service.impl.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;

public class DeleteCarCommand implements Command {
    private static final String ID_CAR = "car_id";
    private static final String MARK = "mark";
    private static final String MODEL = "model";
    private static final String YEAR = "year";
    private static final String COLOR = "color";
    @Override
    public String execute(HttpServletRequest request) {
        int id_car = Integer.parseInt(request.getParameter(ID_CAR));
        System.out.println(id_car+"HELLO");
        Car car = new Car(id_car);
        new CarServiceImpl().deleteCarInfo(car);
        return PageContainer.TO_CABINET;
    }
}
