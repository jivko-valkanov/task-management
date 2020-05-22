package org.zhivko.taskManagement.web.controllers.base;

import org.springframework.web.servlet.ModelAndView;

public class BaseController {

    /**
     *
     * @param path
     * @return String
     */
    protected String redirect(String path) {
        return String.format("redirect:%s", path);
    }

    /**
     *
     * @param path
     * @return ModelAndView
     */
    protected ModelAndView modelAndViewRedirect(String path) {
        return new ModelAndView(this.redirect(path));
    }

}
