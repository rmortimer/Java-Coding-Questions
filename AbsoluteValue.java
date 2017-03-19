
public class AbsoluteValue {
	//Dont really understand the question. //Dont this mean that neither of those elements are valid, or only
/*
 * Given an array with n elements. Pick maximum number
 * of elements following the rule
 * 1.We cannot pick a[i] and a[j] if absolute value
 * of (A[i]-A[j]> absolute value of (i-j)
 * Ex: 13,5,4 answer 2 pick 5 and 4
 * 
 * 5-6 = -1
 * Abs = 1;
 * 
 * 
 */
	public static int pickMaxElements(int [] arr){
		int i = 0;
		int j = 1;
		int elementCount = 0;
		while(j<arr.length){
			if((arr[i] - arr[j]) > (i-j)){
				i=i+1; //Can't use these elements. Move on
				j=j+1;
			}
			else{
				elementCount = elementCount +2; //We want both of those, they can't be included twice
				i=i+2;
				j=j+1;
			}
			
			
			
		}
		return elementCount;
		
	}
	
	
	public static void main(String [] args){
		
	}

}
