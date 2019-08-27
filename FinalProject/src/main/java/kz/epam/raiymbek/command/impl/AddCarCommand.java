package kz.epam.raiymbek.command.impl;

import kz.epam.raiymbek.command.Command;
import kz.epam.raiymbek.command.PageContainer;
import kz.epam.raiymbek.entity.Car;
import kz.epam.raiymbek.service.impl.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;

public class AddCarCommand implements Command {
    private static final String ID_CAR = "car_id";
    private static final String MARK = "mark";
    private static final String MODEL = "model";
    private static final String YEAR = "year";
    private static final String COLOR = "color";
    @Override
    public String execute(HttpServletRequest request) {
        String mark = request.getParameter(MARK);
        String model = request.getParameter(MODEL);
        int year = Integer.parseInt(request.getParameter(YEAR));
        String color = request.getParameter(COLOR);
        new CarServiceImpl().createCar(new Car(mark, model, year, color));
        return PageContainer.TO_CABINET;
    }
}
