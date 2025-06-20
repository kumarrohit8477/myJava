public class Array2 {
    public static void main(String[] args) {
        String[] name ={ "sachin", "sourav", "rahul", "virat"};
        int[] age = { 30, 35, 40, 28};
        char [] grade = {'A', 'B', 'C', 'D'};
        char [] grade2 = {'a','b','c','d'};
        for(int i = 0; i < name.length; i++) {
            System.out.println("Name: " + name[i] + ", Age: " + age[i] + ", Grade: " + grade[i] + ", Grade2: " + grade2[i]);
        }

    }
}
