package com.springmvc.hellocontroller;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/**
 * Created by ankitgupta on 5/8/17.
 */
@RestController
public class StudentAdmissionController {

    @InitBinder
    public void initBinder(WebDataBinder binder)
    {
//        binder.setDisallowedFields(new String[] {"studentMobile"});
        binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
    }

    @RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
    public ModelAndView getAdmissionForm() throws Exception
    {
//        String exceptionOccured = "Arithmetic_Exception";
//
//        if (exceptionOccured.equalsIgnoreCase("Null_Pointer"))
//            throw new NullPointerException();
//        else if (exceptionOccured.equalsIgnoreCase("IO_Exception"))
//            throw new IOException();
//        else if (exceptionOccured.equalsIgnoreCase("Arithmetic_Exception"))
//            throw new ArithmeticException();

        ModelAndView modelAndView = new ModelAndView("AdmissionForm");
        return modelAndView;
    }

    @RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
    public ModelAndView submitAdmissionForm(@Valid @ModelAttribute ("student") Student student, BindingResult bindingResult)
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

    @RequestMapping(value = "/students", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public ArrayList<Student> getStudents(){

        Student s1 = new Student();
        Student s2 = new Student();

        s1.setStudentName("Ankit");
        s2.setStudentName("Gagan");

        ArrayList<Student> slist = new ArrayList<Student>();

        slist.add(s1);
        slist.add(s2);

        return slist;
    }

    @RequestMapping(value = "/students/{name}", method = RequestMethod.GET)
    public Student getStudent(@PathVariable("name") String studentName){

        Student s1 = new Student();

        s1.setStudentName(studentName);
        s1.setStudentHobby("WWe");

        return s1;
    }

    @RequestMapping(value = "/students/{name}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> updateStudent(@PathVariable("name") String studentName, @RequestBody Student student){

        System.out.println(studentName);
        System.out.println(student.getStudentName() + student.getStudentHobby());

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("key1","value1");
        httpHeaders.add("key2","value2");

        return new ResponseEntity<Boolean>(true, httpHeaders, HttpStatus.NOT_FOUND);
    }
}
