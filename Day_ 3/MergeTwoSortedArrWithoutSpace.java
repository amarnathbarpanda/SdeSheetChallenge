import java.io.*; 
public class MergeTwoSortedArrWithoutSpace {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int pos = arr1.length-1;
        int p1 = m-1;
        int p2 = n-1;
        
        while(p2 >= 0 && p1 >= 0){
            if(arr2[p2] > arr1[p1]){
                arr1[pos] = arr2[p2];
                p2--;
            }else{
                arr1[pos] = arr1[p1];
                arr1[p1] = 0;
                p1--;
            }
            pos--;
        }
        while(p1 >= 0){
            arr1[pos] = arr1[p1];
                p1--;
                pos--;
        }
        while(p2 >= 0){
            arr1[pos] = arr2[p2];
                p2--;
                pos--;
        }
        return arr1;
    }
}
