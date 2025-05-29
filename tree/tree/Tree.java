package tree.tree;

/*
MEMBERS: 
Bien Nino Enric Navarez Iligan 
John Benedict Budlao Bancruz 
Keegan Jeoff Gabato Liboon 
 */
import java.util.Scanner;

public class Tree {

    public static Scanner sc = new Scanner(System.in);
    public static BinaryTree tree = new BinaryTree();

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1. View Allowance\n2. Add Allowance");
            System.out.println("Enter your choice: ");
            int choice ;

            try { //reads nunmber only
                choice = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine();
                continue;
            }

            switch (choice) {
                case 1 -> ViewAllowance();
                case 2 -> Allowance();
                default ->
                    System.out.println("Invalid choice. Please try again.");
            }

        }

    }

    public static void ViewAllowance() {
//        System.out.println("Tree: "+ tree.root);
        if (tree.root != null) {
            System.out.println("Allowance Inorder: ");
            BiggestToLowest(tree.root);
        } else {
            System.out.println("Tree is empty.");
            return;
        }
    }

    public static int Allowance() {

        System.out.println("Enter Allowance: ");
        int allowance = sc.nextInt();

        tree.insert(allowance);

        return allowance;
    }

    public static void BiggestToLowest(Node root) {
        if (root != null) {
            BiggestToLowest(root.right);
            System.out.print(root.value + " ");
            BiggestToLowest(root.left);
        }
    }
}
