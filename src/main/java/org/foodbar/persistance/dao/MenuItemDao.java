package org.foodbar.persistance.dao;

import org.foodbar.persistance.entity.MenuItem;
import org.foodbar.persistance.entity.Restaurant;

import java.util.List;

/**
 * Created by bakhtiar.galib on 2/8/15.
 */
public interface MenuItemDao {

    void addMenuItem(MenuItem menuItem);

    List<MenuItem> getAllMenuItem();

    List<MenuItem> getRestaurantMenuItems(int id);

    MenuItem getMenuItem(int menuItemId);

    List<MenuItem> searchMenuItemsByName (String itemName);

    void removeMenuItem(int menuItemId);
}
