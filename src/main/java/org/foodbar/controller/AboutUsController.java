package org.foodbar.controller;


import org.foodbar.persistance.entity.User;
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
@RequestMapping("/about")
public class AboutUsController {

    private static final Logger log = LoggerFactory.getLogger(AboutUsController.class);

    @Autowired
    private ServletContext servletContext;

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String showAboutUs(Model model) {

        return "aboutUs";
    }

}
