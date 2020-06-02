package org.zhivko.taskManagement.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.zhivko.taskManagement.web.controllers.base.BaseController;

@Controller
public class IndexController extends BaseController {

    public IndexController() {
        //
    }

    @GetMapping("/")
    public String indexView() {
        return super.redirect("/inbox");
    }
}
