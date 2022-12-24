class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
                System.out.println("In 1st loop where minPrice is " + minPrice + " and prices[" + i + "] value is " + prices[i] + " and maxProfit is " + maxProfit);
            } else if(prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
                System.out.println("In 2nd loop where minPrice is " + minPrice + " and prices[" + i + "] value is " + prices[i] + " and maxProfit is " + maxProfit);
            }
        }
        // System.out.println("minPrice is : " + minPrice);
        return maxProfit;
    }
}
