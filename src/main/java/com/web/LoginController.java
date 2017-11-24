package com.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by asd on 17-11-10.
 */
@RestController
public class LoginController {
    @RequestMapping("/login")
    public ModelAndView login(){
        return new ModelAndView("home");
    }
}
