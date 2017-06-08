package com.springmvc.hellocontroller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;

/**
 * Created by ankitgupta on 6/3/17.
 */
public class DayOfWeeKBasedAccessInterceptor extends HandlerInterceptorAdapter {



    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Calendar cal = Calendar.getInstance();

        int dayofweek = cal.get(cal.DAY_OF_WEEK);

        if (dayofweek == 6)
        {
            response.getWriter().write("Website is closed");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle" + request.getRequestURI().toString());
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("Afer Completion" + request.getRequestURI().toString());
    }
}
