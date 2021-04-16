import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       int myNumber = 0;
       for (int i=0;i<n;i++){
           myNumber = scanner.nextInt();
           System.out.println(isPrime(myNumber));
       }
       scanner.close();
    }
    
    public static String isPrime(int n){
        String output = "";
        if (n==1) return "Not prime";
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i == 0)
                return "Not prime";
        }
        return "Prime"; 
    }
}