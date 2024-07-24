package Array;

public class MinMax {
    public static void main(String[] args) {
        int[] array={2,4,1,5,6,8,3,9};
        int min=array[0];
        int max=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
            if(array[i]>max){
                max=array[i];
            }

        }
        System.out.println("Minimum value: "+min);
        System.out.println("Maximum value: "+max);
    }
}
