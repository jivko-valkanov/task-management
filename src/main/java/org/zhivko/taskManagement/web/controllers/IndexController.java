package org.zhivko.taskManagement.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.zhivko.taskManagement.web.controllers.base.BaseController;

@Controller
public class IndexController extends BaseController {

    public IndexController() {
    }

    @GetMapping("/")
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("pages/index");
        return modelAndView;
    }
}
