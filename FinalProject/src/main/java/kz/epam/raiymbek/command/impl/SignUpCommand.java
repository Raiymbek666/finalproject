package kz.epam.raiymbek.command.impl;

import kz.epam.raiymbek.command.Command;
import kz.epam.raiymbek.command.PageContainer;
import kz.epam.raiymbek.entity.User;
import kz.epam.raiymbek.service.impl.UserServiceImpl;

import javax.servlet.http.HttpServletRequest;

public class SignUpCommand implements Command {

    private static final String ID = "car_id";
    private static final String NAME = "name";
    private static final String SURNAME = "surname";
    private static final String LOGIN = "login";
    private static final String PASSWORD = "password";
    @Override
    public String execute(HttpServletRequest request) {
        String name = request.getParameter(NAME);
        String surname = request.getParameter(SURNAME);
        String login = request.getParameter(LOGIN);
        String password = request.getParameter(PASSWORD);
        new UserServiceImpl().createUser(new User(name,surname,login,password));
        return PageContainer.TO_LOGIN;
    }
}
