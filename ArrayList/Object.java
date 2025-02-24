package ArrayList;
import java.util.*;
public class Object {
    String name;
    int age;
    Object(String name , int age){
       this.name=name;
       this.age=age;
    }
    @Override
    public String toString(){
        return name+" "+age;
    }
  
   
    public static void main(String args[]){
    ArrayList<Object> list =new ArrayList<>();
    ArrayList<Object> list2=new ArrayList<>();
    list.add(new Object("Deelaksha",21));
    list.add(new Object("Unkown", 0));
    System.out.println(list);
    list2.add(new Object("Harshith",27));
    list2.add(new Object("Poornesh", 25));
    System.out.println(list2);
    ArrayList<ArrayList<Object>> nest=new ArrayList<>();
    nest.add(list);
    nest.add(list2);
    System.out.println(nest);
    }
}
