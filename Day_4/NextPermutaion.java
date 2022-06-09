import java.util.ArrayList;

public class NextPermutaion 
{
	// public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	// {
    //     //if there is one element or zero element present in the array we just return the array as it is.
    //     if(permutation.size() <= 1) 
    //         return permutation;
    //     //now we should start iterating from permutation.size() - 2 th element as break point at last element can't exist.
    //     int i = permutation.size()-2;
    //     int ind1 = -1;
    //     while(i >= 0){
    //         if(permutation.get(i) < permutation.get(i+1)){
    //             ind1 = i;
    //             break;
    //         }
    //         i--;
    //     }
    //     int j = permutation.size() - 1; 
    //     int ind2 = -1;
    //     if(ind1 >= 0){
    //         while(j >= 0){
    //             if(permutation.get(j) > permutation.get(ind1)){
    //                 ind2 = j;
    //                 break;
    //             }
    //             j--;
    //         }
    //     }
    //     if(ind1 >= 0 && ind2 >= 0)
    //         swap(permutation, ind1, ind2);
    //     reverse(permutation, ind1 + 1, permutation.size()-1);
    //     return permutation;
	// }


    //-----------------------------OR---------------------------------------

    // public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
    // {
    //     //if there is one element or zero element present in the array we just return the array as it is.
    //     if(permutation.size() <= 1) 
    //         return permutation;
    //     //now we should start iterating from permutation.size() - 2 th element as break point at last element can't exist.
    //     int i = permutation.size()-2;
    //    while(i >= 0 && permutation.get(i) >= permutation.get(i+1)) 
    //        i--;
    //    if(i >= 0){
    //        int j = permutation.size() - 1;
    //        while(permutation.get(j) <= permutation.get(i))
    //            j--;
    //        swap(permutation, i, j);
    //    } 
    //     reverse(permutation, i + 1, permutation.size()-1);
    //     return permutation;
    // }
//-------------------------------------------------------------------

    // public static void swap(ArrayList<Integer> arr, int i, int j){
    //     int temp = arr.get(i);
    //     arr.set(i, arr.get(j));
    //     arr.set(j, temp);
    // }
    // public static void reverse(ArrayList<Integer> arr, int start, int end){
    //     while(start < end){
    //         swap(arr, start, end);
    //         start++;
    //         end--;
    //     }
    // }
}

