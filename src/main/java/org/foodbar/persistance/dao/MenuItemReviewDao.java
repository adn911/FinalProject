package org.foodbar.persistance.dao;

import org.foodbar.persistance.entity.MenuItem;
import org.foodbar.persistance.entity.MenuItemReview;
import org.foodbar.persistance.entity.Restaurant;
import org.foodbar.persistance.entity.RestaurantReview;

import java.util.List;

/**
 * Created by bakhtiar.galib on 2/8/15.
 */
public interface MenuItemReviewDao {

    void addReview(MenuItemReview menuItemReview);

    MenuItemReview getReview(int id);

    void removeReview(MenuItemReview menuItemReview);

}
