public class noOfOccur {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 1};
        int target = 1; // Element to count occurrences of
        int count = 0; // Counter for occurrences

        while(true) {
            // Loop through the array to count occurrences
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    count++;
                }
            }
        }
    }
}