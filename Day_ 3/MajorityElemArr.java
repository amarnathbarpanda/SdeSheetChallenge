import java.util.* ;

public class MajorityElemArr {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for(int i = 0; i < arr.length; i++){
            if(map.get(arr[i]) > Math.floor(arr.length/2))
                return arr[i];
        }
        return -1;
	}
}