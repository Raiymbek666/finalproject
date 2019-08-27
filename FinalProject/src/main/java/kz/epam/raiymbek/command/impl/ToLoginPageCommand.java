package kz.epam.raiymbek.command.impl;

import kz.epam.raiymbek.command.Command;
import kz.epam.raiymbek.command.PageContainer;

import javax.servlet.http.HttpServletRequest;

public class ToLoginPageCommand implements Command {
    public static final String TO_LOGIN = "login";
    @Override
    public String execute(HttpServletRequest request) {
        String toLogin = request.getParameter(TO_LOGIN);
        request.setAttribute(TO_LOGIN,toLogin);
        return PageContainer.TO_LOGIN;
    }
}
