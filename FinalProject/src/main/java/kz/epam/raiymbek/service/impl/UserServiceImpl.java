package kz.epam.raiymbek.service.impl;

import kz.epam.raiymbek.dao.impl.UserDAOImpl;
import kz.epam.raiymbek.entity.User;
import kz.epam.raiymbek.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public boolean checkUser(User user) {
        return new UserDAOImpl().hasUser(user);
    }

    @Override
    public boolean createUser(User user) {
        return new UserDAOImpl().addUser(user);
    }
}
