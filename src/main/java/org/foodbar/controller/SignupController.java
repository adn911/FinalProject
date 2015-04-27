package org.foodbar.controller;


import org.foodbar.persistance.entity.User;
import org.foodbar.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.validation.Valid;
import java.io.IOException;

/**
 * @author Abdullah Al Mamun Oronno (www.oneous.com)
 */

@Controller
public class SignupController {

    private static final Logger log = LoggerFactory.getLogger(SignupController.class);

    @Autowired
    private UserService userService;


    @RequestMapping(value = {"/signup"}, method = RequestMethod.GET)
    public String showSignup(Model model) {
        model.addAttribute("newUser", new User());

        return "signup";
    }

    @RequestMapping(value = {"/signup"}, method = RequestMethod.POST)
    public String processSignup(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, @RequestParam(value = "picture", required = false) MultipartFile image, Model model) throws IOException {

        if (!result.hasErrors() ) {

            userService.addUser(newUser);
            model.addAttribute("success", 1);

        } else {
            model.addAttribute("error", 1);
        }

        return "signup";
    }

}
