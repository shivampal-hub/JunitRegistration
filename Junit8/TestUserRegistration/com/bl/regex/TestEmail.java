package com.bl.regex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestEmail {

    static UserRegistrationUC4 registration;

    @Before
    public void createObject() {

        registration = new UserRegistrationUC4();
        System.out.println("Before");

    }

    @Test
    public void testValidEmailCase1_thenTrue() {

        System.out.println("Test : Valid Email");
        Assert.assertTrue(registration.isValidEmail("shivammppal@gmail.com"));

    }

    @Test
    public void testValidEmailCase2_thenTrue() {

        System.out.println("Test : Valid Email");
        Assert.assertTrue(registration.isValidEmail("shivamm.ppal@gmail.com"));

    }

    @Test
    public void testValidEmailCase3_thenTrue() {

        System.out.println("Test : Valid Email");
        Assert.assertTrue(registration.isValidEmail("shivammppal@gmail.co.in"));

    }

    @Test
    public void testValidEmailCase4_thenTrue() {

        System.out.println("Test : Valid Email");
        Assert.assertTrue(registration.isValidEmail("shivamm.ppal@gmail.co.in"));

    }

    @Test
    public void testInvalidEmailCase5_thenFalse() {

        System.out.println("Test : Invalid Email");
        Assert.assertFalse(registration.isValidEmail("shivammppal@.gmail.com"));

    }

    @Test
    public void testInvalidEmailCase6_thenFalse() {

        System.out.println("Test : Invalid Email");
        Assert.assertFalse(registration.isValidEmail("shivammppal@gmail.com.australia"));

    }
}
