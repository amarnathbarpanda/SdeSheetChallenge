import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class SearchIn2DArr {
	static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {
		// Write your code here.
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(mat.get(i).get(j) == target){
                    return true;
                }
            }
        }
        return false;
	}
}
