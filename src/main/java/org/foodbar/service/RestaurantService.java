package org.foodbar.service;

import org.foodbar.persistance.dao.RestaurantDao;
import org.foodbar.persistance.entity.Branch;
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
public class RestaurantService {

    @Autowired
    private RestaurantDao restaurantDao;

    public RestaurantService(){

    }

    public void addRestaurant(Restaurant restaurant){
        restaurantDao.addRestaurant(restaurant);
    }

    public Set<Restaurant> getAllRestaurant(){
        return restaurantDao.getAllRestaurant();
    }

    public Set<Restaurant> getRestaurantsByCategory(String categoryName){
        return restaurantDao.getRestaurantsByCategory(categoryName);
    }

    public Restaurant getRestaurant(int restaurantId){
        return restaurantDao.getRestaurant(restaurantId);
    }

    public Restaurant getRestaurantWithAssociations(int restaurantId){
        return restaurantDao.getRestaurantWithAssociations(restaurantId);
    }

    public void removeRestaurant(Restaurant restaurant){
        restaurantDao.removeRestaurant(restaurant);
    }

    public void addRestaurantAddress(int restaurantId, Branch branch){
        restaurantDao.addRestaurantAddress(restaurantId, branch);
    }
}
