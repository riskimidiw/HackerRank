// problem : https://www.hackerrank.com/contests/projecteuler/challenges/euler008/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            String number = in.next();
            int max = 0;

            for(int i=0; i<n; i++) {
                int j=i;
                int result = 1;

                if(i+k>=n) break;
                while(j<i+k) {
                    result *= Integer.parseInt(number.charAt(j)+"");
                    j++;
                }
                max = Math.max(max, result);
            }
            System.out.println(max);
        }
    }
}