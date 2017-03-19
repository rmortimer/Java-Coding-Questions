package afterCall;

public class BinarySearch {
	
	public static int binarySearch(int [] arr,int start, int end, int target){
		int pivot = start +(end-start)/2;
		if(arr[pivot] == target){
			System.out.println("Found");
			return pivot;
		}	
			
		if(start<end){
			
			if(target<arr[pivot]) {
			return	binarySearch(arr, start, pivot, target);
			}
			else if(target > arr[pivot]){
			return	binarySearch(arr, pivot, end, target);
			}
			else return -1;
				
		}
		else return 0;
		
	}
	
	
	
	
	
	public static void main(String [] args){
		int [] arr = new int[] {0, 1, 10, 20, 50, 70, 75, 80, 90, 100};
		int start = 0;
		int end = arr.length;
		System.out.println(binarySearch(arr, start, end-1, 75));
	}

}
