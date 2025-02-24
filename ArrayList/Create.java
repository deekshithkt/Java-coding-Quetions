package ArrayList;
import java.util.*;
public class Create {
    
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add(1,"D");

        //creating list 2
        ArrayList<String> list2=new ArrayList<String>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add(1,"D");

        
    //     System.out.println(list);
    //    list.set(1,"E");
    //    System.out.println(list);
    //    list.remove("Cfdfsfs");
    //    System.out.println(list);


       //to get the size of the list  
    //    System.out.println("Size of the list is : "+list.size());
    //    System.out.println(list.isEmpty() + " " +!list.isEmpty());
    //    System.out.println(list.contains("A"));
    //    System.out.println(list.indexOf("A"));
    //    for(String items :list){
    //     System.out.println(items);
    //    }


    //   Collections.sort(list);
    //   System.out.println(list);

      //merging two nested loops 
      Collections.sort(list,Collections.reverseOrder());
      ArrayList<ArrayList<String>> nest=new ArrayList<>();
      nest.add(list2);
      nest.add(list);
      System.out.println(nest);

    }
}
