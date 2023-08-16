import java.util.Scanner;
/**
 * Write a description of class Submission here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Submission1
{
    // instance variables - replace the example below with your own
    
    String nodes = "";
    int numOfNodes;
    static boolean verbose;
    private Node node;
    
    /**
     * Constructor for objects of class Submission
     */
    public Submission1()
    {
        node = null;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args) 
    {
        verbose = false;
        Scanner scanner = new Scanner(System.in);
        Submission1 BinaryTree = new Submission1();
        
        
        int response = 1;
        while(response >= 1 && response <= 9) {
            if (verbose) System.out.println("1. Insert an element into the BST");
            if (verbose) System.out.println("2. Search for an element in the BST");
            if (verbose) System.out.println("3. Find the maximum element from the BST");
            if (verbose) System.out.println("4. Find the minimum element from the BST");
            if (verbose) System.out.println("5. Print the elements in the BST in preorder");
            if (verbose) System.out.println("6. Print the elements in the BST in postorder");
            if (verbose) System.out.println("7. Print the elements in the BST in inorder");
            if (verbose) System.out.println("8. Delete an element");
            if (verbose) System.out.println("0. To exit the program");
            response = scanner.nextInt();
            switch(response) {
                case 1: 
                    System.out.println("1");
                    InsertElement (BinaryTree.node, scanner.nextInt());
                    break;
                case 2: 
                    System.out.println("2");
                    SearchElement (BinaryTree.node, scanner.nextInt());
                    break;
                case 3: 
                    System.out.println("3");
                    break;
                case 4: 
                    System.out.println("4");
                    break;
                case 5: 
                    System.out.println("5");
                    break;
                case 6: 
                    System.out.println("6");
                    break;
                case 7: 
                    System.out.println("7");
                    break;
                case 8: 
                    System.out.println("8");
                    break;
                case 0: 
                    System.out.println("0");
                    break;
                
            }
        }
        
    }
    
    private static class Node{
        int counter;
        int num;
        Node left;
        Node right;
        public Node (int data) {
            this.counter = 1;
            this.num = num;
            this.left = null;
            this.right = null;
            
        }
    }
    
    public static Node InsertElement(Node node, int x) 
    {
        Node newNode = new Node(x);
        if (node == null) {
            node = newNode;
        }
        else if (newNode.num == node.num) {
            node.counter += 1;
        }
        else{
            //while (newNode.num > node.num || newNode.num < node.num){
            if (newNode.num > node.num) {
                node.right = InsertElement(node.right, x);
            }
            else if (newNode.num < node.num){
                node.left = InsertElement(node.left, x);
            }
        
           // }   
        }
        return node; 
    }
    
    public static void SearchElement(Node node, int x) 
    {
        if (node == null) {
            System.out.println("0(0)");
        }
        else {
            if (x == node.num) {
                System.out.println(node.num + "(" + node.counter + ")");
            }
            else if (x > node.num) {
                SearchElement(node.right, x);
            }
            else if (x < node.num){
                SearchElement(node.left, x);
            }
            
        }
        
    }
        
    public static Node maxNode (Node node) {
        if (node == null) {
            System.out.println("0(0)");
            return null;
        }
        else if (node.right == null) {
            System.out.println(node.num + "(" + node.counter + ")");
        }
        else {
            maxNode(node.right);
        }
        return null;
    }
    
    public static Node minNode (Node node) {
        if (node == null) {
            System.out.println("0(0)");
            return null;
        }
        else if (node.left == null) {
            System.out.println(node.num + "(" + node.counter + ")");
        }
        else {
            maxNode(node.left);
        }
        return null;
    }
}