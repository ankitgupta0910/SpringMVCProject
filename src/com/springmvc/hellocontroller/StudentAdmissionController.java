package com.springmvc.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by ankitgupta on 5/8/17.
 */
@Controller
public class StudentAdmissionController {

    @InitBinder
    public void initBinder(WebDataBinder binder)
    {
        binder.setDisallowedFields(new String[] {"studentMobile"});
    }

    @RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
    public ModelAndView getAdmissionForm()
    {
        ModelAndView modelAndView = new ModelAndView("AdmissionForm");
        return modelAndView;
    }

    @RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
    public ModelAndView submitAdmissionForm(@ModelAttribute ("student") Student student, BindingResult bindingResult)
    {

        if (bindingResult.hasErrors())
        {
            ModelAndView modelAndView = new ModelAndView("AdmissionForm");
            modelAndView.addObject("headerMessage", "Congratulations");
            return modelAndView;
        }

        ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
        modelAndView.addObject("msg", "Congratulations");
        return modelAndView;
    }

    @ModelAttribute
    public void addingCommonObjects(Model modelAndView)
    {
        modelAndView.addAttribute("headerMessage", "Student Admission Form for Engineering Courses");
    }
}
