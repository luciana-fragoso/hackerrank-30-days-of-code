import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
       
       Scanner scan = new Scanner(System.in);
       int count = scan.nextInt();
       String s = "", even, odd;
       do {
        s = scan.next();
        even = "";
        odd = "";
        for (int i=0;i<s.length();i++){
            if (i%2 == 0)
                even+=s.charAt(i);
            else
                odd+=s.charAt(i);
        }
        System.out.println(even+" "+odd);
        count--; 
       } while (count>0);
       
      
    }
}