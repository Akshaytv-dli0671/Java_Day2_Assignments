package Array;

import java.util.ArrayList;

public class SeperatePositiveAndNegative {
    public static void main(String[] args) {
        int [] array={3,4,-2,1,-4,9};
        ArrayList<Integer>pos=new ArrayList<>();
        ArrayList<Integer>neg=new ArrayList<>();


        for(int i:array){
            if(i<0){
                neg.add(i);

            }else{
                pos.add(i);
            }
        }
        System.out.println("positive array: "+pos);
        System.out.println("Negative array: "+neg);
    }
}
