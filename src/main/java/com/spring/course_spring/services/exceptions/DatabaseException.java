package com.spring.course_spring.services.exceptions;

import javax.swing.*;

public class DatabaseException  extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public DatabaseException(String msg){
        super(msg);
    }

}
