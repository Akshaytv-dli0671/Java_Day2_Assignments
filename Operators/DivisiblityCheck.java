package Operators;

import java.util.Scanner;

public class DivisiblityCheck {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=s.nextInt();
        if(num % 5==0 && num%7==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
