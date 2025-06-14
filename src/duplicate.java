import java.util.*;
public class duplicate {
    public static void main(String[] args){
// HashSet<Integer> hash = new HashSet<>();
// hash.add(10);
// hash.add(20);
// hash.add(30);
// hash.add(20);
// hash.add(30);
// System.out.println("HashSet with duplicates: " + hash);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(20); // Adding duplicate
        arr.add(30); // Adding duplicate
        System.out.println("ArrayList with duplicates: " + arr);

        // Removing duplicates using HashSet
        Set<Integer> uniqueSet = new HashSet<>(arr);
        System.out.println("Unique elements: " + uniqueSet);

        // Converting back to ArrayList if needed
        ArrayList<Integer> uniqueList = new ArrayList<>(uniqueSet);
        System.out.println("ArrayList after removing duplicates: " + uniqueList);

    }
}