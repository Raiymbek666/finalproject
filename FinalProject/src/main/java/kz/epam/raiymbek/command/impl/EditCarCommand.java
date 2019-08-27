package kz.epam.raiymbek.command.impl;

import kz.epam.raiymbek.command.Command;
import kz.epam.raiymbek.command.PageContainer;
import kz.epam.raiymbek.entity.Car;
import kz.epam.raiymbek.service.impl.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;

public class EditCarCommand implements Command {
    private static final String ID_CAR = "car_id";
    private static final String MARK = "mark";
    private static final String MODEL = "model";
    private static final String YEAR = "year";
    private static final String COLOR = "color";
    @Override
    public String execute(HttpServletRequest request) {
        int id_car = Integer.parseInt(request.getParameter(ID_CAR));
        String mark = request.getParameter(MARK);
        String model = request.getParameter(MODEL);
        System.out.println(id_car+"HELLO");
        int year = Integer.parseInt(request.getParameter(YEAR));
        String color = request.getParameter(COLOR);
        new CarServiceImpl().updateCarInfo(new Car(id_car, mark, model, year, color));
        return PageContainer.TO_CABINET;
    }
}
