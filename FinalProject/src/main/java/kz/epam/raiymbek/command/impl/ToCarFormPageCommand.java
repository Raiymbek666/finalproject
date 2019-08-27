package kz.epam.raiymbek.command.impl;

import kz.epam.raiymbek.command.Command;
import kz.epam.raiymbek.command.PageContainer;

import javax.servlet.http.HttpServletRequest;

public class ToCarFormPageCommand implements Command {
    public static final String TO_ADD_CAR = "to_add_car";
    @Override
    public String execute(HttpServletRequest request) {
        String toCarForm = request.getParameter(TO_ADD_CAR);
        request.setAttribute(TO_ADD_CAR,toCarForm);
        return PageContainer.TO_ADD_CAR;
    }
}
