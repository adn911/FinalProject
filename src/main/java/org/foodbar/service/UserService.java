package org.foodbar.service;

import org.foodbar.persistance.dao.UserDao;
import org.foodbar.persistance.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by GALIB on 4/24/2015.
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    public UserService(){

    }

    public User loginUser(String email, String password){
        return userDao.loginUser(email,password);
    }

    public void addUser(User user){
        userDao.addUser(user);
    }

    public void removeUser(User user){
        userDao.removeUser(user);
    }

    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }

    public User getUser(int userId){
        return userDao.getUser(userId);
    }

    boolean userExists(int userId){
        return userDao.userExists(userId);
    }
}
