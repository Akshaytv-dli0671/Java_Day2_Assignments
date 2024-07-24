package logical_problems;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=s.nextInt();
        int flag=1;
        for(int i=2;i<=(num/2);i++){
            if(num%i==0){
                flag=0;
                System.out.println("Not a Prime number!");
                break;
            }

        }
        if(flag==1){
            System.out.println("prime number");
        }
    }
}
