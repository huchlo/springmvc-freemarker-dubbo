package com.web;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by asd on 17-11-10.
 */
@RestController
public class errorController {
    @RequestMapping("/error")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response, ModelMap map){

        String 浏览器请求的编码类型=request.getHeader("Accept-Encoding");   //gzip
        String 请求方式postget等=request.getMethod();
        String 当前url=request.getRequestURI();
        String 请求者的url=request.getRemoteAddr();//request.getRemoteHost();
        int 请求者的发送端口=request.getRemotePort();

        int resstatus=response.getStatus();
        ModelAndView mav = new ModelAndView("benotfound");
        if(resstatus == 404){
            mav.addObject("message", "Not Found The Page.404");
        }else if(resstatus == 500){
            mav.addObject("message", "Server Internal Error.500");
        }else{
            mav.addObject("message", "Unknown mistake."+resstatus);
        }
        return mav;
    }
}
