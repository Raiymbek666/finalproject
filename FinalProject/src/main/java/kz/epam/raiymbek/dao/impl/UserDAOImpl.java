package kz.epam.raiymbek.dao.impl;

import kz.epam.raiymbek.dao.UserDAO;
import kz.epam.raiymbek.entity.User;
import kz.epam.raiymbek.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    @Override
    public boolean hasUser(User user) {
        boolean hasUser = false;
        String sql = "SELECT * from ACCESS where login = ? and password = ?";
        try(Connection connection = DBUtil.getDataSource().getConnection();
            PreparedStatement ps = connection.prepareStatement(sql)
            ) {
            ps.setString(1, user.getLogin());
            ps.setString(2, user.getPassword());
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                hasUser = true;
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return hasUser;
    }

    @Override
    public boolean addUser(User user) {
        String sql = "INSERT INTO ACCESS (id, name, surname, login, password) VALUES (?, ?, ?, ?, ?)";
        boolean rowInserted = false;
        try(Connection connection = DBUtil.getDataSource().getConnection();
            PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, user.getUserId());
            ps.setString(2, user.getName());
            ps.setString(3, user.getSurname());
            ps.setString(4, user.getLogin());
            ps.setString(5, user.getPassword());
            ps.executeUpdate();
            rowInserted = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rowInserted;
    }
}
