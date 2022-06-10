import java.util.*;

public class DupInArr{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        
        //Brute force: tc = O(nlogn), sc = O(1); 
        
//          Collections.sort(arr);
        
//         for(int i = 0; i < n - 1; i++){
//             if((int)arr.get(i) == (int)arr.get(i + 1))
//                 return arr.get(i);
//         }
        //======================================

        //Better approach: tc = O(n), sc = O(n);
        
//         int[] freq = new int[n];
//         for(int i = 0; i < n; i++){
//             if(freq[arr.get(i)] > 0)
//                 return arr.get(i);
//             freq[arr.get(i)]++;
//         }
        
        // Best optimal approach: linkedlist cycle method
        // tc = O(n) sc = O(1)
        int slow = arr.get(0);
        int fast = arr.get(0);
        
        do{
            slow = arr.get(slow);
            fast = arr.get(arr.get(fast));
        }while(slow != fast);
        
        fast = arr.get(0);
        while(slow != fast){
            slow = arr.get(slow);
            fast = arr.get(fast);
        }
        
        return slow;
    }
}
