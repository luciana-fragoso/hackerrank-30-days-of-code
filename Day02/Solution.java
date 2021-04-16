import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
      
        double cost = meal_cost+(meal_cost*tip_percent/100)+(meal_cost*tax_percent/100);
        System.out.println((int) Math.round(cost));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
      	int tip_percent = scanner.nextInt();
        int tax_percent = scanner.nextInt();
        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
