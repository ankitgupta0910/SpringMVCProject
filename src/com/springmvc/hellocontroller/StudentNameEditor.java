package com.springmvc.hellocontroller;

import java.beans.PropertyEditorSupport;

/**
 * Created by ankitgupta on 6/1/17.
 */
public class StudentNameEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String studentNAme) throws IllegalArgumentException {
        if (studentNAme.contains("Mr. ") || studentNAme.contains("Ms. "))
        {
            setValue(studentNAme);
        }
        else {
            studentNAme = "Ms. " + studentNAme;
            setValue(studentNAme);
        }
    }
}
