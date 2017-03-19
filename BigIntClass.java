
public class BigIntClass {
/*
 * Implement a function that takes two arrays representing integers 
 * (each index containing a digit) and returns the sum of the integers, 
 * also in array representation. 
 */
	
	public static int [] bigIntegerAdd(int [] numOne , int [] numTwo){
		
	
		int i = numOne.length-1;
		int j = numTwo.length-1;
		
		int greater;
		if(i>=j)
		greater = i;
		else greater = j;
		int [] bigNum = new int [greater + 2];
		int k = greater +1;
		while(i>=0 && j>=0){
			int num = bigNum[k]+ numOne[i] + numTwo[j];
			if(num>=10){
				num = num-10;
				bigNum[k-1] = 1;
			}
			bigNum[k] = num;

			i--;
			j--;
			k--;
		}
		while(j>=0){
			int num = bigNum[k]+ numTwo[j];
			if(num>=10){
				num = num-10;
				bigNum[k-1] = 1;
			}
			bigNum[k] = num;
			j--;
			k--;
		}
		
		while(j>=0){
			int num = bigNum[k]+ numOne[i];
			if(num>=10){
				num = num-10;
				bigNum[k-1] = 1;
			}
			bigNum[k] = num;
			i--;
			k--;
		}
		
		
		return bigNum;
	}
	
	public static int [] bigIntegerAdd(int [] numOne , int [] numTwo){
		
		
		int i = numOne.length-1;
		int j = numTwo.length-1;
		
		int greater;
		if(i>=j)
		greater = i;
		else greater = j;
		int [] bigNum = new int [greater + 2];
		int k = greater +1;
		while(i>=0 && j>=0){
			int num = bigNum[k]+ numOne[i] + numTwo[j];
			if(num>=10){
				num = num-10;
				bigNum[k-1] = 1;
			}
			bigNum[k] = num;

			i--;
			j--;
			k--;
		}
		while(j>=0){
			int num = bigNum[k]+ numTwo[j];
			if(num>=10){
				num = num-10;
				bigNum[k-1] = 1;
			}
			bigNum[k] = num;
			j--;
			k--;
		}
		
		while(j>=0){
			int num = bigNum[k]+ numOne[i];
			if(num>=10){
				num = num-10;
				bigNum[k-1] = 1;
			}
			bigNum[k] = num;
			i--;
			k--;
		}
		
		
		return bigNum;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arrOne = {5,2,3};
		int [] arrTwo = {7,3,1};
		int [] ret = bigInteger(arrOne, arrTwo);
		5 2 1
		3 8 0
		for(int i = 0 ; i<ret.length; i ++)
			System.out.print(ret[i]+ " ");
	}

}
