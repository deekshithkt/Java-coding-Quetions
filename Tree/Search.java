package Tree;
public class Search extends Insert {
    public void search(int data){
         search_helper(root,data);
    }
    private void search_helper(Node root,int data){
        if(root==null){
            System.out.println("element not found");
            return;
        }
       
            search_helper(root.left,data);
            search_helper(root.right,data);
            System.out.println("element found");
    }
}
