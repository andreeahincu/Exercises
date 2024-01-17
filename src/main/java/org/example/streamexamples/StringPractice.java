package org.example.streamexamples;

public class StringPractice {


    public static void main(String[] args) {

        // From w3resource
        // 1. Write a Java program to get the character at the given index within the string.
//        String s1 = "Andreea";
//        char givenCharacter0= s1.charAt(0);
//        char givenCharacter1= s1.charAt(1);
//        char givenCharacter2= s1.charAt(2);
//        char givenCharacter3= s1.charAt(3);
//        char givenCharacter4= s1.charAt(4);
//        char givenCharacter5= s1.charAt(5);
//        char givenCharacter6= s1.charAt(6);
//        System.out.println(givenCharacter0);
//        System.out.println(givenCharacter1);
//        System.out.println(givenCharacter2);
//        System.out.println(givenCharacter3);
//        System.out.println(givenCharacter4);
//        System.out.println(givenCharacter5);
//        System.out.println(givenCharacter6);

        // 5. Write a Java program to compare two strings lexicographically.
        //Two strings are lexicographically equal if they are the same length
        // and contain the same characters in the same positions.
//        String s1 = "  Hello, world! How are you?";
//        String s2 = "  Hello, world! How are you?";
//        String s3 = "  Hello, darling! How are you?";
//        int result1 = s1.compareTo(s2); // compares lexicographically
//        int result2 = s1.compareTo(s3);
//        int result3 = s3.compareTo(s2);
 //       System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3);
//
//        if(result1>0){
//            System.out.println(s1 + " is greater than " + s2);
//        } else if(result1==0){
//            System.out.println(s1 + " and " + s2 + " are lexicographically equal");
//        } else {
//            System.out.println(s1 + " is smaller than " + s2);
//        }
//
//        int rez = s1.compareToIgnoreCase(s2); // compares lexicographically and ignores case differences

        // concat 2 strings
        String s1 = "Lion";
        String s11 = "Lion";
        String s2 = " is a wild animal";
        String s3 = s1.concat(s2);
       // System.out.println(s3);

        // 8. Write a Java program to test if a given string contains the specified sequence of char values.
//        boolean condition = s3.contains("al");
//        System.out.println(condition);
        boolean result = s1.equalsIgnoreCase(s11);
       // System.out.println(result);

        //String methods - geeksforgeeks
        // 1. length()
//        System.out.println("GeeksforGeeks".length());
//        System.out.println("something".length());
//        System.out.println("iiiiiiiiiiii    iiiiiiiiiiiiiiiii".length());
//        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaa".length());

        // 2. char charAt(int index) - returns the element at the index position
        System.out.println("GeeksforGeeks".charAt(3));

        // 3. String substring(int i, int j) - returns the substring from i to j-i index
        "GeeksforGeeks".substring(2, 5); // in this case from 2 to 4 - "eks"


    }
}
