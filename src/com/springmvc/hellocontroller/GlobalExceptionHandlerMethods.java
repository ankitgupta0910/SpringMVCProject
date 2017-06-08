package com.springmvc.hellocontroller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

/**
 * Created by ankitgupta on 6/3/17.
 */
@ControllerAdvice
public class GlobalExceptionHandlerMethods {

    @ExceptionHandler(value = NullPointerException.class)
    public ModelAndView handleNullPointerException()
    {
        System.out.println("Null Exception Occured");

        ModelAndView modelAndView = new ModelAndView("NullPointerException");
        //return "NullPointerException";
        return modelAndView;
    }

    @ExceptionHandler(value = IOException.class)
    public ModelAndView handleIOException()
    {
        System.out.println("IO Exception Occured");

        ModelAndView modelAndView = new ModelAndView("IOException");
        //return "NullPointerException";
        return modelAndView;
    }

//    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = Exception.class)
    public ModelAndView handleException(Exception e)
    {
        System.out.println("IO Exception Occured" + e);

        ModelAndView modelAndView = new ModelAndView("Exception");
        //return "NullPointerException";
        return modelAndView;
    }

}
