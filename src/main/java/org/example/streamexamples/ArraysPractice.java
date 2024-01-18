package org.example.streamexamples;
import java.util.Arrays;


public class ArraysPractice {

    // 3. Write a Java program to test if an array contains a specific value.
    public static boolean contains(int[] arr, int item) {
        // Iterate through each element 'n' in the array 'arr'.
        for (int n : arr) {
            // Check if 'item' is equal to the current element 'n'.
            if (item == n) {
                // If a match is found, return 'true'.
                return true;
            }
        }
        // If no match is found, return 'false'.
        return false;
    }

    public static void main(String[] args) {

        // w3resource
        // 1. sorting arrays
        int[] array1 = {11, -11, 189, -900, 55, 77};
        System.out.println("Original numeric array: " + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted numeric array: " + Arrays.toString(array1));

        String[] array2 = {"C++", "C#", "Java", "PHP", "SQL", "Python"};
        System.out.println("Original String array: " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted String array: " + Arrays.toString(array2));

        // 2. the sum of the elements of an array
        // the average of elements of an array
        int sum=0;
        int numberOfElements=0;
        int average=0;
        for(int i=0; i<array1.length; i++){
            sum =sum + array1[i];
            numberOfElements++;
        }
        average = sum / numberOfElements;
        System.out.println(sum);
        System.out.println(average);

        // 3. Write a Java program to test if an array contains a specific value.
        System.out.println(contains(array1, 7));

    }
}
