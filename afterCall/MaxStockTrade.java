package afterCall;



public class MaxStockTrade {
	
	
	public static int maxProfit(int [] stockPrices){
		int maxProfit = 0;
		int currLowest = stockPrices[0];
		
		for(int i = 1; i < stockPrices.length; i++){
			if(stockPrices[i]<currLowest){
				currLowest = stockPrices[i];
			}
			if((stockPrices[i]-currLowest)>maxProfit){
				maxProfit = stockPrices[i]- currLowest;
			}
		}
		System.out.println(maxProfit);
		return maxProfit;
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] stockPrices = { 30,10,5,2,50,1,4,50,3,2,1};//Max should be 49
		maxProfit(stockPrices);

	}

}
