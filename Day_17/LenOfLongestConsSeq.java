import java.util.* ;
import java.io.*; 
public class LenOfLongestConsSeq {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.

        // Brute force : tc = O(N log N), sc = O(1)

        // if(arr.length == 0 || arr == null)
        //     return 0;
        // Arrays.sort(arr);
        // int len = 1;
        // int maxLen = 1;
        // int prev = arr[0];
        // for(int i = 1; i < N; i++){
        //     if(arr[i] == prev + 1)
        //         len++;
        //     else if(arr[i] != prev)
        //         len = 1;
        //     prev = arr[i];
        //     maxLen = Math.max(len, maxLen);
            
        // }
        //============================
        //Optimal : tc = O(N) , sc = O(N) 
        
        if(arr.length == 0 || arr == null)
            return 0;
        
        HashSet<Integer> st = new HashSet<>();
        for(int i = 0; i < N; i++){
            st.add(arr[i]);
        }
        int longestStreak = 0;
        for(int i = 0; i < N; i++){
            if(!st.contains(arr[i]-1)){
                int currStreak = 1;
                int currNum = arr[i];
                while(st.contains(currNum + 1)){
                    currNum += 1;
                    currStreak += 1;
                }
                longestStreak = Math.max(currStreak, longestStreak);
            }
                
        }
        return maxLen;
    }
}
