package rightBefore;

public class ChangeForADollar {
	
	
	public static int count( int coinSet[], int index, int target )
	{
	    // If n is 0 then there is 1 solution (do not include any coin)
	    if (target == 0)
	        return 1;
	     
	    // If n is less than 0 then no solution exists
	    if (target < 0)
	        return 0;
	 
	    // If there are no coins and n is greater than 0, then no solution exist
	    if (index <=0 && target >= 1)
	        return 0;
	 
	    // count is sum of solutions (i) including S[m-1] (ii) excluding S[m-1]
	    return count( coinSet, index - 1, target ) + count( coinSet, index, target-coinSet[index-1] );
	}
	
	public static void makeChange(int [] coins, String [] coinType, int index, int sum, int target, String coinsUsed){
		System.out.println("sum is: " + sum);
		if(sum==target){
			System.out.println("Sum = target");
			System.out.println(coinsUsed);
		}
			
		if(sum>target){
			System.out.println("Sum greater");
			return;
		}
		
		
		for(int i = 0; i < coins.length; i++){
			int j = 0;
			while(sum<target){
				int valueToDiff = coins[i];
				coinsUsed.concat(coinType[i]);
				System.out.println(coinType[i]);
				makeChange(coins, coinType, index+1, sum, target-valueToDiff, coinsUsed);
			}
		}
		
	}
	
	public static long countWays(int S[], int currentCoinUsing, int target)
	    {
	        //Time complexity of this function: O(mn)
	        //Space Complexity of this function: O(n)
	 
	        // table[i] will be storing the number of solutions
	        // for value i. We need n+1 rows as the table is
	        // constructed in bottom up manner using the base
	        // case (n = 0)
	        long[] table = new long[target+1];
	 
	        // Initialize all table values as 0
	       // Arrays.fill(table, 0);   //O(n)
	 
	        // Base case (If given value is 0)
	        table[0] = 1;
	 
	        // Pick all coins one by one and update the table[]
	        // values after the index greater than or equal to
	        // the value of the picked coin
	        for (int i=0; i<currentCoinUsing; i++)
	            for (int j=S[i]; j<=target; j++)
	                table[j] += table[j-S[i]];
	 
	        return table[target];
	    }
	
	
	public static void main(String [] args){
//		int [] coins = new int[]{50,25};
//		String [] coinType = new String [] {"H","Q"};
//		makeChange(coins, coinType, 0, 0, 100, "");
		
//		int [] coinSet = {1,2,3};
//		int target = 4;
//		System.out.println(count(coinSet, 3, target));
		
		int [] coinSet = {25,10,5,1};
		int target = 100;
		System.out.println(count(coinSet, 4, target));
	}

}
