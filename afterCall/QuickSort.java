package afterCall;

public class QuickSort {
	
	
	public static void quickSort(int [] arr,int start, int end){
		int pivot = partition(arr, start, end);
		if(start<pivot-1){
			quickSort(arr, start, pivot-1);
		}
		if(end>(pivot)){
			quickSort(arr, pivot, end);
		}
		
	}
	
	public static int partition(int [] arr ,int start,int end){
		int pivotIndex = start + (end-start)/2;
		int pivotValue = arr[pivotIndex];
		int i = start;
		int k = end;
		while(i<=k){
			while(arr[i] < pivotValue){
				i++;
			}
			while(arr[k] > pivotValue){
				k--;
			}
			//Swap i and K
			if(i<=k){
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				i++;
				k--;
			}
			
		}
	
		return i; 
	}
	
	
	public static void printArr(int [] arr){
		System.out.println();
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	
	
	public static void main(String [] args){
		// TODO Auto-generated method stub
		int [] arr = new int[] {100,75,1000,4,32,1,50,50,70,80,90,20,10,1,0};
		int start = 0;
		int end = arr.length;
		printArr(arr);
		quickSort(arr, start, end-1);
		printArr(arr);
	}

}
