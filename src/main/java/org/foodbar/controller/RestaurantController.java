package org.foodbar.controller;

import org.foodbar.persistance.entity.*;
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
@RequestMapping("/restaurants")
public class RestaurantController {

    private static final Logger log = LoggerFactory.getLogger(RestaurantController.class);

    @Autowired
    HttpSession httpSession;

    @Autowired
    RestaurantService restaurantService;

    @Autowired
    MenuItemService menuItemService;

    @Autowired
    RestaurantCategoryService restaurantCategoryService;

    @Autowired
    RestaurantReviewService restaurantReviewService;

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String showList(Model model) {
        log.debug("At home page");

        model.addAttribute("restaurants",restaurantService.getAllRestaurant());
        model.addAttribute("restaurant", new Restaurant());
        model.addAttribute("categories",restaurantCategoryService.getAllCategories());

        return "restaurantsList";
    }

    @RequestMapping(value = {"/add"}, method = RequestMethod.POST)
    public String addRestaurant(@Valid @ModelAttribute("restaurant") Restaurant restaurant, BindingResult result, @RequestParam(value = "picture", required = false) MultipartFile image, Model model) throws IOException {
        log.debug("At home page");

        if(!result.hasErrors()){
            restaurant.setPhoto(image.getBytes());

            restaurantService.addRestaurant(restaurant);

            model.addAttribute("success",1);
        }else{
            model.addAttribute("error",1);
        }

        return "redirect:/restaurants/";
    }

    @RequestMapping(value = {"/profile/{id}"}, method = RequestMethod.GET)
    public String showProfile(@PathVariable(value = "id") int id,Model model) {
        log.debug("At home page");

        model.addAttribute("restaurant",restaurantService.getRestaurant(id));
        model.addAttribute("newRestaurantReview",new RestaurantReview());
        model.addAttribute("newRestaurantBranch",new Branch());

        return "restaurantProfile";
    }

    public String removeRestaurant(Model model) {
        log.debug("At home page");

        return "index";
    }

    @RequestMapping(value = {"/addBranch"}, method = RequestMethod.POST)
    public String addBranch(@Valid @ModelAttribute("newBranch") Branch branch, BindingResult result, @RequestParam(value = "restaurantId") int restaurantId, Model model) throws IOException {
        log.debug("At home page");

        if(!result.hasErrors()){

             restaurantService.addRestaurantAddress(restaurantId, branch);
             model.addAttribute("success",1);

        }else{

             model.addAttribute("error",1);
        }

        return "redirect:/restaurants/profile/"
                +restaurantId+"/#branches";
    }

}
