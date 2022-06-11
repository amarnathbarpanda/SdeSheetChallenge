import java.util.*;
public class MajorityElemArr2 {
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Optimal : tc = O(n) , sc = O(n);
        ArrayList<Integer> res = new ArrayList<>();
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int i = 0; i < arr.size(); i++){
//             map.put(arr.get(i), map.getOrDefault(arr.get(i), 0) + 1);
//         }
//         for(int i = 0; i < arr.size(); i++){
//             if(map.get(arr.get(i)) > arr.size()/3){
//                 res.add(arr.get(i));
//                 map.put(arr.get(i), 0);
//             }
//         }
        return res;
    }    
}

