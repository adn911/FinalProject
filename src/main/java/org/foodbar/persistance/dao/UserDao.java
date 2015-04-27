package org.foodbar.persistance.dao;

import org.foodbar.persistance.entity.User;

import java.util.List;

/**
 * Created by bakhtiar.galib on 2/8/15.
 */
public interface UserDao {

    User loginUser(String email, String password);

    void addUser(User user);

    void removeUser(User user);

    List<User> getAllUsers();

    User getUser(int userId);

    boolean userExists(int userId);

}
