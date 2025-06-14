import java.util.*;
public class containset{
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        TreeSet<Integer> set=new TreeSet<>();
        for(int i :arr){
            if(set.contains(i)){
                System.out.println(i);
                break;
            }
            set.add(i);
            System.out.println(i + " : "+ set.contains(i));
        }
    }
}