package afterCall;

import java.util.HashMap;

public class ThreeSUM {
	
	
	public static boolean canMakeSum(int [] arr){
		//[1,2,3,4];
		HashMap sums = new HashMap();
		
		for(int i = 0; i < arr.length-1; i++)
			for(int j =i+1;j<arr.length;j++)
				if(arr[i] >0 && arr[j] >0)
					sums.put(new Integer(arr[i]+arr[j]), new Boolean(true));
		
		
		
		for(int i = 0; i<arr.length;i++){
			if(arr[i]<=0 && sums.get(new Integer(i)).equals(new Boolean(true)))
				return true;
		}
		return false;
	}
	
	public static void main (String [] args){
		int [] arr = new int[] {0,0,0};
		System.out.println(canMakeSum(arr));
	}

}
