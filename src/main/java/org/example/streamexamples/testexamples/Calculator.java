package org.example.streamexamples.testexamples;

public class Calculator {


        public int addNumbers(int a, int b){
            return a+b;
        }

        public int multiplyNumbers(int a, int b){
            return a*b;
        }

        public int subtractNumbers(int a, int b){
            return Math.abs(a-b);
        }

        public double divideNumbers(int a, int b){
            if(b==0){
                System.out.println("Cannot divide by 0");
            }
                return a/b;
        }
}
