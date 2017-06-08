package com.springmvc.hellocontroller;


import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;


/**
 * Created by ankitgupta on 5/8/17.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Student {

    private String studentName;

    @Size(min=2, max=30, message = "Student Hobby should be between {min} and {max}")
    private String studentHobby;

    private Long studentMobile;
    private Date studentDob;
    private ArrayList<String> studentSkills;
    private Address studentAddress;

    public Address getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(Address studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentHobby() {
        return studentHobby;
    }

    public void setStudentHobby(String studentHobby) {
        this.studentHobby = studentHobby;
    }

    public Long getStudentMobile() {
        return studentMobile;
    }

    public void setStudentMobile(Long studentMobile) {
        this.studentMobile = studentMobile;
    }

    public Date getStudentDob() {
        return studentDob;
    }

    public void setStudentDob(Date studentDob) {
        this.studentDob = studentDob;
    }

    public ArrayList<String> getStudentSkills() {
        return studentSkills;
    }

    public void setStudentSkills(ArrayList<String> studentSkills) {
        this.studentSkills = studentSkills;
    }

}
