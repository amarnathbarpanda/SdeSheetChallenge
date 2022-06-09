
import java.util.* ;
import java.io.*; 

public class MaxSubArrSum {
	
	public static long maxSubarraySum(int[] arr, int n) {
        
        //Brute force : tc = O(n^3), sc = O(1) 

        // long maxSum = 0;
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = i; j < arr.length; j++){
        //         long sum = 0;
        //         for(int k = i; k <= j; k++)
        //             sum += arr[k];
        //         if(sum > maxSum)
        //             maxSum = sum;
        //     }
        // }
        //----------------------------------
        
        //Optimaization of brute force: tc = O(n^2), sc = O(1)

        // long maxSum = 0;
        // for(int i = 0; i < arr.length; i++){
        //     long sum = 0;
        //     for(int j = i; j < arr.length; j++){
        //         sum += arr[j];

        //         if(sum > maxSum)
        //             maxSum = sum;
        //     }
        // }
// ------------------------------------------------

        // Optimal: Kadane's Algorithm tc = O(n) sc = O(1)

        long maxSum = 0;
        long sum = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(sum >= 0)    
                sum += arr[i];
            else
                sum = arr[i];
            
            if(sum > maxSum)
                maxSum = sum; 
        }
        return maxSum;
    }
}
