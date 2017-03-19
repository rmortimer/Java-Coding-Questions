
public class AlternatingSignDone {

	/*
	 * Given an array of numbers, return the longest substring in 
	 * which the difference between every consecutive number pair varies 
	 * difference in sign (I.e. +-+-)  
	 */
	
	public static String longestAlternatingSubstring(int [] arr){
		System.out.print("Input is : ");
		printArr(arr);
		System.out.println("Input is of length: " + arr.length);
		int [] dpArr = new int[arr.length];
		dpArr[0] = 0;
		int maxSoFar = 0;
		int currentCount =0;
		int startIndex =0;
		int runningStartIndex = 0;
		int endIndex = 0;
		String runningBuilder = "";
		//runningBuilder = runningBuilder.concat(String.valueOf(arr[0]));
		//runningBuilder =runningBuilder.concat(", ");
		String toRet = "";
		//toRet = toRet.concat(String.valueOf(arr[0]));
		//toRet =toRet.concat(", ");
		for(int i =0; i<arr.length-1;i++){
			int firstNum = arr[i];
			int secondNum = arr[i+1];
			if(differs(firstNum,secondNum)){
				dpArr[i+1] = dpArr[i] +1; //DP Sol
				runningBuilder =runningBuilder.concat(String.valueOf(arr[i+1]));
				runningBuilder = runningBuilder.concat(", ");
				currentCount++; // No auxillary space solution
				
				if(currentCount >= maxSoFar){
					maxSoFar = currentCount;
					//runningBuilder =runningBuilder.concat(String.valueOf(arr[i+1]));
					//runningBuilder = runningBuilder.concat(", ");
						endIndex = i+1;
						toRet = runningBuilder;
						startIndex = runningStartIndex;
				}
		
			}
			else{
				dpArr[i+1] = 0; //i or i+1
				currentCount = 0;
				runningStartIndex = i+1;
				
				//We want to keep this saved. But we need to reset...
				runningBuilder = "";
				runningBuilder =runningBuilder.concat(String.valueOf(arr[i+1]));
				runningBuilder = runningBuilder.concat(", ");
			}
			
			
		}
		System.out.print("Printing dpArr: ");
		printArr(dpArr);
		System.out.println("Start Index: " + startIndex + " and End Index: " + endIndex);
		System.out.println("element at start index is: " + arr[startIndex]);
		System.out.println("element at end index is: " + arr[endIndex]);
		System.out.println("Max length: " + (maxSoFar) ); //Add +1 to make inclusive
		System.out.println("Printing final String: " + toRet);
		
		System.out.println("Building based on index (endIndexInclusive)...");
		String otherRet ="";
		if(startIndex!=endIndex)
		for(int i =startIndex; i<=endIndex; i++){
			otherRet =otherRet.concat(String.valueOf(arr[i]));
			otherRet =otherRet.concat(", ");
		}
		
		System.out.println("String basedOnIndexBuildUp : " + otherRet);
		
		
		return "";
	}
	
	public static void printArr(int [] arr){
		for(int i =0 ; i<arr.length;i++)
			System.out.print(arr[i]+ " ");
		
		System.out.println("");
	}
	public static boolean differs(int one, int two){
		if((one>0 && two<0) || (one<0 && two>0))
			return true;
		return false;
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] testOne = {-1,1,-2,3}; //4 should be whole string
		int [] testTwo = {1,-1,2,-1}; //4 should be whole string
		int [] testThree = {1,1,1,1,1,1,5,-5,5,-5,5,-5,5}; //Should be 7
		int [] testFour = {5,-5,5,1,1,1,1,1,1,1,1}; //Should be three (5,-5,5)
		int [] testFive = {1,2};
		int [] testSix = {1};
		int [] testSeven ={5,-5,5,5,1,1,7,-7,7,-7,7,-7,7,-7,7,7,7,7,7,-9,9,-9,9,1,1,1,1,1};
		int [][] tests = {   testOne,
							testTwo,
							testThree,
							testFour,
							testFive,
							testSix,
							testSeven};
		
		for(int i =0 ;i <tests.length ; i++){
			System.out.println("\n\nRunning test number: " + (i+1));
			longestAlternatingSubstring(tests[i]);
		}

	}

}
