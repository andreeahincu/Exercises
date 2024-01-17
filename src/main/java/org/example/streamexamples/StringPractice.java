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
//        String s1 = "Lion";
//        String s11 = "Lion";
//        String s2 = " is a wild animal";
//        String s3 = s1.concat(s2);
       // System.out.println(s3);

        // 8. Write a Java program to test if a given string contains the specified sequence of char values.
//        boolean condition = s3.contains("al");
//        System.out.println(condition);
       // boolean result = s1.equalsIgnoreCase(s11);
       // System.out.println(result);

        //String methods - geeksforgeeks
        // 1. length()
//        System.out.println("GeeksforGeeks".length());
//        System.out.println("something".length());
//        System.out.println("iiiiiiiiiiii    iiiiiiiiiiiiiiiii".length());
//        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaa".length());

        // 2. char charAt(int index) - returns the element at the index position
       // System.out.println("GeeksforGeeks".charAt(3));

        // 3. String substring(int i) - return from index i to the end
        //System.out.println("GeeksforGeeks".substring(3));

        // 4. String substring(int i, int j) - returns the substring from i to j-i index
        "GeeksforGeeks".substring(2, 5); // in this case from 2 to 4 - "eks"

        //5. String concat(String str) - concatenates the String str at the end of the
        // given string
//        String s1 = "Geeks";
//        String s2 = "forGeeks";
//        String output = s1.concat(s2);
//        System.out.println(output);

        // 6. int indexOf(String s) - returns the index within the string of the first
        // occurence of the specified string
//        String s = "Learn Share Learn";
//        int output = s.indexOf("Share");
//        int output2 = s.indexOf("Learn");
//        System.out.println(output);
//        System.out.println(output2);

        // 7. int indexOf(String s, int i) - returns the index within the string of the first
        // occurence of the specified string, starting at the specified index
//        String s = "Learn Share Learn";
//        int output = s.indexOf("Learn", 3);
//        System.out.println(output);

        // 8. int lastIndexOf(String s) - return the index within the string of the last
        // occurence of the specified string
//        String s = "Learn Share Learn";
//        int output = s.lastIndexOf("a");
//        System.out.println(output);

        // 9. boolean equals(Object otherObj) - compares the string to the specified object
//        Boolean output = "Geeks".equals("Geeks");
//        System.out.println(output);
//        Boolean output2 = "Geeks".equals("geeks");
//        System.out.println(output2);

        // 10. boolean equalsIgnoreCase(String anotherString) - compares string to another
        // string, ignoring case considerations
//        Boolean output1 = "Geeks".equalsIgnoreCase("Geeks");
//        Boolean output2 = "Geeks".equalsIgnoreCase("geeks");
//        Boolean output3 = "Geeks".equalsIgnoreCase("GEEKS");
//        System.out.println(output1);
//        System.out.println(output2);
//        System.out.println(output3);

        //11. int compareTo(String anotherString) - compares 2 strings lexicographically
//       String s1 = "aaa";
//       String s2 = "bbb";
//        int out = s1.compareTo(s2);
        //if out <0 s1 comes before s2
        // out = 0 s1 and s2 are equal
       // out > 0 s1 comes after s2

        // 12. int compareToIgnoreCase(String anotherString) - Compares two strings
        // lexicographically, ignoring case considerations.

        // 13. String toLowerCase() / String toUpperCase()
//        String word1 = "HeLLo";
//        String word2 = word1.toLowerCase();
//        System.out.println(word2);
//        String word3 = word1.toUpperCase();
//        System.out.println(word3);

        // 14. String trim() - Returns the copy of the String, by removing
        // whitespaces at both ends. It does not affect whitespaces in the middle.
//        String word1 = "   Learn   Share    Learn   ";
//        String word2 = word1.trim();
//        System.out.println(word2);

        // 15. String replace(char oldChar, char newChar)
        String s1 = "feeksforfeeks";
        String s2 = s1.replace('f', 'g');
        System.out.println(s2);

        // 16. boolean contains(String s)
        // 17.  boolean startsWith(String s)
    }
}
