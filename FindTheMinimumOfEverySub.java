import java.util.Collections;
import java.util.PriorityQueue;


public class FindTheMinimumOfEverySub {

	/*
	 * Find the minimum of every array of size K in an array of size N
	 */
	/**
	 * @param args
	 */
	
	public static void getMinKOfN(int [] arr,int k){
		PriorityQueue myQueue = new PriorityQueue(); //Cant do collections reverse order
		int i = 0;
		
		for( ; i<k; i++){
			myQueue.add(new Integer(arr[i]));
		}
		for( ; i<arr.length; i++){
			System.out.print(myQueue.peek() + " ");
			myQueue.remove(new Integer(arr[i]-k));
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Keep a min heap, if the element at the top of the heap doesn't fit into current range, remove it.
	}

}
