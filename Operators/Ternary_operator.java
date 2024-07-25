package Operators;

import java.util.Scanner;

public class Ternary_operator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int a=s.nextInt();
        int b=s.nextInt();
        int result=(a<b)?a:b;
        System.out.println("Smallest: "+result);
    }
}
