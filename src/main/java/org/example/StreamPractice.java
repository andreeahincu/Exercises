package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPractice {

    // quadratic equation
//    private static double calculateDelta(double a, double b, double c){
//        double delta= b*b -4*a*c;
//        return delta;
//    }
    public static void main(String[] args) {
        // get input from user
//        Scanner scanner = new Scanner(System.in);
        // quadratic equation
//        System.out.print("a is: ");
//        double a = scanner.nextDouble();
//        System.out.print("b is: ");
//        double b = scanner.nextDouble();
//        System.out.print("c is: ");
//        double c = scanner.nextDouble();

//        if(calculateDelta(a, b, c)>0){
//            double x1=(-b-Math.sqrt(calculateDelta(a,b,c))/(2*a));
//            double x2=(-b+Math.sqrt(calculateDelta(a,b,c))/(2*a));
//            System.out.println("Delta is a real number. The solutions are: \n"+ x1 + "\nand " + x2);
//        } else if(calculateDelta(a,b,c)==0){
//            double x = -b/(2*a);
//            System.out.println("Delta is 0. The solution is:\n" +x);
//        } else{
//            System.out.println("Delta is negative. The solutions are not real numbers!");
//        }

        // switch example
//        System.out.print("Type a number for the day of the week: ");
//        int dayOfWeek = scanner.nextInt();
//        switch(dayOfWeek){
//            default:
//                System.out.println("weekday");
//            case 1:
//                System.out.println("Saturday");
//                //break;
//            case 2:
//                System.out.println("Sunday");
//                break;
//        }

        // STREAMS
        // INTERMEDIATE OPERATIONS EXAMPLES
        // filter() operation example
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<Integer> evenNumbers = numbers.stream()
//                .filter(n -> n % 2 ==0)
//                .collect(Collectors.toList());
//        System.out.print("original list: " + numbers);
//        System.out.println();
//        System.out.print("filtered list: " + evenNumbers);

        // sort() operation example
//        List<String> words = Arrays.asList("hello", "world", "how", "are", "you");
//
//        List<String> sortedWords = words.stream()
//                .sorted(Comparator.comparing(String::length))
//                .collect(Collectors.toList());
//        System.out.print("original list: " + words);
//        System.out.println();
//        System.out.print("sorted list: " + sortedWords);

        // distinct() operation example
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 6, 7, 4, 8);
//
//        List<Integer> distinctNumbers = numbers.stream()
//                .distinct()
//                .collect(Collectors.toList());
//
//        System.out.println("original list: " + numbers);
//        System.out.println("modified list with distinct operation: " + distinctNumbers);

        // map() operation example
        // transform each element of a Stream using a function
//        List<String> words = Arrays.asList("hello", "world", "how", "are", "you");
//
//        List<Integer> wordsLength = words.stream()
//                .map(String::length)
//                .collect(Collectors.toList());
//        System.out.println("original list: " + words);
//        System.out.println("mapped list: " + wordsLength);

        //flatMap() example - transform each element of a Stream into zero or more elements using a function
//        List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1, 2),
//                Arrays.asList(3, 4, 5),
//                Arrays.asList(6, 7, 8, 9));
//
//        List<Integer> flattenedNumbers = numbers.stream()
//                .flatMap(Collection::stream)
//                .collect(Collectors.toList());
//        System.out.println(flattenedNumbers);

        // TERMINAL OPERATIONS EXAMPLES
        // forEach() - perform an action on each element of the Stream
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        numbers.stream()
//                .forEach(System.out::println);

        // collect() - Collect the elements of the Stream into a Collection or other data structure
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> squareNumbers = numbers.stream()
//                .map(n -> n * n)
//                .collect(Collectors.toList());
//        System.out.println(squareNumbers);

     // reduce() - perform a reduction operation on the Stream, returning a single result
//     List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//     int sum = numbers.stream()
//             .reduce(0, (a, b) -> a+b);
//        System.out.println(sum);

        // count() - count the number of elements on the Stream
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        long count = numbers.stream()
//                .count();
//        System.out.println(count);

        // anyMatch() - check if any elements of the Stream match a given predicate
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        boolean hasEvenNumbers = numbers.stream()
//                .anyMatch(n -> n % 2 ==0);
//        System.out.println(hasEvenNumbers);

        // Stream exercises from chat gpt
        // Exercise 1: Filtering. Given a list of integers, create a new list containing only the even numbers.
//        List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99);
//        List<Integer> evenNumbers = numbers.stream()
//                .filter(n -> n % 2 == 0)
//                .collect(Collectors.toList());
//        System.out.println(evenNumbers);

       // Exercise 2: Mapping. Given a list of strings, transform each string to uppercase and collect the results into a new list.
//        List<String> words = Arrays.asList("Hi", "new", "year", "get yourself a new job");
//        List<String> uppercaseWords = words.stream()
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//        System.out.println(uppercaseWords);

        // Exercise 3: Sorting. Sort a list of strings in ascending order based on their length.
//        List<String> words = Arrays.asList("Hi", "new", "year", "getyourselfanewjob");
//        List<String> sortedWords = words.stream()
//                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
//                .collect(Collectors.toList());
//        System.out.println(sortedWords);

        // Exercise 4: Reducing. Calculate the sum of all even numbers in a list of integers.
//        List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99);
//        int sum = numbers.stream().reduce(0, (a, b) -> (a+b));
//        System.out.println(sum);

        // Exercise 5: Collecting. Given a list of names, create a new list containing only unique names (remove duplicates)
//        List<String> words = Arrays.asList("no", "no", "hello", "duplicates", "duplicates");
//        List<String> words2 = words.stream()
//                .distinct()
//                .collect(Collectors.toList());
//        System.out.println(words2);

        // Exercise 10: Chaining Operations
        //Perform the following operations on a list of integers:
        //Filter out odd numbers.
        //Square each remaining number.
        //Find the sum of the squared numbers.
//        List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99);
//        int sum = numbers.stream()
//                .filter(n -> n%2!=0)
//                .map(n -> n*n)
//                .reduce(0, (a,b) -> (a+b));
//        System.out.println(sum);

        // Examples from geeksforgeeks
        // map() method
//        List<Integer> number = Arrays.asList(2, 3, 4, 5);
//        List<Integer> square = number.stream()
//                .map( x -> x * x)
//                .collect(Collectors.toList());
//        System.out.println(square);

        // filter method
    //    List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
//        List<String> result = names.stream()
//                .filter(s -> s.startsWith("C"))
//                .collect(Collectors.toList());
//        System.out.println(result);

        // sorted() method
//        List<String> show = names.stream()
//                .sorted()
//                .collect(Collectors.toList());
//        System.out.println(show);

    }
}