package org.foodbar.service;

import org.foodbar.persistance.dao.MenuItemReviewDao;
import org.foodbar.persistance.entity.MenuItemReview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by GALIB on 4/24/2015.
 */
@Service
@Transactional
public class MenuItemReviewService {

    @Autowired
    private MenuItemReviewDao menuItemReviewDao;

    public void addReview(MenuItemReview menuItemReview){
         menuItemReviewDao.addReview(menuItemReview);
    }

    public void removeReview(MenuItemReview menuItemReview){
        menuItemReviewDao.removeReview(menuItemReview);
    }

    public MenuItemReview getReview(int id){
        return menuItemReviewDao.getReview(id);
    }

}
