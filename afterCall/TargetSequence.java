package afterCall;

public class TargetSequence {
	
	static int hasSequence(int[] nums, int T) {
	    if (T <=0)
	        return -1;
	    if (nums.length == 0) 
	        return -1;
	   // int i = 0;
	    int leftIndexOfSubSeq = 0;
	    int sum = 0;	  
	    for(int i = 0 ; i <nums.length; i++){
	        if (sum + nums[i] < T)
	            sum += nums[i];
	        else if (sum + nums[i] == T)
	            return leftIndexOfSubSeq;
	        else {
	            sum += nums[i];
	            while (sum > T) {
	                sum -= nums[leftIndexOfSubSeq];
	                leftIndexOfSubSeq++;	                
	            }
	            if (sum == T)
	                return leftIndexOfSubSeq;	            
	        }
	        
	    }
	    return -1;
	}
	
	/*
	public static boolean hasTargetSubSeq(int [] arr ,int target){
		int sumSoFar = arr[0];
		if(arr.length == 1 && sumSoFar == target)
			return true;
		for(int i = 1; i<arr.length;i++){
			if(sumSoFar == target)
				return true;
			if(sumSoFar + arr[i] > target){
				sumSoFar = arr[i];
			}
			else{
				sumSoFar =+ arr[i];
			}
		}
		return false;
	}*/

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = new int[] { 1,2,4,5,6,7,8,1,3,1,3,1,3,1,1,0};
		int target = 20;
		System.out.print(hasSequence(arr, target));

	}

}
