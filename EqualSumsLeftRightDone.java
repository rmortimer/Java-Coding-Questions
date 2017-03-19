
public class EqualSumsLeftRightDone {

	/*
	 * It's the first OA coding sample of Google. The coding question is: 
	 * Given a zero-indexed array A of N integers, return any of the indexes P of the element, 
	 * which left sums of its left elements and right elements are equal. Sum of zero element is 
	 * assumed to be equal to 0. This can happen if P = 0 or if P = N-1.For example, A = {-1, 3, -4, 5, 1, -6, 2, 1}, 
	 * indexes 1, 3, and 7 are valid outputs.  											
	 */																					                          
	public static int[] getEquilibriumIndecesNoAuxSpace(int [] arr){
//		int [] leftSums = new int [arr.length];
//		int [] rightSums = new int[arr.length];
		int [] eqIndeces = new int[4];
		int leftSum = 0;
		int rightSum = 0;
		int eqIndexTracker =0;
		for(int j = arr.length-2; j>=0; j--){
			rightSum = rightSum + arr[j+1];
		}
		if(rightSum ==0){ //Acount for Index 0
			eqIndeces[eqIndexTracker] = 0;
			eqIndexTracker++;
		}
		
		for(int i =1; i<arr.length; i++){
			leftSum = leftSum + arr[i-1];
			rightSum = rightSum - arr[i];
			if(leftSum == rightSum){ //Left is inititally zero which is correct
				eqIndeces[eqIndexTracker] = i;
				eqIndexTracker++;
			}
			if(i==arr.length-1){
				System.out.println("Left pointer at end of array. Right sum should be zero: " + rightSum);
			}
		}
		
//		leftSum = leftSum + arr[arr.length-1];
//		if(leftSum == 0){
//			eqIndeces[eqIndexTracker] =arr.length-1;
//			eqIndexTracker++;
//		}
		return eqIndeces;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input = {-1, 3, -4, 5, 1, -6, 2, 1};
		int [] arr = getEquilibriumIndecesNoAuxSpace(input);
		for(int i = 0; i<arr.length ; i ++){
			System.out.print(arr[i] + ", ");
		}
	}

}
