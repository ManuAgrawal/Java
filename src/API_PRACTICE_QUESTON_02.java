/*Q2. Given a list of names, return a list of names in uppercase which have more than 3 characters.
        Input: ["Ram", "Shyam", "Om", "Sita"]
Output: ["SHYAM", "SITA"]
Hint: Use filter() and map().*/
import java.util.*;
import java.util.stream.Collectors;
public class API_PRACTICE_QUESTON_02 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Shyam", "Om", "Sita");
        List<String> result = names.stream()
                .filter(name -> name.length() > 3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
