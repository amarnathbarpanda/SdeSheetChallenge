import java.util.* ;
import java.io.*; 
public class FourSum {
  public static String fourSum(int[] arr, int target, int n) {
      // Brute force: tc = O(nlogn) + O(n^3) * O(log n) = O(n^3logn)
//       sc = O(1)
      Arrays.sort(arr);
      for(int i = 0; i < n; i++){
          for(int j = i + 1; j < n; j++){
              for(int k = j + 1; k < n; k++){
                  int num = target - (arr[i] + arr[j] + arr[k]);
                  int start = k + 1;
                  int end = n - 1;
                  while(start <= end){
                      int mid = (start + end)/2;
                      if(arr[mid] < num){
                          start = mid + 1;
                      }else if(arr[mid] > num){
                          end = mid - 1;
                      }else{
                          return "Yes";
                      }
                  }
              }
          }
      }
      return "No";
  }
}
