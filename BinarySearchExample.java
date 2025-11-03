public class BinarySearchExample {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 8, 10, 15, 20}; // must be sorted
        int target = 10;

        int result = binarySearch(numbers, target);

        if (result == -1)
            System.out.println("Element not found.");
        else
            System.out.println("Element found at index: " + result);
    }

    // Function to perform binary search
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // find middle index

            if (arr[mid] == target)
                return mid; // target found
            else if (arr[mid] < target)
                left = mid + 1; // search right half
            else
                right = mid - 1; // search left half
        }
        return -1; // not found
    }
}
