package Operators;
import java.util.*;
public class mUtiplication_table {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=s.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i+" * "+num+" = "+(num*i));
        }
    }


}
