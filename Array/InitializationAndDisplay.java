package Array;
import java.util.*;
public class InitializationAndDisplay {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n=s.nextInt();
        int [] array=new int[n];
        System.out.println("Enter Array Elements");
        for(int i=0;i<n;i++){
            array[i]=s.nextInt();
        }
        System.out.println("\nDisplaying Array....");
        for(int i:array){
            System.out.print(i+" ");
        }

    }
}
