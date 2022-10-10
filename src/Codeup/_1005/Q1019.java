package Codeup._1005;

import java.util.Scanner;

public class Q1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = sc.next().split("\\.");
        int year = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int date = Integer.parseInt(str[2]);

        System.out.print(String.format("%04d.%02d.%02d", year, month, date));


    }
}
