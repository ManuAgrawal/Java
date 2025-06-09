import java.util.*;
public class ASP_PRACTICE_QUESTION_05 {
    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(999, 1000, 1500, 1000, 2000);
        Set<Integer> uniquePrices = new HashSet<>(prices);

        int totalSum = 0;
        for (int price : uniquePrices) {
            if (price > 1000) {
                totalSum += price;
            }
        }
        System.out.println(totalSum);
    }
}
