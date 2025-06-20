public class Array {
    public static void main(String[] args) {
        int[] array = {54, 5, 24, 26, 23, 21, 1, 53, 34, 11};
        int value = 0;
        for(int i=0; i < array.length; i++) {
            value +=array[i];
        }
        System.out.println("The sum of the array elements is: "+ value);
    }
}
