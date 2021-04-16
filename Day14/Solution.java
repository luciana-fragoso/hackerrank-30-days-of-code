import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    
    public Difference(int[] a){
        elements = new int[a.length];
        for (int i=0;i<a.length;i++){
           elements[i] = a[i];
        }
        
    }
    
    public void computeDifference(){
        
	int aux = 0;
        
        for (int i=0;i<elements.length;i++){
            for (int j=i+1;j<elements.length;j++){
                aux = Math.abs(elements[i]-elements[j]);
                if (this.maximumDifference<aux)
                    this.maximumDifference = aux;
        }
     }   
    }
   
    

} 

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}