package Tree;

public class Main  {
    public static void main(String[] args){
       Display display=new Display();
       Search search=new Search();
       display.insert(1);
       display.insert(2);
       display.Display_Tree();
       search.search(1);

    }
}
