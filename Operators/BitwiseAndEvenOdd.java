package Operators;

import java.util.Scanner;

public class BitwiseAndEvenOdd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        System.out.println((check(num))?"Odd":"Even");

    }
    static boolean check(int n){
        if((n &1)==1){
            return true;
        }else{
            return false;
        }
    }
}
