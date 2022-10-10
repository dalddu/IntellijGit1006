package Codeup._1006;

import java.util.Scanner;

public class Q1023 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] b = a.split("\\.");
        System.out.printf("%s\n%s", b[0],b[1]);
    }
}

