package org.foodbar.persistance.dao;

import org.foodbar.persistance.entity.MenuItem;
import org.foodbar.persistance.entity.Restaurant;
import org.foodbar.persistance.entity.RestaurantReview;

import java.util.List;

/**
 * Created by bakhtiar.galib on 2/8/15.
 */
public interface RestaurantReviewDao {

    void addReview(RestaurantReview restaurantReview);

    RestaurantReview getReview(int id);

    void removeReview(RestaurantReview restaurantReview);
}
