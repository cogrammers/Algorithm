public static int getMaxProfit(int[] stockPricesYesterday) {

    if (stockPricesYesterday.length < 2) {
        throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
    }

    int minPrice = stockPricesYesterday[0];
    int maxProfit = stockPricesYesterday[1] - stockPricesYesterday[0];
    for (int i = 1; i < stockPricesYesterday.length; i++) {
        int currentPrice = stockPricesYesterday[i];
        int potentialProfit = currentPrice - minPrice;
        maxProfit = Math.max(maxProfit, potentialProfit);
        minPrice = Math.min(minPrice, currentPrice);
        }

    return maxProfit;
}
