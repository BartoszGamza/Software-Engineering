package com.company;

public class Main {

    public static void main(String[] args) {

        String ToEnctypt = "abc";

        System.out.println(Encoding(ToEnctypt));



    }
    private static String Encoding (String text) {
        String newText = "";
        char c;
        int indx;

        for (int i = 0; i < text.length(); i++){
            indx = text.charAt(i);
            c = (char)(((indx + (indx + 1))-96)%255);
            newText += c;
        }
        return newText;
    }
}

