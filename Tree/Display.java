package Tree;

public class Display {
    Insert insert =new Insert();
    
    public void Display_Tree(){
        display_node_helper(insert.root);
    }
    private void display_node_helper(Node temp){
        if(temp==null){
            return;
        }
        System.out.println(temp.data);
    }
}
