package com.wakaleo.gameoflife.webtests.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * This class rocks.
 * check this we as well
 * @author johnsmart
 */
@Controller
public class HomePageController {
    // FIXME: do something nicer for the home page
    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("home");
    }

    @RequestMapping("/home")
    public ModelAndView home() {
        return new ModelAndView("home");
    }
}
