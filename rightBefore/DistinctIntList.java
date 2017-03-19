package rightBefore;

import java.util.ArrayList;

public class DistinctIntList {
	
	
	public static String getMissingNumbers(int [] arr, int end){
		String missingNums = "";
		int startOfRange = 0;
		int endOfRange = 0;
		int currIndex = 0;
		while(currIndex < arr.length){
			if(arr[currIndex] == startOfRange){ //Nothing to do - continue;
				currIndex++;
				startOfRange++;
				continue;
			} else if(startOfRange == arr[currIndex]--) { //The numbers are consecutive - we wont be making a range;
			
			 missingNums =missingNums.concat(String.valueOf(startOfRange));
			 currIndex++;
			 startOfRange = arr[currIndex];
			 
			} else { //We need to make a range;
			endOfRange = arr[currIndex]-1;
			String range = String.valueOf(startOfRange);
			range = range.concat("-");
			range = range.concat(String.valueOf(endOfRange));
			missingNums = missingNums.concat(range);
			currIndex++;
			startOfRange = arr[currIndex];
			}
			
		}
		if(arr[arr.length-1] != end){
			missingNums =missingNums.concat("end - 99");
		}
		
		
		
		return missingNums;
		
	}
	public static void main(String [] args){
		int [] arr = {3,5};
		System.out.println(getMissingNumbers(arr, 99));
	}

}
