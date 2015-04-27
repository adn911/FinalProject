package org.foodbar.persistance.dao;

import org.foodbar.persistance.entity.MenuItem;
import org.foodbar.persistance.entity.Restaurant;

import java.util.List;
import java.util.Set;

/**
 * Created by bakhtiar.galib on 2/8/15.
 */
public interface MenuItemDao {

    void addMenuItem(MenuItem menuItem);

    Set<MenuItem> getAllMenuItem();

    Set<MenuItem> getRestaurantMenuItems(int id);

    MenuItem getMenuItem(int menuItemId);

    MenuItem getMenuItemWithAssociations(int menuItemId);

    Set<MenuItem> searchMenuItemsByName (String itemName);

    void removeMenuItem(int menuItemId);
}
