package kz.epam.raiymbek.service;

import kz.epam.raiymbek.entity.User;

public interface UserService {
    boolean checkUser(User user);
    boolean createUser(User user);
}
