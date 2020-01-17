package com.company.user;

import com.company.ROLE;

import java.util.ArrayList;

public  class User {

    private String userName = "";
    private String Password = null;
    private ROLE role;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        if (checkString(password) == true) {
            Password = password;
        }
    }

    public ROLE getRole() {
        return role;
    }

    public void setRole(ROLE role) {
        this.role = role;
    }

    public User(String userName, String password, ROLE role) {
        this.userName = userName;
        Password = password;
        this.role = role;
    }

    private boolean checkString(String input) {
        String specialChars = "#%!";
        char currentCharacter;
        boolean numberPresent = false;
        boolean upperCasePresent = false;
        boolean lowerCasePresent = false;
        boolean specialCharacterPresent = false;

        int countdigit = 0;

        for (int i = 0; i < input.length(); i++) {
            currentCharacter = input.charAt(i);
            if (Character.isDigit(currentCharacter)) {
                ++countdigit;
            } else if (Character.isUpperCase(currentCharacter)) {
                upperCasePresent = true;
            } else if (Character.isLowerCase(currentCharacter)) {
                lowerCasePresent = true;
            } else if (specialChars.contains(String.valueOf(currentCharacter))) {
                specialCharacterPresent = true;
            } else if (countdigit >= 3) {
                numberPresent = true;
            }
        }

        return
                numberPresent && upperCasePresent && lowerCasePresent && specialCharacterPresent;
    }


}
