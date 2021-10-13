package com.generation;

public class Main {

    public static void main(String[] args) {
        // write your code here

        /*
        String message = greet("Diego");
        System.out.println(message);

        System.out.println(sum(5, 7));

        //gatillo de función void
        alert("help! I don't get it, yet");
         */

        System.out.println(Math.PI);

        String msg1 = "hello";
        String msg2 = "bye:)";
        System.out.println(msg1.length());
        System.out.println(msg2.length());

        //te dice si tus string dicen lo mismo sin impostar mayusculas
        System.out.println(msg1.equals(msg2));

        System.out.println(msg1.toUpperCase());

    }

    public static String greet(String name) {
        return "hi, how r u doing, " + name + "?";
    }

    public static int sum(int numA, int numB) {
        return numA + numB;
    }

    //ejecuta
    public static void alert(String message) {
        System.out.println(message);
    }

}
