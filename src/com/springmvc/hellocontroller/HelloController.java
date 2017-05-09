package com.springmvc.hellocontroller;

//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.AbstractController;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * Created by ankitgupta on 5/7/17.
// */
//public class HelloController extends AbstractController {
//
//
//    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception{
//        ModelAndView modelAndView = new ModelAndView("HelloPage");
//        modelAndView.addObject("welcomeMessage","Hi Ankit");
//        return modelAndView;
//    }
//}

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class HelloController{
    @RequestMapping("/welcome/{countryName}/{userName}")
    public ModelAndView helloWorld(@PathVariable Map<String,String> pathvars)
    {
        String name = pathvars.get("userName");
        String country = pathvars.get("countryName");
        ModelAndView modelAndView = new ModelAndView("HelloPage");
        modelAndView.addObject("welcomeMessage", "Hello " + name + " " + country);
        return modelAndView;
    }
}