/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree.tree;

/**
 *
 * @author Admin
 */
public class BinaryTree {
    Node root;
    
    public void insert(int value){
        root = insertRec(root,value);
    }
    private Node insertRec(Node root, int value){
        if (root == null){ //iff root is empty
            return new Node(value); //reutrn new instantiated node
        }
        
        if(value < root.value){ //if value is sgreater than whatst in the root
            root.left = insertRec(root.left, value);
        }else if (value > root.value){
            root.right = insertRec(root.right, value);
        }
        return root;
    }
    public void inorder(){inorderRec(root);}
        
    
    public void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.println(root.value +" ");
            inorderRec(root.right);
        }
    }
}
