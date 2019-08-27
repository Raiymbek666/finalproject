package kz.epam.raiymbek.dao;

import kz.epam.raiymbek.entity.User;

import java.util.List;

public interface UserDAO {
    boolean hasUser(User user);
    boolean addUser(User user);
}
