package org.zhivko.taskManagement.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.zhivko.taskManagement.web.controllers.base.BaseController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class NotificationController extends BaseController {

    public NotificationController() {
    }


    @GetMapping(value = {"/notifications"})
    public ModelAndView indexView(ModelAndView modelAndView) {
        modelAndView.setViewName("pages/notifications/index");

        List<String> notifications = new ArrayList<>();
//        notifications.add("Hello, new features available.");
//        notifications.add("Welcome back ! We expected you. We wish you a good experience using our system.");
//        notifications.add("Hello, new updates available. Check them out.");

        modelAndView.addObject("notifications", notifications);

        return modelAndView;
    }
}
