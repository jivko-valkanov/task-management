package org.zhivko.taskManagement.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.zhivko.taskManagement.web.controllers.base.BaseController;

@Controller
@RequestMapping("/auth")
public class AuthController extends BaseController {

    public AuthController() {
    }

    @GetMapping("/login")
    public ModelAndView getLoginPage(ModelAndView modelAndView) {
        modelAndView.setViewName("pages/auth/login");
        return  modelAndView;
    }

    @GetMapping("/registration")
    public ModelAndView getRegistrationPage(ModelAndView modelAndView) {
        modelAndView.setViewName("pages/auth/registration");
        return  modelAndView;
    }
}
