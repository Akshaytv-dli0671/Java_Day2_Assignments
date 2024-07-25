package Operators;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=s.nextInt();
        System.out.println("Enter elements:");
        float sum=0;
        for(int i=0;i<n;i++){
            int num=s.nextInt();
            sum+=(float)num;
        }
        System.out.println("Average: "+(sum/(float)n));
    }
}
