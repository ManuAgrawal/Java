import java.util.*;
public class setmap {
    public static void main(String[]args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("id0" , 1)  ;
        map.put("id1" , 2)  ;
        map.put("id2" , 3)  ;
        map.put("id3" , 4)  ;
        System.out.println(map.get("id0"));
        System.out.println(map.get("id3"));
        System.out.println(map.containsKey("id2"));

        map.remove("id2");
        System.out.println(map.get("id2"));
        System.out.println(map.containsKey("id2"));

        for (String key : map.keySet()) {
            System.out.println(key);

        }
        for (Integer value : map.values()) {
            System.out.println(value);
        }
        map.forEach((key, value) -> {
            // if (value.equals()){
            //     System.out.println(key);

            System.out.println( value);
            //}


        });


    }
}