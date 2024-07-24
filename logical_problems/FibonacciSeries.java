package logical_problems;
import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=s.nextInt();
        int i=0;
        int j=1;
        int k=0;
        if(num==1){
            System.out.println("0");
        }else if (num==2){
            System.out.print("0 1 ");
        }
        else {
            System.out.print("0 1 ");
            for (int x = 1; x < num; x++) {
                k = i + j;
                System.out.print(k + " ");
                i = j;
                j = k;

            }
        }
    }
}
