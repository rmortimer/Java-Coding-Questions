
public class NPSumProblem {
	
	public static int [] arr = {5,10,15,20,25,30,35,40,1000};
	public static int target = 1020;
	
	public static void makeArrays(){
		int [] sumArr = new int [arr.length];
		int [] targetDiffArr = new int[arr.length];
		sumArr[0] = arr[0];
		//targetDiffArr[0] = target - arr[0];
		for(int i = 1 ; i <sumArr.length; i++){
			sumArr[i] = sumArr[i-1] + arr[i];
		}
		
		for(int i = 0 ; i <targetDiffArr.length; i++){
			targetDiffArr[i] = target - arr[i];
		}
		
		printArr(arr);
		printArr(sumArr);
		printArr(targetDiffArr);
		
	}
	
	public static void printArr(int [] arr){
		System.out.println("");
		for(int i = 0 ; i < arr.length; i ++)
			System.out.print(" " + arr[i]);
	}
	
	public static void main(String [] args){
		makeArrays();
	}

}
