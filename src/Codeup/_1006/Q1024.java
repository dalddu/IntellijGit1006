package Codeup._1006;

import java.util.Scanner;

public class Q1024 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i = 0; i<a.length(); i++) {
            System.out.printf("\'%s\'\n", a.charAt(i));
        }
    }
}