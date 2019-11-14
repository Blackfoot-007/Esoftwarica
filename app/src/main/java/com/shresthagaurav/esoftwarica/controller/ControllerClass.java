package com.shresthagaurav.esoftwarica.controller;

import com.shresthagaurav.esoftwarica.model.UserData;

public class ControllerClass {
    public boolean CheckUser(UserData sd) {
        if ((sd.getName().equals("gaurav")) && (sd.getPassword().equals("1234"))) {
            return true;

        } else {
            return false;
        }
    }

}
