import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class ReversePairs 
{
    public static int reversePairs(ArrayList<Integer> arr) 
    {
        // Write your code here.
        //Brute force : tc = O(n^2), sc = O(1)
        int count = 0;
        for(int i = 0; i < arr.size() - 1; i++){
            for(int j = i + 1; j < arr.size(); j++){
                if(arr.get(i) > 2 * arr.get(j) && i < j){
                    count++;
                }
            }
        }
        return count;
    }
}
