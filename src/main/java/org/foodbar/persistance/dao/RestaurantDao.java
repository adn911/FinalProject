package org.foodbar.persistance.dao;

import org.foodbar.persistance.entity.*;

import java.util.List;
import java.util.Set;

/**
 * Created by bakhtiar.galib on 2/8/15.
 */
public interface RestaurantDao {

    void addRestaurant(Restaurant restaurant);

    Set<Restaurant> getAllRestaurant();

    Set<Restaurant> getRestaurantsByCategory(String categoryName);

    Restaurant getRestaurant(int restaurantId);

    Restaurant getRestaurantWithAssociations(int restaurantId);

    void removeRestaurant(Restaurant restaurant);

    void addRestaurantAddress(int restaurantId, Branch branch);
}
