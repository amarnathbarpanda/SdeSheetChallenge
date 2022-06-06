public class BuySellStock {
    
    // tc = O(n), sc = O(1)
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        
        for(int i = 0; i < prices.size(); i++){
            minPrice = Math.min(prices.get(i), minPrice);
            maxProfit = Math.max(maxProfit, prices.get(i) - minPrice);
        }
		return maxProfit;
    }    
}
