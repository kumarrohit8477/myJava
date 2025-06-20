public class Array3 {
    public static void main(String[] args) {
        char[] charArray = new char[5]; // Declare a character array of size 5
        charArray[0] = 'H'; // Assign value to the first element
        charArray[1] = 'e'; // Assign value to the second element   
        charArray[2] = 'l'; // Assign value to the third element
        charArray[3] = 'l'; // Assign value to the fourth element
        charArray[4] = 'o'; // Assign value to the fifth element

        // Print the character array
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]); // Print each character
        }

        int[] intArray = new int[5]; // Declare an integer array of size 5
        intArray[0] = 1; // Assign value to the first element           
        intArray[1] = 2; // Assign value to the second element
        intArray[2] = 3; // Assign value to the third element
        intArray[3] = 4; // Assign value to the fourth element
        intArray[4] = 5; // Assign value to the fifth element
        System.out.println(); // Print a new line for better readability
        // Print the integer array
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " "); // Print each integer followed by a space
        }
    
    }
    
}
