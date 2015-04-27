package org.foodbar.persistance.dao;


import org.foodbar.persistance.entity.*;
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
public class RestaurantDaoImpl implements RestaurantDao {

    @PersistenceContext
    private EntityManager entityManager;

    public RestaurantDaoImpl() {

    }

    @Override
    public void addRestaurant(Restaurant restaurant) {
        entityManager.persist(restaurant);
    }

    @Override
    public void addRestaurantAddress(int restaurantId, Branch branch) {
         entityManager.getReference(Restaurant.class,restaurantId).getBranches().add(branch);
    }

    @Override
    public List<Restaurant> getAllRestaurant() {
        return entityManager.createQuery("SELECT R FROM Restaurant AS R ORDER BY R.rating.overall", Restaurant.class).getResultList();
    }

    @Override
    public List<Restaurant> getRestaurantsByCategory(String categoryName) {
        TypedQuery<Restaurant> query = entityManager.createQuery("SELECT R FROM Restaurant AS R WHERE R.category.name = :category ORDER BY R.rating.overall", Restaurant.class);
        query.setParameter("category",categoryName);
        return query.getResultList();
    }

    @Override
    public Restaurant getRestaurant(int restaurantId) {
        return entityManager.find(Restaurant.class,restaurantId);
    }

    @Override
    public void removeRestaurant(Restaurant restaurant) {
        entityManager.remove(restaurant);
    }

    private User getSingleResultOrNull(TypedQuery<User> query) {
        query.setMaxResults(1);
        List<User> list = query.getResultList();

        if (list.isEmpty()) {
            return null;
        }

        return list.get(0);
    }
}