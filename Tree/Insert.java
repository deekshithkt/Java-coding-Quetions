package Tree;

public class Insert {
    public Node root=null;

    public void insert(int data){
       root=insert_helper(root,data);
    }
    private Node insert_helper(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
        if(data<root.data){
         root.left=insert_helper(root.left, data);
        }
        else if(data>root.data){
            root.right=insert_helper(root.right, data);
        }
        return root;
    }
}
