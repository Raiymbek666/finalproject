package kz.epam.raiymbek.command.impl;

import kz.epam.raiymbek.command.Command;
import kz.epam.raiymbek.command.PageContainer;

import kz.epam.raiymbek.service.impl.CarServiceImpl;


import javax.servlet.http.HttpServletRequest;


public class ToCarListPageCommand implements Command {
    public static final String TO_CAR_LIST = "to_car_list";
    @Override
    public String execute(HttpServletRequest request) {
        String toCarList = request.getParameter(TO_CAR_LIST);
        request.setAttribute(TO_CAR_LIST,toCarList);
        request.setAttribute("listCar",new CarServiceImpl().getAllCarsInfo());
        return PageContainer.TO_CAR_LIST;

    }
}
