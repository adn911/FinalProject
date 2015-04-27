package org.foodbar.service;

import org.foodbar.persistance.dao.RestaurantCategoryDao;
import org.foodbar.persistance.dao.RestaurantDao;
import org.foodbar.persistance.entity.Restaurant;
import org.foodbar.persistance.entity.RestaurantCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by GALIB on 4/24/2015.
 */
@Service
@Transactional
public class RestaurantCategoryService {

    @Autowired
    private RestaurantCategoryDao restaurantCategoryDao;

    public RestaurantCategoryService(){

    }

    public void addCategory(RestaurantCategory restaurantCategory){
        restaurantCategoryDao.addCategory(restaurantCategory);
    }

    public void removeCategory(RestaurantCategory restaurantCategory){
        restaurantCategoryDao.removeCategory(restaurantCategory);
    }

    public List<RestaurantCategory> getAllCategories(){
        return  restaurantCategoryDao.getAllCategories();
    }
}
