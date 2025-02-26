package HashMap;
import java.util.*;
public class Creation {


    public static void main(String args[]){
      HashMap<String,Integer> map= new HashMap<>();
      map.put("A", 1);
      map.put("B", 2);
      map.put("C", 3);
      map.put("D", 4);

      System.out.println(map.get("A"));

    // to display the key valules
    //   for(String sets:map.keySet()){
    //     System.out.println(sets);
    //   }

    for(int val:map.values()){
        System.out.println(val);
    }
    }
}
