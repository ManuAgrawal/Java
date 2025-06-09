//Q3. Find the sum of all odd numbers in a list.
//Input: [1, 2, 3, 4, 5]
//Output: 9
//Hint: Use filter() and reduce().

import java.util.*;
import java.util.stream.Collector;
public class ASP_PRACTICE_QUESTION_03 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                sum += number;
            }
        }
        System.out.println(sum);

    }
}
