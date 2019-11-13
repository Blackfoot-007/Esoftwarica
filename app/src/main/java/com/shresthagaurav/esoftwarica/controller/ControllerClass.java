package com.shresthagaurav.esoftwarica.controller;

import com.shresthagaurav.esoftwarica.model.DataSet;

public class ControllerClass {
    public boolean CheckUser(DataSet sd) {
        if ((sd.getName().equals("gaurav")) && (sd.getPassword().equals("1234"))) {
            return true;

        } else {
            return false;
        }
    }
}
