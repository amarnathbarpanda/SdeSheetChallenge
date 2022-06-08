import java.util.* ;
public class SetMatrixZeros {
    // public static void setZeros(int matrix[][]) {
        
        // Brute force: tc = O(M X N) * O(M X N), sc = O(1)

    //     int m = matrix.length;
    //     int n = matrix[0].length;
        
    //     int[][] temp = new int[m][n];
        
    //     for(int[] i : temp)
    //         Arrays.fill(i, -1);
        
    //     for(int i = 0; i < m; i++){
    //         for(int j = 0; j < n; j++){
    //             if(matrix[i][j] == 0){
    //                 int row = 0, col = 0;
    //                 while(row < m){
    //                     temp[row][j] = 0;
    //                     row++;
    //                 }
                    
    //                 while(col < n){
    //                     temp[i][col] = 0;
    //                     col++;
    //                 }
    //             }
    //         }
    //     }
    //     for(int i = 0; i < m; i++)
    //         for(int j = 0; j < n; j++)
    //             if(temp[i][j] == 0)
    //                 matrix[i][j] = 0;
    // }

    // Optimal Approach: tc = O(M X N + M X N), sc = O(M) + O(N)


    // public static void setZeros(int matrix[][]) {
    //     // Write your code here..
    //     int m = matrix.length;
    //     int n = matrix[0].length;
        
    //     int[] row = new int[m];
    //     int[] col = new int[n];
    
    //     Arrays.fill(row, -1);
    //     Arrays.fill(col, -1);
     
        
    //     for(int i = 0; i < m; i++){
    //         for(int j = 0; j < n; j++){
    //             if(matrix[i][j] == 0){
    //                 if(row[i] != 0)
    //                     row[i] = 0;
    //                 if(col[j] != 0)
    //                     col[j] = 0;
    //             }    
    //         }
    //     }
    //     for(int i = 0; i < m; i++){
    //         for(int j = 0; j < n; j++){
    //              if(row[i] == 0 || col[j] == 0)
    //                  matrix[i][j] = 0;
    //         }
    //     }
    // }

    // Best Optimized Approach: tc = O(M X N), sc = O(1)

    // public static void setZeros(int matrix[][]) {
  
    //     int rows = matrix.length;
    //     int cols = matrix[0].length;
        
    //     int col0 = 1;
        
    //     for(int i = 0; i < rows; i++){
    //         if(matrix[i][0] == 0) 
    //             col0 = 0;
    //         for(int j = 1; j < cols; j++){
    //             if(matrix[i][j] == 0){
    //                matrix[i][0] = matrix[0][j] = 0;
    //             }
    //         }
    //     }
    //     for(int i = rows - 1; i >= 0; i--){
    //         for(int j = cols - 1; j >= 1; j--)
    //             if(matrix[i][0] == 0 || matrix[0][j] == 0)
    //                 matrix[i][j] = 0;
    //         if(col0 == 0)
    //             matrix[i][0] = 0;
    //     }
    // }


}