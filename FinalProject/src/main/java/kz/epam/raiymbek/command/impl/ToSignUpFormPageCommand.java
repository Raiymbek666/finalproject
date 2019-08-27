package kz.epam.raiymbek.command.impl;

import kz.epam.raiymbek.command.Command;
import kz.epam.raiymbek.command.PageContainer;

import javax.servlet.http.HttpServletRequest;

public class ToSignUpFormPageCommand implements Command {
    public static final String TO_SIGN_UP = "to_sign_up";
    @Override
    public String execute(HttpServletRequest request) {
        String toSignUp = request.getParameter(TO_SIGN_UP);
        request.setAttribute(TO_SIGN_UP,toSignUp);
        return PageContainer.TO_SIGN_UP;
    }
}
