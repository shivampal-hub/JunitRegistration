package com.bl.regex;

import java.util.regex.Pattern;

public class UserRegistrationUC3 {

    public boolean isValidEmail(String Email) {

            return isValidInput(Constants.EMAIL_REGEX, Email);

        }

        public static boolean isValidInput(String regex,String input) {
            return Pattern.matches(regex, input);

        }
}
