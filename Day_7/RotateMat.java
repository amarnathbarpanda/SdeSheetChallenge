import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class RotateMat {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int rowStart = 0, rowEnd = n - 1, colStart = 0, colEnd = m - 1;
        while(rowEnd == 0 || colEnd == 0)
            return;
        while(rowStart < rowEnd && colStart < colEnd){
            int temp = mat.get(rowStart).get(rowStart);
            for(int j = colStart + 1; j <= colEnd; j++){
                temp = swap(mat, temp, rowStart,j);
            }
            for(int i = rowStart + 1; i <= rowEnd; i++){
                temp = swap(mat, temp, i, colEnd);
            }
            for(int j = colEnd - 1; j >= colStart; j--){
                temp = swap(mat, temp, rowEnd, j);
            }
            for(int i = rowEnd - 1; i >= rowStart; i--){
                temp = swap(mat, temp, i, colStart);
            }
            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;
        }
    }
    public static int  swap(ArrayList<ArrayList<Integer>> arr, int x, int i,int j){
        int temp = x;
        x = arr.get(i).get(j);
        arr.get(i).set(j, temp);
        return x;
    }
}
