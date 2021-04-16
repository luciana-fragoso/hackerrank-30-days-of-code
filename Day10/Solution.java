import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int sum = 0, remainder,aux = 0;
        
        scanner.close();
        
        while(n>0){
            remainder = n%2;
            if (remainder == 1){
                 sum++;
                if(sum >= aux) 
                    aux = sum;
            } else {
                sum = 0;
            }
           n = n/2;    
        }
        
        System.out.println(aux);
    }
}
