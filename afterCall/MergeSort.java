package afterCall;

public class MergeSort {
	
	public static void mergeSort(int [] arr, int start, int end){
		int [] temp = new int[arr.length];
		mergeSort(arr, temp, start, end);
	}
	
	private static void mergeSort(int [] arr, int [] tempArr,int start, int end){
		int pivot = start + (end-start)/2;
		if(start<end){
			mergeSort(arr,tempArr,start,pivot);
			mergeSort(arr,tempArr,pivot+1,end);
			merge(arr, tempArr, start, pivot, end);
		}
	}
	
	private static void merge(int [] arr, int [] tempArr, int start, int middle, int end){
		for(int i = start; i <=end; i++){
			tempArr[i] = arr[i];
		}
		int i = start;
		int k = start;
		int j = middle+1;
		while(i<=middle && j<=end){
			if(tempArr[i]<= tempArr[j]){
				arr[k] = tempArr[i];
				i++;
			}else{
				arr[k] = tempArr[j];
				j++;
			}
			k++; //k advances regardless
		}
		
		while(i<=middle){
			arr[k] = tempArr[i];
			i++;
			k++;
		}
		while(j<=end){
			arr[k] = tempArr[j];
			j++;
			k++;
		}
		
	}
	
	public static void printArr(int [] arr){
		System.out.println();
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i] + ", ");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[] {100,75,50,70,80,90,20,10,1,0};
		int start = 0;
		int end = arr.length;
		printArr(arr);
		mergeSort(arr, start, end-1);
		printArr(arr);

	}

}
