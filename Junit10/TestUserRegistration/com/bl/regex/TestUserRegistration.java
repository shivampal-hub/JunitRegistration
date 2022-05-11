package com.bl.regex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestUserRegistration {

    static UserRegistrationUC10 registration;

    @Before
    public void createObject() {
        registration = new UserRegistrationUC10();
        System.out.println("Before");
    }

    @Test
    public void testValidFirstNameFirstLetterCapital_thenTrue() {

        System.out.println("Test : Valid First Name With First Letter Capital");
        Assert.assertTrue(registration.isValidFirstName("Shivam"));
    }

    @Test
    public void testValidFirstNameFirstLetterCapitalMinThreeChar_thenTrue() {

        System.out.println("Test : Valid First Name With First Letter Capital and min Three Char");
        Assert.assertTrue(registration.isValidFirstName("Shi"));
    }

    @Test
    public void testInvalidFirstNameFirstLetterNonCapital_thenFalse() {

        System.out.println("Test : Invalid First Name With First Letter non Capital");
        Assert.assertFalse(registration.isValidFirstName("shi"));
    }

    @Test
    public void testInvalidFirstNameLessThanThreeLetter_thenFalse() {

        System.out.println("Test : Invalid First Name With Less then three  Letter ");
        Assert.assertFalse(registration.isValidFirstName("Sh"));
    }

    @Test
    public void testValidLastNameFirstLetterCapital_thenTrue() {

        System.out.println("Test : Valid Last Name With First Letter Capital");
        Assert.assertTrue(registration.isValidLastName("Shivam"));
    }

    @Test
    public void testValidLastNameFirstLetterCapitalMinThreeChar_thenTrue() {

        System.out.println("Test : Valid Last Name With First Letter Capital and min Three Char");
        Assert.assertTrue(registration.isValidLastName("Shi"));
    }

    @Test
    public void testInvalidLastNameFirstLetterNonCapital_thenFalse() {

        System.out.println("Test : Invalid Last Name With First Letter non Capital");
        Assert.assertFalse(registration.isValidLastName("shi"));
    }

    @Test
    public void testInvalidLastNameLessThanThreeLetter_thenFalse() {

        System.out.println("Test : Invalid Last Name With Less then three  Letter ");
        Assert.assertFalse(registration.isValidLastName("Sh"));
    }

    @Test
    public void testValidEmailCase1_thenTrue() {

        System.out.println("Test : Valid Email");
        Assert.assertTrue(registration.isValidEmail("abc@yahoo.com"));

    }

    @Test
    public void testValidEmailCase2_thenTrue() {

        System.out.println("Test : Valid Email");
        Assert.assertTrue(registration.isValidEmail("abc-100@yahoo.com"));

    }

    @Test
    public void testValidEmailCase3_thenTrue() {

        System.out.println("Test : Valid Email");
        Assert.assertTrue(registration.isValidEmail("abc.100@yahoo.com"));

    }

    @Test
    public void testValidEmailCase4_thenTrue() {

        System.out.println("Test : Valid Email");
        Assert.assertTrue(registration.isValidEmail("abc111@abc.com"));

    }

    @Test
    public void testValidEmailCase5_thenTrue() {

        System.out.println("Test : Valid Email");
        Assert.assertTrue(registration.isValidEmail("abc-100@abc.net"));

    }

    @Test
    public void testValidEmailCase6_thenTrue() {

        System.out.println("Test : Valid Email");
        Assert.assertTrue(registration.isValidEmail("abc.100@abc.com.au"));

    }

    @Test
    public void testValidEmailCase7_thenTrue() {

        System.out.println("Test : Valid Email");
        Assert.assertTrue(registration.isValidEmail("abc@1.com"));

    }

    @Test
    public void testValidEmailCase8_thenTrue() {

        System.out.println("Test : Valid Email");
        Assert.assertTrue(registration.isValidEmail("abc@gmail.com.com"));

    }

    @Test
    public void testValidEmailCase9_thenTrue() {

        System.out.println("Test : Valid Email");
        Assert.assertTrue(registration.isValidEmail("abc+100@gmail.com"));

    }



    @Test
    public void testInvalidEmailCase1_thenFalse() {

        System.out.println("Test : Invalid Email");
        Assert.assertFalse(registration.isValidEmail("shivammppalgmail.com"));

    }

    @Test
    public void testInvalidEmailCase2_thenFalse() {

        System.out.println("Test : Invalid Email");
        Assert.assertFalse(registration.isValidEmail("abc@.com.my"));

    }

    @Test
    public void testInvalidEmailCase3_thenFalse() {

        System.out.println("Test : Invalid Email");
        Assert.assertFalse(registration.isValidEmail("abc123@gmail.a"));

    }

    @Test
    public void testInvalidEmailCase4_thenFalse() {

        System.out.println("Test : Invalid Email");
        Assert.assertFalse(registration.isValidEmail("abc123@.com"));

    }

    @Test
    public void testInvalidEmailCase5_thenFalse() {

        System.out.println("Test : Invalid Email");
        Assert.assertFalse(registration.isValidEmail("abc123@.com.com"));

    }

    @Test
    public void testInvalidEmailCase6_thenFalse() {

        System.out.println("Test : Invalid Email");
        Assert.assertFalse(registration.isValidEmail(".abc@abc.com"));

    }

    @Test
    public void testInvalidEmailCase7_thenFalse() {

        System.out.println("Test : Invalid Email");
        Assert.assertFalse(registration.isValidEmail("abc()*@gmail.com"));

    }

    @Test
    public void testInvalidEmailCase8_thenFalse() {

        System.out.println("Test : Invalid Email");
        Assert.assertFalse(registration.isValidEmail("abc@%*.com"));

    }

    @Test
    public void testInvalidEmailCase9_thenFalse() {

        System.out.println("Test : Invalid Email");
        Assert.assertFalse(registration.isValidEmail("abc..2002@gmail.com"));

    }

    @Test
    public void testInvalidEmailCase10_thenFalse() {

        System.out.println("Test : Invalid Email");
        Assert.assertFalse(registration.isValidEmail("abc.@gmail.com"));

    }

    @Test
    public void testInvalidEmailCase11_thenFalse() {

        System.out.println("Test : Invalid Email");
        Assert.assertFalse(registration.isValidEmail("abc@abc@gmail.com"));

    }

    @Test
    public void testInvalidEmailCase12_thenFalse() {

        System.out.println("Test : Invalid Email");
        Assert.assertFalse(registration.isValidEmail("abc@gmail.com.1a"));

    }

    @Test
    public void testInvalidEmailCase13_thenFalse() {

        System.out.println("Test : Invalid Email");
        Assert.assertFalse(registration.isValidEmail("abc@gmail.com.aa.au"));

    }

    @Test
    public void testValidMobileNumberStartingWithSeven_thenTrue() {

        System.out.println("Valid : Number");
        Assert.assertTrue(registration.isValidMobile("91 7999295772"));

    }

    @Test
    public void testValidMobileNumberStartingWithEight_thenTrue() {

        System.out.println("Valid : Number");
        Assert.assertTrue(registration.isValidMobile("91 8999295772"));

    }


    @Test
    public void testValidMobileNumberStartingWithNine_thenTrue() {

        System.out.println("Valid : Number");
        Assert.assertTrue(registration.isValidMobile("91 9999295772"));

    }


    @Test
    public void testInvalidMobileNumberWithNineDigits_thenFalse() {

        System.out.println("InValid : Number");
        Assert.assertFalse(registration.isValidMobile("91 999929577"));

    }

    @Test
    public void testInvalidMobileNumberWithElevenDigits_thenFalse() {

        System.out.println("InValid : Number");
        Assert.assertFalse(registration.isValidMobile("91 99992957712"));

    }

    @Test
    public void testInvalidMobileNumberStartingWithTwo_thenFalse() {

        System.out.println("InValid : Number");
        Assert.assertFalse(registration.isValidMobile("91 2999295771"));

    }

    @Test
    public void testInvalidMobileNumberStartingWithThree_thenFalse() {

        System.out.println("InValid : Number");
        Assert.assertFalse(registration.isValidMobile("91 3999295771"));

    }

    @Test
    public void testInvalidMobileNumberStartingWithFour_thenFalse() {

        System.out.println("InValid : Number");
        Assert.assertFalse(registration.isValidMobile("91 4999295771"));

    }

    @Test
    public void testInvalidMobileNumberStartingWithFive_thenFalse() {

        System.out.println("InValid : Number");
        Assert.assertFalse(registration.isValidMobile("91 5999295771"));

    }

    @Test
    public void testValidMobileNumberStartingWithSix_thenTrue() {

        System.out.println("Valid : Number");
        Assert.assertTrue(registration.isValidMobile("91 6999295771"));

    }

    @Test
    public void testValidPasswordAtleastOneUpperCaseOneNumericValueOneSpecialCharAndMinEightCharacter_thenTrue() {

        System.out.println("Valid : Password");
        Assert.assertTrue(registration.isValidPassword("qwertY@q1q"));

    }

    @Test
    public void testInvalidPasswordAtleastOneUpperCaseOneNumericValueAndMinEightCharacter_thenTrue() {

        System.out.println("Valid : Password");
        Assert.assertFalse(registration.isValidPassword("qwertYq1q"));

    }


    @Test
    public void testInvalidPasswordAtleastOneUpperCaseAndMinEightCharacter_thenTrue() {

        System.out.println("Invalid : Password");
        Assert.assertFalse(registration.isValidPassword("qwertYqwq"));

    }

    @Test
    public void testInvalidPasswordWithoutUpperCaseAndMinEightCharacter_thenFalse() {

        System.out.println("Invalid : Password");
        Assert.assertFalse(registration.isValidPassword("qwertqwq"));

    }

    @Test
    public void testInvalidPasswordLessThanEightCharacter_thenFalse() {

        System.out.println("Invalid : Password");
        Assert.assertFalse(registration.isValidPassword("qwe"));

    }
}
