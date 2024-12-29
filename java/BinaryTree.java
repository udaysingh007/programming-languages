class BinaryTree {
    // Node class for the binary tree
    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            left = right = null;
        }
    }

    // Root node of the binary tree
    private Node root;

    // Method to insert a value into the binary tree
    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    // Recursive helper method to insert a value
    private Node insertRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value); // Create a new node
        }
        if (value < current.value) {
            current.left = insertRecursive(current.left, value); // Go to the left subtree
        } else if (value > current.value) {
            current.right = insertRecursive(current.right, value); // Go to the right subtree
        }
        return current; // Return the unchanged current node
    }

    // Method for in-order traversal of the binary tree
    public void inOrderTraversal() {
        inOrderRecursive(root);
    }

    // Recursive helper method for in-order traversal
    private void inOrderRecursive(Node node) {
        if (node != null) {
            inOrderRecursive(node.left); // Visit left subtree
            System.out.print(node.value + " "); // Print the value
            inOrderRecursive(node.right); // Visit right subtree
        }
    }

    public static void main(String[] args) {
        // Array of unordered integers
        int[] numbers = {10, 4, 15, 2, 8, 12, 20};

        // Create a binary tree
        BinaryTree binaryTree = new BinaryTree();

        // Insert elements into the binary tree
        for (int number : numbers) {
            binaryTree.insert(number);
        }

        // Print the numbers in ascending order using in-order traversal
        System.out.println("Numbers in ascending order:");
        binaryTree.inOrderTraversal();
        System.out.println();
    }
}

