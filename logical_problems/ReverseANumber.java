package logical_problems;

import java.util.Scanner;

public class ReverseANumber {
    public static int reverse(int n){
        if(n<10){
            System.out.println(n);
            return n;
        }else{
            System.out.print(n%10);
            n=n/10;
            reverse(n);

        }
        return 0;


    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=s.nextInt();
        reverse(num);//using recursion
        System.out.println();
        int rev=0;
        while(num>0){
            int rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        System.out.print("Reverse: "+rev);

    }
}
