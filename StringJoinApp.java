package com.cg.darden;

public class StringJoinApp {
    public static void main(String[] args) {
        // Define two strings
        String str1 = "hello";
        String str2 = "how are you";

        // Join the strings using the concat method
        String result = str1.concat(" ").concat(str2);

        // Print the result
        System.out.println("Joined String: " + result);
    }
}

