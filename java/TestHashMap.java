import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {
        // Create a HashMap to store names and their corresponding ages
        HashMap<String, Integer> ageMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 35);

        // Print the HashMap
        System.out.println("Initial HashMap: " + ageMap);

        // Access a value using a key
        System.out.println("Age of Bob: " + ageMap.get("Bob"));

        // Update the value for a key
        ageMap.put("Alice", 26);
        System.out.println("After updating Alice's age: " + ageMap);

        // Remove a key-value pair
        ageMap.remove("Charlie");
        System.out.println("After removing Charlie: " + ageMap);

        // Iterate over the HashMap using entrySet()
        System.out.println("Iterating over the HashMap:");
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }

        // Check if a key exists
        System.out.println("Does the HashMap contain 'Bob'? " + ageMap.containsKey("Bob"));

        // Check if a value exists
        System.out.println("Does the HashMap contain the age 30? " + ageMap.containsValue(30));

        // Get the size of the HashMap
        System.out.println("Size of the HashMap: " + ageMap.size());

        // Clear all key-value pairs
        ageMap.clear();
        System.out.println("After clearing the HashMap: " + ageMap);
    }
}
