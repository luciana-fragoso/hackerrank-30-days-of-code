import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int a_i=0; a_i < size; a_i++){
            arr[a_i] = in.nextInt();
        }
        
        int swaps = 0;
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                    if (arr[j] > arr[j+1]) {
                    swaps ++ ;
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    System.out.println("Array is sorted in "+swaps+" swaps.");
    System.out.println("First Element: "+arr[0]);
    System.out.println("Last Element: "+arr[arr.length-1]);
    }
}