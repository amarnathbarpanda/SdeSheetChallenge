import java.util.* ;
import java.io.*; 
public class GridUniquePath {

    // Brute force: recursion tc = sc = O(2^n)

	// public static int uniquePaths(int m, int n) {
	// 	// Write your code here.
    //     return helper(0, 0, m, n);
	// }
    // public static int helper(int i, int j, int m, int n){
    //     if(i == m - 1 && j == n - 1)
    //         return 1;
    //     if(i >= m || j >= n)
    //         return 0;
    //     else{
    //     int down = helper(i + 1, j, m, n);
    //     int right = helper(i, j + 1, m, n);
    //     return down + right;
    //     }
    // }

    // Better: Using DP tc = sc = O(m x n);
    public static int uniquePaths(int m, int n) {
		// Write your code here.
        int[][] dp = new int[m][n];
        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }
        return helper(0, 0, m, n, dp);
	}
    public static int helper(int i, int j, int m, int n, int[][] dp){
        if(i == m - 1 && j == n - 1)
            return 1;
        if(i >= m || j >= n)
            return 0;
       if(dp[i][j] != -1)
           return dp[i][j];
        else{
            dp[i][j] = helper(i + 1, j, m, n, dp) + helper(i, j + 1, m, n, dp); 
            return dp[i][j];
        }       
    }
}