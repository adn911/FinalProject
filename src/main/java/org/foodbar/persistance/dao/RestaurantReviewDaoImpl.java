package org.foodbar.persistance.dao;


import org.foodbar.persistance.entity.Restaurant;
import org.foodbar.persistance.entity.RestaurantReview;
import org.foodbar.persistance.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by bakhtiar.galib on 2/8/15.
 */


@Repository
@Transactional
public class RestaurantReviewDaoImpl implements RestaurantReviewDao {

    @PersistenceContext
    private EntityManager entityManager;

    public RestaurantReviewDaoImpl() {

    }

    @Override
    public void addReview(RestaurantReview restaurantReview) {
        entityManager.persist(restaurantReview);
    }

    @Override
    public RestaurantReview getReview(int id) {
        return entityManager.find(RestaurantReview.class,id);
    }

    @Override
    public void removeReview(RestaurantReview restaurantReview) {
        entityManager.remove(restaurantReview);
    }
}