package org.foodbar.persistance.entity;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by GALIB on 4/18/2015.
 */

@Entity
public class Restaurant extends Persistent{

    @NotEmpty
    @Column(nullable = false, length = 99)
    private String name;

    @NotEmpty
    @Column(nullable = false,columnDefinition = "TEXT")
    private String description;

    @Lob
    private byte[] photo;

    @ManyToOne
    @JoinColumn(name = "category")
    private RestaurantCategory category = new RestaurantCategory();

    @OneToMany(mappedBy = "restaurant",cascade = CascadeType.REMOVE,fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @BatchSize(size = 10)
    private Set<MenuItem> menuItems;

    @OneToMany(mappedBy = "restaurant",cascade = CascadeType.REMOVE,fetch = FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @BatchSize(size = 10)
    private Set<RestaurantReview> reviews;

    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name="branch", joinColumns=@JoinColumn(name="restaurant_id"))
    private Set<Branch> branches;

    private RestaurantRating rating ;

    @PrePersist
    void onPrePersist(){
        rating = new RestaurantRating();
        rating.setEnvironment(0);
        rating.setFoodQuality(0);
        rating.setService(0);
        rating.setOverall(0);
    }

    public void updateRating(RestaurantRating restaurantRating){
        System.out.println("Number of restaurant reviews "+reviews.size());
        /*this.rating.setEnvironment(this.rating.getEnvironment()+restaurantRating.getEnvironment());
        this.rating.setFoodQuality(this.rating.getFoodQuality()+restaurantRating.getFoodQuality());
        System.out.println("Restaurant rating "+rating.getOverall()+" "+restaurantRating.getOverall());*/
    }

    public RestaurantRating getRating() {
        return rating;
    }

    public void setRating(RestaurantRating rating) {
        this.rating = rating;
    }

    public RestaurantCategory getCategory() {
        return category;
    }

    public void setCategory(RestaurantCategory category) {
        this.category = category;
    }

    public Set<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(Set<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Set<RestaurantReview> getReviews() {
        return reviews;
    }

    public void setReviews(Set<RestaurantReview> reviews) {
        this.reviews = reviews;
    }

    public Set<Branch> getBranches() {
        return branches;
    }

    public void setBranches(Set<Branch> branches) {
        this.branches = branches;
    }

    public String getName() {
        return name;
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

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}
