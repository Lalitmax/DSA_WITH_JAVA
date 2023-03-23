public class Buy_and_sell_stocks {

    public static int buyAndSellStocks(int prices[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < prices.length; i++) {
            int profit = 0;
            if (buyprice < prices[i]) {
                profit = prices[i] - buyprice;
                
            } else {
                buyprice = prices[i];
            }

            maxprofit = Math.max(profit, maxprofit);

            
        }

        return maxprofit;

    }

    public static void main(String args[]) {
        int prices[] = { 57,1,5,3,6,4};   
        System.out.println(buyAndSellStocks(prices));
    }
}
