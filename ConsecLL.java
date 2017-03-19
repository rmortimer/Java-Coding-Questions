
public class ConsecLL {
	/*
	 * Interview Questions
Find the longest consecutive sequence of nodes in a linked list
 defined by a simple node class without using any other data structures.  
	 */

	public static void getLongestSeq(int [] arr){
		int i = 0;
		int seqCount = 0;
		int maxSoFar = 0;
		while(arr[i+1] !=0){ //Node . next != null{
		
			if(arr[i+1] == arr[i]+1){
				seqCount = seqCount+1;
				if(seqCount>=maxSoFar)
					maxSoFar=seqCount;
			}
			else seqCount = 0;
		}
	}
}
