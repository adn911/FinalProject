package org.foodbar.persistance.entity;

import javax.persistence.*;

/**
 * Created by bakhtiar.galib on 4/20/15.
 */
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class MenuItemReview extends Review {

    @ManyToOne
    @JoinColumn(name = "item_id")
    private MenuItem menuItem;

    private MenuItemRating rating;


    public MenuItem getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public MenuItemRating getRating() {
        return rating;
    }

    public void setRating(MenuItemRating rating) {
        this.rating = rating;
    }
}
