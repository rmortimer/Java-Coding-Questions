
public class CoffeeMaker { //Also doesn't make sense
/*
 * Given a coffee maker with three buttons, and each one will dispense an amount 
 * somewhere within given ranges. Write a function that will determine if any combination of 
 * buttons is guaranteed to dispense a supplied amount.  
 */
	
	/*
	 * Program a coffee machine that has three buttons that each   give random amounts of coffee: 1-3oz,
	 *  3-5oz, and 5-9oz so you can make a 15oz cup of coffee without overflowing or knowing how much 
	 *  coffee each button gave. Write the algorithm.
	 */
	
	static int callCount = 0;
	public static void findListOfRanges(int start, int limit, int runningMin ,int [] ranges){
		callCount++;
		if(start==limit){
			System.out.println("Valid combo");
			return;
			
		}			
		if(runningMin>limit){
			System.out.println("Invalid Combo");
			return;
			
		}
		findListOfRanges(start+ranges[0],limit,runningMin+ranges[0],ranges);
		findListOfRanges(start+ranges[1],limit,runningMin+ranges[0],ranges);
		findListOfRanges(start+ranges[2],limit,runningMin+ranges[2],ranges);
		findListOfRanges(start+ranges[3],limit,runningMin+ranges[2],ranges);
		findListOfRanges(start+ranges[4],limit,runningMin+ranges[4],ranges);
		findListOfRanges(start+ranges[5],limit,runningMin+ranges[4],ranges);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxLimit = 15;
		int [] ranges = {1,3,3,5,5,9};
		int currentCoffee = 0;
//		while(currentCoffee!=maxLimit){
//			System.out.println("Start of loop current coffee is " + currentCoffee);
		//Base Case - Coffee needs to be of size 5
		findListOfRanges(0, 15,0, ranges);
//		findListOfRanges(0, 15,ranges[2], ranges);
//		findListOfRanges(0, 15,ranges[4], ranges);
		System.out.println("Call Count : " + callCount);
		//15 - 9 = 6
		}
	
		
	

}
