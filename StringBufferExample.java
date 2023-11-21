package com.cg.darden;

public class StringBufferExample {
    public static void main(String[] args) {
        // Using String concatenation
        String str = "Hello";
        for (int i = 0; i < 10000; i++) {
            str += " World";
        }
        System.out.println("Using String concatenation: " + str);

        // Using StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");
        for (int i = 0; i < 10000; i++) {
            stringBuffer.append(" World");
        }
        System.out.println("Using StringBuffer: " + stringBuffer.toString());
    }
}

