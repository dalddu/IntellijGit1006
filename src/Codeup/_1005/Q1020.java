package Codeup._1005;

import java.util.Scanner;

public class Q1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        String[] nums = num.split("-");

        String a=nums[0];
        String b=nums[1];

        System.out.println(a+b);
    }
}
