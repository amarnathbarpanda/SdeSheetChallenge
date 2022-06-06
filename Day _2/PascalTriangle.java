import java.util.ArrayList;

public class PascalTriangle {

    // Question type 1 : print upto n rows.
    //time complexity: O(n^2), sc = O(n^2) as we are storing n rows and n cols

	// public static ArrayList<ArrayList<Long>> printPascal(int n) {
    //     // Write your code here.
    //     ArrayList<ArrayList<Long>> ans = new ArrayList<ArrayList<Long>>();
    //     ArrayList<Long> row, prev = null;
    //     for(int i = 0; i < n; i++){
    //         row = new ArrayList<Long>();
    //         for(int j = 0; j <= i; j++){
    //             if(j == 0 || j == i)
    //                 row.add(1l);
    //             else
    //                 row.add(prev.get(j - 1) + prev.get(j));
    //         }
    //         prev = row;
    //         ans.add(row);
    //     }
    //     return ans;
	// }

    // Question type 2: print rth row cth col element
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int r = sc.nextInt();
    //     int c = sc.nextInt();
        
    //     int rm1 = fact(r - 1);
    //     int cm1 = fact(c - 1);
    //     int rmc = fact((r-1) - (c-1));
        
    //     System.out.print(rm1/(cm1 * rmc));
    // }
    // public static int fact(int n){
    //     int f = 1;
    //     for(int i = 1; i <= n; i++)
    //         f *= i;
    //     return f;
    // }
    
    
}
