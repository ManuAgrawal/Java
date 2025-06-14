//Q4. Convert a list of words to their lengths.
//Input: ["Java", "Stream", "API"]
//Output: [4, 6, 3]
//Hint: Use map


import java.util.*;
public class API_PRACTICE_QUESTION_04 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API");
        List<Integer> lengths = new ArrayList<>();
        for (String word : words) {
            lengths.add(word.length());
        }
        System.out.println(lengths);
    }
}
