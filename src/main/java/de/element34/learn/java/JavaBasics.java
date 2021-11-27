package de.element34.learn.java;

/**
 * Course for learning Java
 * Lecture 1: Java Basics
 * 1 Printing a message to standard out
 */
public class JavaBasics {
    /**
     * The main method is the entry point to your java program.
     * It always has a String array as a parameter and returns nothing.
     */
    public static void main(String[] args) {
        // Define a variable to hold the message
        String message = "Hello I am your first Java program!";
        // Print a message to the commandline
        System.out.println(message);
        // An integer variable
        int number = 2;
        System.out.println("Number = " + number);
        int addition = 5 + number;
        System.out.println("5 + " + number + " = " + addition);
        int multiplication = 5 * number;
        System.out.println("5 * " + number + " = " + multiplication);
        int division = 4 / number;
        System.out.println("4 / " + number + " = " + division);
        int substraction = 5 - number;
        System.out.println("5 - " + number + " = " + substraction);
    }
}
