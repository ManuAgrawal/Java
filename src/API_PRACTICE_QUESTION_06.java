import java.util.*;
public class ASP_PRACTICE_QUESTION_06 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "Avocado");
        int count = 0;
        for (String word : words) {
            if (word.toLowerCase().startsWith("a")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
