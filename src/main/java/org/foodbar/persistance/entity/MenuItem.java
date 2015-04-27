package org.foodbar.persistance.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by GALIB on 4/18/2015.
 */
@Entity
public class MenuItem extends Persistent{

    @Column(nullable = false, length = 99)
    private String name;

    @Column(nullable = false,columnDefinition = "TEXT")
    private String description;

    private double price;

    @Lob
    private byte[] photo;

    private MenuItemRating rating;

    @OneToMany(mappedBy = "menuItem",cascade = CascadeType.REMOVE)
    private Set<MenuItemReview> reviews;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    @PrePersist
    void onPrePersist(){
        rating = new MenuItemRating();
        rating.setOverall(0);
    }

    public String getName() {
        return name;
    }

    public MenuItemRating getRating() {
        return rating;
    }

    public void setRating(MenuItemRating rating) {
        this.rating = rating;
    }

    public Set<MenuItemReview> getReviews() {
        return reviews;
    }

    public void setReviews(Set<MenuItemReview> reviews) {
        this.reviews = reviews;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}
