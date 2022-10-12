package Codeup._1011;

import java.util.Scanner;

public class Q1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long result = a+b+c;
        float average = (float)result/3;

        System.out.println(result);
        System.out.println(average);

    }
}
