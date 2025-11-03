public class LinearSearchExample {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2}; // array to search in
        int target = 4; // number to find

        int result = linearSearch(numbers, target);

        if (result == -1)
            System.out.println("Element not found.");
        else
            System.out.println("Element found at index: " + result);
    }

    // Function to perform linear search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // return index if found
            }
        }
        return -1; // return -1 if not found
    }
}
