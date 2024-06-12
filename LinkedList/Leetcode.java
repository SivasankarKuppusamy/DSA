package LinkedList;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=3;
        int a[][]=new int[3][3];
        int dp[][]=new  int[n][n];
        for(int i=0;i<n;i++){
            for (int j = 0; j < n; j++) {
             a[i][j]=sc.nextInt();   
            }
        }
        dp[0][0]=a[0][0];
        for(int i=0;i<n;i++){
            for (int j = 0; j < n; j++) {
                if(i==0&&j==0) continue;
                if(i==0&&j!=0){
                    dp[i][j]=dp[i][j-1]+a[i][j];
                }
                else if(i!=0&&j==0){
                    dp[i][j]=dp[i-1][j]+a[i][j];
                }
                else 
                dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+a[i][j];
            }
        }
        System.out.println(dp[n-1][n-1]);
    }
}
