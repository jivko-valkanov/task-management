package org.zhivko.taskManagement.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.zhivko.taskManagement.web.controllers.base.BaseController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController extends BaseController {

    public HomeController() {
    }

    @GetMapping(value = {"/","/inbox"})
    public ModelAndView indexView(ModelAndView modelAndView) {
        modelAndView.setViewName("pages/index");
        List<String> inboxTasks = new ArrayList<>();
        inboxTasks.add("task 1");
        inboxTasks.add("task 2");
        inboxTasks.add("task 3");
        inboxTasks.add("task 4");
        inboxTasks.add("task 5");
        inboxTasks.add("task 6");
        modelAndView.addObject("inboxTasks", inboxTasks);
        return modelAndView;
    }

    @GetMapping(value = {"/today"})
    public ModelAndView todayView(ModelAndView modelAndView) {
        modelAndView.setViewName("pages/today_tasks");
        return modelAndView;
    }

    @GetMapping(value = {"/future"})
    public ModelAndView nextSevenDaysView(ModelAndView modelAndView) {
        modelAndView.setViewName("pages/future_tasks");
        return modelAndView;
    }
}
