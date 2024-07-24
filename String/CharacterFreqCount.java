package String;
import java.util.*;
public class CharacterFreqCount {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.print("Enter String: ");
            String str=s.next();
            int  len=str.length();
            boolean visited[]=new boolean[len];
            Arrays.fill(visited,false);
            for(int i=0;i<len;i++){
                if(visited[i] == true){
                    continue;
                }
                int count=1;
                for(int j=i+1;j<len;j++){
                    if(str.charAt(i)==str.charAt(j)){
                        count++;
                        visited[j]=true;
                    }

                }

                System.out.print(str.charAt(i)+": "+count+", ");

            }
        }

}
