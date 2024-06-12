package LinkedList;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Leetcode 322
 */
public class Leetcode322 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=15;
        int a[]={1,7,10};
        int dp[]=new int[t+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=0;i<a.length;i++){
            for(int j=a[i];j<dp.length;j++){
                if(dp[j-a[i]]!=Integer.MAX_VALUE){
                    dp[j]=Math.min(dp[j], dp[j-a[i]]+1);
                }
            }
        }
        System.out.println(dp[t]);
    }
}