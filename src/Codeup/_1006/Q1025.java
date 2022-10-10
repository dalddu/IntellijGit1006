package Codeup._1006;

import java.util.Scanner;

public class Q1025 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String s = String.valueOf(i);

        System.out.println("["+s.charAt(0)+"0000]");
        System.out.println("["+s.charAt(1)+"000]");
        System.out.println("["+s.charAt(2)+"00]");
        System.out.println("["+s.charAt(3)+"0]");
        System.out.println("["+s.charAt(4)+"]");

    }
}