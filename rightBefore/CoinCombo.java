package rightBefore;

public class CoinCombo {
	
	
	public static int printSum(int currSum,int startCoin, int coinIndexUsing, int [] coins, int [] qty){
		if(coinIndexUsing>=coins.length-1) return 0;
		
		for(int i = coinIndexUsing; i<coins.length; i++){
			for(int j = startCoin; j<qty[coinIndexUsing]; j++){
				currSum = currSum + (coins[i] * qty[j]);
				System.out.println(currSum);
				printSum(currSum,startCoin+1, coinIndexUsing+1, coins, qty);
				currSum = currSum - (coins[i] * qty[j]);
				}
		}
		
		
		return 0;
	}
	
	
	
	
	public static void main(String[] args) {
		int coins[] = {1, 10, 100};
		int qty [] = {1,2,2};
		printSum(0,0,0,coins,qty);
		}
		
		
	
		

}
