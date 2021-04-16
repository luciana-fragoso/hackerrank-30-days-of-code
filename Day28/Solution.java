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
        ArrayList<String> list = new ArrayList<>();
        String emailRegex = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(emailRegex);
        int N = scanner.nextInt();
        String firstName,emailID;
        String[] emailAddress;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int NItr = 0; NItr < N; NItr++) {
            firstName = scanner.next();
            emailID = scanner.next();
            
            Matcher matcher = pattern.matcher(emailID);
             if (matcher.find())
                list.add(firstName);
        }
        
        Collections.sort(list);

        list.forEach(System.out::println);

        scanner.close();
    }
}
