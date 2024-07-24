package String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str1=s.next();
        String str=str1.toLowerCase();
        boolean value=palindrom(str);
        System.out.println(value);

    }
    public static boolean palindrom(String str){
        int i=0;
        int j=str.length()-1;
        int flag=0;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){

                flag=1;
                return false;

            }
            i++;j--;
        }
        if(flag==0){
            return true;
        }
        else{
            return false;
        }
    }
}
