package com.company;

import jdk.nashorn.internal.runtime.regexp.joni.Syntax;
import java.util.Arrays;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {

        String NIP = "123-456-32-18";

        if (DashSyntax(NIP) == true)  ArrayNIP(NIP);
        else System.out.println("Incorrect NIP synax");
    }

    public static boolean DashSyntax (String NIP){

        String RegEx = "\\d{3}-\\d{3}-\\d{2}-\\d{2}";

        if (NIP.matches(RegEx) == true) {
            return true;
        }
        else
            return false;

    }

    public static void ArrayNIP (String NIP) {

         String NoDash = NIP.replaceAll("\\D+","");

         int[] Nippay = new int[NoDash.length()];
        for (int i=0; i<NoDash.length(); i++){
            Nippay[i] = NoDash.charAt(i) - '0' ;
        }
//        System.out.println(Arrays.toString(Nippay));

        CheckNip(Nippay);

    }

    public static void CheckNip (int[] NIP) {
        int[] weight = {6,5,7,2,3,4,5,6,7};
        int[] result = new int[9];

        for (int i=0;i<9;i++){
            result[i] = NIP[i] * weight[i];
        }
        int sum =0;
        for (int i =0; i<result.length;i++){
            sum+=result[i];
        }
        System.out.println("sum = " + sum);

        int mod11 = sum%11;

        System.out.println("mod11 = " + mod11);

        if (NIP[9] == mod11) {
            System.out.println("NIP is correct, ck = mod11 = " + mod11);
        }else System.out.println("NIP is wrong");
    }
}

