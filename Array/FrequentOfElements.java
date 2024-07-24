package Array;
import java.util.*;
public class FrequentOfElements {
    public static void main(String[] args) {
        int a[]={1,3,4,5,6,6,4,3,1};
        int  len=a.length;
        boolean visited[]=new boolean[len];
        Arrays.fill(visited,false);
        for(int i=0;i<len;i++){
            if(visited[i] == true){
                continue;
            }
            int count=1;
            for(int j=i+1;j<len;j++){
                if(a[i]==a[j]){
                    count++;
                    visited[j]=true;
                }

            }

            System.out.println("count of "+a[i]+": "+count);

        }
    }
}

