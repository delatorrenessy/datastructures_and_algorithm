public class HashingExample {
    public static void main(String[] args) {
        int[] hashTable = new int[10]; // table of size 10
        int[] keys = {12, 25, 37, 22};
        
        // Initialize hashTable with -1 (means empty)
        for (int i = 0; i < hashTable.length; i++) {
            hashTable[i] = -1;
        }

        // Insert keys using hash function key % 10
        for (int key : keys) {
            int index = key % 10;
            int originalIndex = index;
            
            // Linear probing: find next empty slot
            while (hashTable[index] != -1) {
                index = (index + 1) % hashTable.length; // move to next index (wrap around)
                // Optional safety check to avoid infinite loop
                if (index == originalIndex) {
                    System.out.println("Hash table is full! Could not insert key: " + key);
                    break;
                }
            }

            if (hashTable[index] == -1) {
                hashTable[index] = key;
                System.out.println("Key " + key + " stored at index " + index);
            }
        }

        // Display final hash table
        System.out.println("\nFinal Hash Table:");
        for (int i = 0; i < hashTable.length; i++) {
            System.out.println("Index " + i + ": " + hashTable[i]);
        }
    }
}

