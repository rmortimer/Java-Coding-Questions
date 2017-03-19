/*
 * Find the largest and smallest number in a list
 * One part of the list is sorted in ascending order, one part in descending order
 * 
 * 2,3,4,5,6,10,9,8,7
 * or
 * 10,9,8,7,2,3,4,5,6
 */
public class SmallestAndLargestNumber {
	
	public static int binarySearch(int [] arr, int start, int end, int target){
		int middle = start+(end-start)/2;
		if(start>end)
			return -1;
		if(arr[middle] == target){
			return middle;
		}
		else if(arr[middle]>target){
			return binarySearch(arr,start,middle,target);
		}
		else return binarySearch(arr,middle,end,target);
	
	}
	
	
	public static int findMax(int [] arr ,int start, int end){
		int middle = start+(end-start)/2;
		int next = middle +1;
		
		
		
		
		return 0;
	}
	
	private static void printMinMax(int[] a) {
		int pivot = a.length == 1 || a[0] > a[1] ? 0 : findPivot2(a, 0, a.length-1);
		int max = pivot > 0 ? a[pivot-1] : a[0];
		int min = Math.min(a[0], a[a.length-1]);
		System.out.println("max = " + max + ", min = " + min);		
	}

	private static int findPivot2(int arr[], int low, int high) {
		if (high < low)
			return -1;
		if (high == low)
			return low;

		int mid = (low + high) / 2;
		if (mid < high && arr[mid] > arr[mid + 1])
			return mid;
		if (mid > low && arr[mid] < arr[mid - 1])
			return (mid - 1);
		if (arr[low] >= arr[mid])
			return findPivot(arr, low, mid - 1);
		return findPivot(arr, mid + 1, high);
	}	

	public static int findPivot(int [] arr, int start, int end){
		int middle = start + (end-start)/2;
		int min;
		if(arr[0] < arr[1]) //Left side of the array is in ascending order. Minimum element is A[0];
			min = arr[0];
		else min = arr[end];
		
		return 0;
	}
	
	public static void main(String [] args){
		int [] arr = {1,2,3,4,5,6,7,9,10,11,12,13,14};
		int x = binarySearch(arr, 0, arr.length-1, 4); //5
		System.out.println(x);
	}
}
