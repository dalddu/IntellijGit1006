package Codeup._1006;

import java.util.Scanner;

public class Q1027 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] b = a.split("\\.");
        int fir = Integer.valueOf(b[0]);
        int sec = Integer.valueOf(b[1]);
        int thd = Integer.valueOf(b[2]);
        System.out.printf("%02d-%02d-%04d", thd, sec, fir);
    }
}
