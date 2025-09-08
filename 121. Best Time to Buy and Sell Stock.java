class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        // int diff = Integer.MAX_VALUE;
        // int max=0;
        // for(int i:prices){
        //     if(i<diff){
        //         diff=i;
        //     }
        //     else{
        //         max=Math.max(max,i-diff);
        //     }
        // }
        // return max;
        int minPrice=prices[0];
        int maxProfit=0;

        for(int i=1;i<n; i++){
            if(minPrice>prices[i]){
                minPrice=prices[i];
            }
            else{
                int profit= prices[i]-minPrice;
                maxProfit=Math.max(maxProfit,profit);
                
            }
        }
        return maxProfit;
    }
}
