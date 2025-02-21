package Tree;

public class Main {
    public static void main(String[] args){
        Insert insert=new Insert();
        Display display=new Display();
        System.out.println("Tree is : ");
        insert.insert(45);
        insert.insert(48);
        insert.insert(50);
        display.Display_Tree();
    }
}
