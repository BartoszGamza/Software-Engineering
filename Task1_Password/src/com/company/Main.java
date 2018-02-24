package com.company;


public class Main {

    public static void main(String[] args) {

        // TestStrings
        String Password = "P@ssw0rd";

        // REGEX
        String RegEx = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$_]).{6,}$";

        System.out.println(Password.matches(RegEx));
    }
}
