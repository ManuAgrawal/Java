// Q1. Given a list of integers, return a list of squares of only even numbers.
//Input: [1, 2, 3, 4, 5]
//Output: [4, 16]
//Hint: Use filter() and map().

import java.util.*;
import java.util.stream.Collectors;

public class API_PRACTICE_QUESTION {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
            List<Integer> squaresOfEvenNumbers = numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .map(n -> n * n)
                    .collect(Collectors.toList());
            System.out.println(squaresOfEvenNumbers);

    }




}
