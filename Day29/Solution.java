import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner  scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        while(p -->0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int max=0;
            for(int i=1;i<n;i++){
                for(int j=i+1;j<=n;j++){
                    int res = i&j;
                    if((res>max) && (res<k))
                        max = res;
                }
            }
            System.out.println(max);
        }
    }
}