//Q8. Check if any number in a list is divisible by 7.
//Input: [10, 14, 22, 30]
//Output: true
//Hint: Use anyMatch().

import java.util.*;
import java.util.stream.*;
public class ASP_PRACTICE_QUESTION_08 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 14, 22, 30);
        boolean result = numbers.stream()
                .anyMatch(n -> n % 7 ==0);
        System.out.println(result);

    }
}
