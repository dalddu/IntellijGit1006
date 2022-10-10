package Codeup._1007;

import java.util.Scanner;

public class Q1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(0<a && a<=255) {
            char b = (char)a;
            System.out.println(b);
        }else {
            System.out.println(" 다시 입력하세요 ");
        }
    }
}
