import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Test {

    static class Node {
        int value;
        Node left;
        Node right;
    
        public Node(int val) {
            value = val;
            left = right = null;
        }
    
        void insert(Node current, int val) {
            if (val < current.value) {
                if (current.left != null) {
                    current.left.insert(current.left, val);
                } else {
                    current.left = new Node(val);
                }
            } else {
                if (current.right != null) {
                    current.right.insert(current.right, val);
                } else {
                    current.right = new Node(val);
                }
            }
        }
    
        void print(Node current) {
            if (current.left != null) {
                current.left.print(current.left);
            }
    
            System.out.println(current.value + " ");
    
            if (current.right != null) {
                current.right.print(current.right);
            }
        }
    };

    public static void main(String[] args) {
        System.out.println("Hello World!!");

        int[] numbers = {10, 4, 15, 2, 8, 12, 20};

        Node root = new Node(numbers[0]);

        for (int i=1; i < numbers.length; i++ ) {
            root.insert(root, numbers[i]);
        }

        System.out.println("Printing out the ordered array");
        root.print(root);
    }
}
