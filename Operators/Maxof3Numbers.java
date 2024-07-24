package Operators;

import java.util.Scanner;

public class Maxof3Numbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a>=b && a>=c){
            System.out.println("Largest: "+a);
        }
        else if (b>=a && b>=c){
            System.out.println("Largest: "+b);
        }else{
            System.out.println("Largest: "+c);
        }
    }
}
