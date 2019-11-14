class Node 
{ 
    int data; 
    Node left, right; 
  
    public Node(int item) 
    { 
        data = item; 
        left = right = null; 
    } 
} 
  
class BinaryTree 
{ 
    Node root; 
  
    void inver() 
    { 
        root = inver(root); 
    } 
  
    Node inver(Node node) 
    { 
        if (node == null) 
            return node; 
        Node left = inver(node.left); 
        Node right = inver(node.right); 
        node.left = right; 
        node.right = left; 
  
        return node; 
    } 
  
    void inOrder() 
    { 
        inOrder(root); 
    }
    void inOrder(Node node) 
    { 
        if (node == null) 
            return; 
  
        inOrder(node.left); 
        System.out.print(node.data + " "); 
  
        inOrder(node.right); 
    } 
  
    public static void main(String args[]) 
    { 
        BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(40); 
        tree.root.left = new Node(30); 
        tree.root.right = new Node(70); 
        tree.root.left.left = new Node(20); 
         tree.root.left.right = new Node(35); 
        tree.root.right.left = new Node(50); 
         tree.root.right.right = new Node(80); 
        tree.inOrder(); 
        System.out.println(""); 
        tree.inver(); 
        System.out.println("inverse of a binary tree"); 
        tree.inOrder(); 
  
    } 
} 