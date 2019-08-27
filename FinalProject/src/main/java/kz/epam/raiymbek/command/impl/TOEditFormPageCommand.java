package kz.epam.raiymbek.command.impl;

import kz.epam.raiymbek.command.Command;
import kz.epam.raiymbek.command.PageContainer;
import kz.epam.raiymbek.service.impl.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;

public class TOEditFormPageCommand implements Command {
    public static final String TO_EDIT_CAR = "edit_car";
    private static final String CAR = "car";
    private static final String CAR_ID = "car_id";

    @Override
    public String execute(HttpServletRequest request) {
        String toCarForm = request.getParameter(TO_EDIT_CAR);
        request.setAttribute(CAR, new CarServiceImpl().getCarById(Integer.parseInt(request.getParameter(CAR_ID))));
        request.setAttribute(TO_EDIT_CAR,toCarForm);
        return PageContainer.TO_EDIT_CAR;
    }
}
