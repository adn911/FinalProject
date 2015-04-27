package org.foodbar.persistance.dao;


import org.foodbar.persistance.entity.MenuItem;
import org.foodbar.persistance.entity.Restaurant;
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
public class MenuItemDaoImpl implements MenuItemDao {

    @PersistenceContext
    private EntityManager entityManager;

    public MenuItemDaoImpl() {

    }

    @Override
    public void addMenuItem(MenuItem menuItem) {

        entityManager.persist(menuItem);
    }

    @Override
    public List<MenuItem> getAllMenuItem() {

        return entityManager.createQuery("SELECT item FROM MenuItem AS item ORDER BY item.rating.overall", MenuItem.class).getResultList();
    }

    @Override
    public List<MenuItem> getRestaurantMenuItems(int id) {
        return entityManager.find(Restaurant.class,id).getMenuItems();
    }

    @Override
    public MenuItem getMenuItem(int menuItemId) {

        return entityManager.find(MenuItem.class,menuItemId);
    }

    @Override
    public List<MenuItem> searchMenuItemsByName(String itemName) {
        TypedQuery<MenuItem> query = entityManager.createQuery(" SELECT item FROM MenuItem AS item WHERE item.name LIKE :itemName ORDER BY item.rating.overall", MenuItem.class);
        query.setParameter("itemName","%"+itemName+"%");
        return query.getResultList();
    }

    @Override
    public void removeMenuItem(int menuItemId) {

        entityManager.remove(entityManager.getReference(MenuItem.class,menuItemId));
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