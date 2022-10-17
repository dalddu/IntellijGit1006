package Codeup._1014;

import java.util.Scanner;

public class Q1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char A = sc.next().charAt(0);
        char B = 'a';
        while (A>=B){
            System.out.print(B+" ");
            B++;
        }

    }
}
