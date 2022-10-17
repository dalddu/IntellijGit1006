package Codeup._1013;

import java.util.Scanner;

public class Q1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        for(int i = 0; i<3; i++){
            num[i] = sc.nextInt();
            if(num[i]%2==0){
                System.out.println("even");
            } else{
                System.out.println("odd");
            }
        }
    }
}
