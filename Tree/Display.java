package Tree;

public class Display extends Insert {
   
    public void Display_Tree(){
        display_node_helper(root);
    }
    private void display_node_helper(Node temp){
        if(temp==null){
            return;
        }
        display_node_helper(temp.left);
        System.out.println(temp.data);
        display_node_helper(temp.right);
    }
    public int count =100;
}
