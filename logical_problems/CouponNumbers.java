package logical_problems;

import com.sun.jdi.IntegerType;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CouponNumbers {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=s.nextInt();
        int count=0;
        Set<Integer>set=new HashSet<>();
        while(set.size()<num){
            int value_generated=generateRandomNumber();
            set.add(value_generated);
            count++;
        }
        System.out.println(set);
        System.out.println("Count:"+count);

    }

    public static int generateRandomNumber(){
        Random random_num=new Random();
        return random_num.nextInt(10);
    }
}
