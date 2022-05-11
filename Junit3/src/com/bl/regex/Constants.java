package com.bl.regex;

public class Constants {

    private Constants() {

    }
    public final static String LastName_REGEX = "^[A-Z][a-z]{2,}$";
    public final static String EMAIL_REGEX = "^[a-z0-9]{1,}([.+-][0-9a-z]{1,})?@[a-z0-9]{1,}+(.[a-z]{2,4})([.+-][a-z]{1,3})?$";
}
