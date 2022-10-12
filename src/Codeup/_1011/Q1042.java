package Codeup._1011;

import java.util.Scanner;

public class Q1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();

        if (b!=0){
            System.out.println(a / b);
        } else {
            System.out.println("다시 입력하세요");
        }
    }
}
