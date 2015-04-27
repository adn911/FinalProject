package org.foodbar.controller;

import org.foodbar.persistance.entity.MenuItem;
import org.foodbar.persistance.entity.User;
import org.foodbar.service.MenuItemService;
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
import java.lang.reflect.Method;


@Controller
@RequestMapping("/menuItems")
public class MenuItemController {

    private static final Logger log = LoggerFactory.getLogger(MenuItemController.class);

    @Autowired
    HttpSession httpSession;

    @Autowired
    private MenuItemService menuItemService;

    @RequestMapping("/{id}")
    public String showMenuItemDetails(@PathVariable(value = "id") int itemId, Model model) {
        log.debug("At home page");

        model.addAttribute("item",menuItemService.getMenuItem(itemId));

        return "menuItemDetails";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addMenuItem(@Valid @ModelAttribute("newMenuItem") MenuItem newMenuItem, BindingResult result, @RequestParam(value = "picture", required = false) MultipartFile image, Model model) throws IOException {
        log.debug("At home page");

        if(!result.hasErrors()){
            newMenuItem.setPhoto(image.getBytes());

            menuItemService.addMenuItem(newMenuItem);

            model.addAttribute("success",1);
        }else{
            model.addAttribute("error",1);
        }

        return "redirect:/restaurants/profile/"
                +newMenuItem.getRestaurant().getId()+"#menuitems";
    }

    @RequestMapping(value = "/remove",method = RequestMethod.POST)
    public String removeMenuItem(@RequestParam(value = "menuItemId") int menuItemId, Model model) {
        log.debug("At home page");

        MenuItem menuItem = menuItemService.getMenuItem(menuItemId);
        menuItemService.removeMenuItem(menuItemId);

        return "redirect:/restaurants/profile/"
                +menuItem.getRestaurant().getId()+"#menuitems";
    }

    @RequestMapping(value = "/browse",method = RequestMethod.GET)
    public String browseItems(Model model) {
        log.debug("At home page");

        return "menuItemsList";
    }




}
