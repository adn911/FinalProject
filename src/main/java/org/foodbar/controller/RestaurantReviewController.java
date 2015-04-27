package org.foodbar.controller;

import org.foodbar.persistance.entity.Restaurant;
import org.foodbar.persistance.entity.RestaurantReview;
import org.foodbar.service.MenuItemService;
import org.foodbar.service.RestaurantCategoryService;
import org.foodbar.service.RestaurantReviewService;
import org.foodbar.service.RestaurantService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.IOException;


@Controller
@RequestMapping("/restaurantReviews")
public class RestaurantReviewController {

    private static final Logger log = LoggerFactory.getLogger(RestaurantReviewController.class);

    @Autowired
    HttpSession httpSession;

    @Autowired
    RestaurantService restaurantService;

    @Autowired
    RestaurantReviewService restaurantReviewService;

    @RequestMapping(value = {"/add"}, method = RequestMethod.POST)
    public String addReview(@Valid @ModelAttribute("newRestaurantReview") RestaurantReview review, BindingResult result, Model model,@RequestParam(value = "restaurantId") int restaurantId) throws IOException {
        log.debug("At home page");

        if(!result.hasErrors()){

            review.setRestaurant(restaurantService.getRestaurant(restaurantId));
            restaurantReviewService.addReview(review);
            model.addAttribute("success",1);

        }else{
            model.addAttribute("error",1);
        }

        return "redirect:/restaurants/profile/"
                +review.getRestaurant().getId()+"#reviews";
    }

    public String removeReview(@RequestParam(value = "reviewId") int reviewId) {
        log.debug("At home page");

        restaurantReviewService.removeReview(restaurantReviewService.getReview(reviewId));

        return "index";
    }

}
