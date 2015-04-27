package org.foodbar.persistance.dao;

import org.foodbar.persistance.entity.Restaurant;
import org.foodbar.persistance.entity.RestaurantCategory;

import java.util.List;

/**
 * Created by bakhtiar.galib on 2/8/15.
 */
public interface RestaurantCategoryDao {

    void addCategory(RestaurantCategory restaurantCategory);

    void removeCategory(RestaurantCategory restaurantCategory);

    List<RestaurantCategory> getAllCategories();
}
