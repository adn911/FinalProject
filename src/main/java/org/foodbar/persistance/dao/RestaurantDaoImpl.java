package org.foodbar.persistance.dao;


import org.foodbar.persistance.entity.*;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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
    public Set<Restaurant> getAllRestaurant() {
        TypedQuery<Restaurant> query = entityManager.createQuery("SELECT R FROM Restaurant AS R ORDER BY R.rating.overall", Restaurant.class);
        return new LinkedHashSet<Restaurant>(query.getResultList());
    }

    @Override
    public Set<Restaurant> getRestaurantsByCategory(String categoryName) {
        TypedQuery<Restaurant> query = entityManager.createQuery("SELECT R FROM Restaurant AS R WHERE R.category.name = :category ORDER BY R.rating.overall", Restaurant.class);
        query.setParameter("category",categoryName);
        return new LinkedHashSet<Restaurant>(query.getResultList());
    }

    @Override
    public Restaurant getRestaurant(int restaurantId) {
        return entityManager.find(Restaurant.class,restaurantId);
    }

    @Override
    public Restaurant getRestaurantWithAssociations(int restaurantId) {
        Restaurant restaurant = getRestaurant(restaurantId);

        Hibernate.initialize(restaurant.getMenuItems());
        Hibernate.initialize(restaurant.getReviews());
        Hibernate.initialize(restaurant.getBranches());

        return restaurant;
    }

    @Override
    public void removeRestaurant(Restaurant restaurant) {
        entityManager.remove(restaurant);
    }

    private Restaurant getSingleResultOrNull(TypedQuery<Restaurant> query) {
        query.setMaxResults(1);
        List<Restaurant> list = query.getResultList();

        if (list.isEmpty()) {
            return null;
        }

        return list.get(0);
    }
}