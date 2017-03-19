
public class MaxSubArray {
	
	protected MaxSubArray(){
		
	}
	public static int maxSubArray(int [] arr){
		int [] dpArr = new int [arr.length+1];
		dpArr [0] = 0;
		for(int i = 1 ; i<arr.length; i++){
			int sum = dpArr[i-1] + arr[i];
		}
		
		return 0;
		
	}

}
