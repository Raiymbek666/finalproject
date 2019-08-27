package kz.epam.raiymbek.command.impl;

import kz.epam.raiymbek.command.Command;
import kz.epam.raiymbek.command.PageContainer;
import kz.epam.raiymbek.entity.User;
import kz.epam.raiymbek.service.impl.CarServiceImpl;
import kz.epam.raiymbek.service.impl.UserServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class ToCabinetPageCommand implements Command {
    public static final String TO_CABINET = "to_cabinet";
    @Override
    public String execute(HttpServletRequest request) {
        String toCabinet = request.getParameter(TO_CABINET);
        UserServiceImpl userService = new UserServiceImpl();
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        User user = new User(login,password);
        request.setAttribute(TO_CABINET,toCabinet);
        if (userService.checkUser(user)) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            return PageContainer.TO_CABINET;
        }
        else return PageContainer.TO_LOGIN;
    }
}
