package org.foodbar.service;

import org.foodbar.persistance.dao.MenuItemDao;
import org.foodbar.persistance.entity.MenuItem;
import org.foodbar.persistance.entity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

/**
 * Created by GALIB on 4/24/2015.
 */
@Service
@Transactional
public class MenuItemService {

    @Autowired
    private MenuItemDao menuItemDao;

    public MenuItemService(){

    }

    public void addMenuItem(MenuItem menuItem){
        menuItemDao.addMenuItem(menuItem);
    }

    public Set<MenuItem> getAllMenuItem(){
        return menuItemDao.getAllMenuItem();
    }

    public MenuItem getMenuItem(int menuItemId){
        return menuItemDao.getMenuItem(menuItemId);
    }

    public Set<MenuItem> searchMenuItemsByName (String itemName){
        return menuItemDao.searchMenuItemsByName(itemName);
    }

    public MenuItem getMenuItemWithAssociations(int menuItemId){
        return menuItemDao.getMenuItemWithAssociations(menuItemId);
    }

    public void removeMenuItem(int menuItemId){
        menuItemDao.removeMenuItem(menuItemId);
    }

    public Set<MenuItem> getRestaurantMenuItems(int id){
        return menuItemDao.getRestaurantMenuItems(id);
    }

}
