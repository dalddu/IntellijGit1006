package Date10_17;
import java.util.Scanner;

public class RightTriangle2 {
    public static void main(String[] args) {
        /*
        *
        * *
        * * *
        * * * *
         */
        System.out.println("라인 수를 입력하세요>> ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1; i<=num; i++) {
            for(int j=1; j<=i;  j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
