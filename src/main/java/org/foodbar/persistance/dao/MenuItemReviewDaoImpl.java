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
public class MenuItemReviewDaoImpl implements MenuItemReviewDao {

    @PersistenceContext
    private EntityManager entityManager;

    public MenuItemReviewDaoImpl() {

    }

    @Override
    public void addReview(MenuItemReview menuItemReview) {
        entityManager.persist(menuItemReview);
    }

    @Override
    public MenuItemReview getReview(int id) {
        return entityManager.find(MenuItemReview.class,id);
    }


    @Override
    public void removeReview(MenuItemReview menuItemReview) {
        entityManager.remove(menuItemReview);
    }

}