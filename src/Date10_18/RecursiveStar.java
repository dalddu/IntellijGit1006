package Date10_18;

public class RecursiveStar {
    public void printARow(int n, String now) {
        if(n==now.length()) {
            System.out.println(" ");
            return;
        }
        System.out.println("*");
        printARow(10,now+"*");
    }

    public static void main(String[] args) {
        new RecursiveStar().printARow(5, "");
    }
}
