public class thisKeyword {
    int abc;
    int xyz;
    // Constructor to initialize the instance variables
    thisKeyword(int abc) {
        // Using 'this' to refer to the instance variables
        this.abc = abc;   
    }
    public static void main(String[] args) {
        thisKeyword obj = new thisKeyword(10);
        // Printing the value of the instance variable 'abc'
        System.out.println("Value of abc: " + obj.abc);
       
    }
}
