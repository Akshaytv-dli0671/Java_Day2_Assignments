package Array;
import java.util.*;
public class MatrixMultiply {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int a[][]={{1,2,1},{1,2,2},{1,1,1}};
        int b[][]={{1,1,1},{2,1,1},{3,0,3}};
        int c[][]=new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++){
                    c[i][j]+=a[i][k]*b[k][j];

                }
                System.out.print(c[i][j]+" ");


            }
            System.out.println();
        }


    }


}
