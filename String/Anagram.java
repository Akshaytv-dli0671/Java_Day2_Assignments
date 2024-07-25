package String;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter string1: ");
        String str1=s.next();
        System.out.print("Enter string2: ");
        String str2=s.next();
        int count=0;
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    count++;
                }
            }
        }
        if(count==str1.length()){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
