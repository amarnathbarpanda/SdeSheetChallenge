public class Sort012 {

    // brute force: tc = O(n) sc = O(1)
    // public static void sort012(int[] arr)
    // {
    //     int count0 = 0; 
    //     int count1 = 0;
    //     // int count2 = 0;
        
    //     for(int i = 0; i < arr.length; i++){
    //         if(arr[i] == 0)
    //             count0++;
    //         else if(arr[i] == 1)
    //             count1++;
    //         // else
    //         //     count2++;
    //     }
    //     for(int i = 0; i < count0; i++)
    //         arr[i] = 0;
    //     for(int i = count0; i < count0 + count1; i++)
    //         arr[i] = 1;
    //     for(int i = count0+count1; i < arr.length; i++)
    //         arr[i] = 2;
    // }

    // better approach: tc = O(n), sc = O(1)

    // public static void sort012(int[] arr)
    // {
    //     int i = 0; 
    //     int j = 0;
    //     int k = arr.length-1;
    //     while(j <= k){
    //         if(arr[j] == 0){
    //             swap(arr, i, j);
    //             i++;
    //             j++;
    //         }else if(arr[j] == 1){
    //             j++;
    //         }else{
    //             swap(arr, j, k);
    //             k--;
    //         }
    //     }
    // }
}
