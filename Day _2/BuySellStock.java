public class BuySellStock {
    
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        //Brute force : tc = O(n^2), sc = O(1)
        int maxProfit = 0;
        for(int i = 0; i < prices.size(); i++){
            for(int j = i; j >= 0; j--){
                
                maxProfit = Math.max(maxProfit, prices.get(i) - prices.get(j));
            }
        }



        //Optimal : tc = O(n), sc = O(1)
        // int maxProfit = 0;
        // int minPrice = Integer.MAX_VALUE;
        
        // for(int i = 0; i < prices.size(); i++){
        //     minPrice = Math.min(prices.get(i), minPrice);
        //     maxProfit = Math.max(maxProfit, prices.get(i) - minPrice);
        // }
		// return maxProfit;
    }    
}
