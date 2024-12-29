import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        // Create a List of strings
        List<String> fruits = new ArrayList<>();

        // Add elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Print the list
        System.out.println("Fruits list: " + fruits);

        // Access elements by index
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Second fruit: " + fruits.get(1));

        // Remove an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Iterate over the list using a for-each loop
        System.out.println("Iterating using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Iterate using a traditional for loop
        System.out.println("Iterating using traditional for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // Check if the list contains an element
        System.out.println("Does the list contain 'Apple'? " + fruits.contains("Apple"));

        // Get the size of the list
        System.out.println("Size of the list: " + fruits.size());

        // Clear the list
        fruits.clear();
        System.out.println("After clearing the list: " + fruits);
    }
}
