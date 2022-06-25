import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class LengthOfLongestSubsetWithZeroSum {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
		// Write your code here.
//         Brute force : tc = O(n^2), sc = O(1)
        int  max = 0;
        for(int i = 0; i < arr.size(); ++i){
            int sum = 0;
            for(int j = i; j < arr.size(); ++j){
                sum += arr.get(j);
                if(sum == 0){
                    max = Math.max(max, j-i+1);
                }
            }
        }
    return max;
	}
}