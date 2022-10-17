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
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("라인 수를 입력하세요>> ");
        String tmp = sc.nextLine();
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.println("*");
            }
        }   System.out.println();

    }
}
