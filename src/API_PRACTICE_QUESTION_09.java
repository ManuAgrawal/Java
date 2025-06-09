//Q9. Multiply all the numbers in a list using reduce().
//Input: [1, 2, 3, 4]
//Output: 24
//Hint: Use reduce(1, (a, b) -> a * b)


import java.util.*;
import java.util.stream.*;
public class ASP_PRACTICE_QUESTION_09 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println(product);
    }
}
