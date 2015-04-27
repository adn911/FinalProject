package org.foodbar.persistance.dao;

import org.foodbar.persistance.entity.*;

import java.util.List;

/**
 * Created by bakhtiar.galib on 2/8/15.
 */
public interface RestaurantDao {

    void addRestaurant(Restaurant restaurant);

    List<Restaurant> getAllRestaurant();

    List<Restaurant> getRestaurantsByCategory(String categoryName);

    Restaurant getRestaurant(int restaurantId);

    void removeRestaurant(Restaurant restaurant);

    void addRestaurantAddress(int restaurantId, Branch branch);
}
