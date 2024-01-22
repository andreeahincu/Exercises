package org.example.streamexamples.exceptions;

import java.util.Scanner;

import static java.lang.Math.round;

public class ExceptionHandling {

    // 2. Write a Java program to create a method that takes an integer as a parameter
    // and throws an exception if the number is odd.
//    public static void checkIfEven(int number) throws OddNumberException{
//        if(number % 2!=0){
//            throw new OddNumberException(number + " is an odd number");
//        }
//    }

    // From chatgpt
    // 1. Write a Java program that takes two integers as input from the user
    // and performs division. Handle the ArithmeticException that may occur
    // if the user attempts to divide by zero.
//    public static int divideNumbers(int x, int y) throws ArithmeticException{
//        if(y==0){
//            throw new ArithmeticException("Cannot divide by zero");
//        }
//        return x/y;
//    }

    //Exercise 5: Custom Exception
    // 5. Define a custom exception class called NegativeValueException. Write a program that takes an integer
    // as input and throws the NegativeValueException if the entered value is negative.
//    public static void checkPositive(int number) throws NegativeValueException{
//        if(number<0){
//            throw new NegativeValueException("Negative value is not allowed");
//        }
//    }
    public static void main(String[] args) {
        // 1.
//        double x = 2;
//        double y = 12;
//        double result;
//        try {
//            result = x/y;
//            System.out.println("Result: " + result);
//        } catch (ArithmeticException e){
//            System.out.println("Error: " + e.getMessage());
//        }

        // 2. Write a Java program to create a method that takes an integer
        // as a parameter and throws an exception if the number is odd.
//        try{
//            int number=7;
//            checkIfEven(number);
//            System.out.println(number + " is an even number");
//        } catch(OddNumberException e){
//            System.err.println("Error: " + e.getMessage());
//        }

        // From chatgpt
        // Exercise 1: Divide by Zero: Write a Java program that takes two integers as input from the user
        // and performs division. Handle the ArithmeticException that may occur
        // if the user attempts to divide by zero.
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Type the first number: ");
//        int nr1 = scanner.nextInt();
//        System.out.println("Type the second number: ");
//        int nr2 = scanner.nextInt();
//
//        try{
//            int result=nr1/nr2;
//            System.out.println("Result:" + result);
//        }catch(ArithmeticException e){
//            System.err.println("Error: " + e.getMessage());
//        }

        // Exercise 2: Array Index Out of Bounds
        //2. Create an array of integers. Write a program that prompts the user to enter an index and displays
        // the corresponding element. Handle the ArrayIndexOutOfBoundsException if the user provides an index
        // that is outside the bounds of the array.
//        int[] arr = {5, 7, 77, 545, 27};
//        System.out.println("Type the index for the element you would like to get: ");
//        int userIndex = scanner.nextInt();
//       try{
//           System.out.println("Element at index " + userIndex + " is: " + arr[userIndex]);
//       } catch(IndexOutOfBoundsException e){
//           System.err.println("Error: " +e.getMessage());
//       }

       // Exercise 4: Number Format
      //  4. Create a program that prompts the user to enter a number. Use Integer.parseInt to convert the input
        //  to an integer. Handle the NumberFormatException if the input is not a valid integer.
//       try {
//           System.out.println("Type an input: ");
//           String userInput = scanner.next();
//           int convertInput = Integer.parseInt(userInput);
//           System.out.println("Converted number: " + convertInput);
//       } catch(NumberFormatException e){
//           System.err.println("Error: " + e.getMessage());
//       }

        //Exercise 5: Custom Exception
       // 5. Define a custom exception class called NegativeValueException. Write a program that takes an integer
        // as input and throws the NegativeValueException if the entered value is negative.
//        try{
//            System.out.println("Type a positive integer: ");
//            int userInput = scanner.nextInt();
//            checkPositive(userInput);
//            System.out.println("your positive int is: " + userInput);
//        } catch(NegativeValueException e){
//            System.err.println("error: "+ e.getMessage());
//        }

    // Exercise 6: Null Pointer
        // 6. Create a program that uses an object reference without initializing it.
        // Handle the NullPointerException that may occur.

        try{
            String x=null;
            int length = x.length();
        }catch(NullPointerException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
}
