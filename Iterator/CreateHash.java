package Iterator;
import java.util.*;
public class CreateHash {
    public static void main(String args[]){
       ArrayList<String> list=new ArrayList<>();
       list.add("A");
       list.add("B");
       Iterator<String> it=list.iterator();
       while(it.hasNext()){
        System.out.println(it);
       }
    }
}
