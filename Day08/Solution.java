
import java.util.*;
import java.io.*;
import java.util.HashMap;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        String output = "";
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
           if (map.containsKey(s))
                output=s+"="+map.get(s);
            else
                output="Not found";
            System.out.println(output);
        }
        in.close();
        
    }
}