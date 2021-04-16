

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int fine = 0;
        Scanner scanner = new Scanner(System.in);
        int r_day = scanner.nextInt();
        int r_month = scanner.nextInt();
        int r_year = scanner.nextInt();

        int d_day = scanner.nextInt();
        int d_month = scanner.nextInt();
        int d_year = scanner.nextInt();

        if (r_year < d_year)
            fine = 0;
        else {
            if (r_year > d_year)
                fine = 10000;
            else if (r_month > d_month) {
                fine = 500 * (r_month - d_month);
            } else if (r_day > d_day){
                fine = 15 * (r_day - d_day);
            }
        }





        System.out.println(fine);
    }
}
