
public class Strobo {
/*
 * A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).

Write a function to determine if a number is strobogrammatic. The number is represented as a string.

For example, the numbers "69", "88", and "818" are all strobogrammatic
 */
	
	public static boolean stroboGro(String input){
		boolean stroboSoFar = true;
		if(input.length()%2 == 1){
			//Odd num
			char midLetter= input.charAt(input.length()/2);
			if(midLetter == '1' || midLetter =='8' ){
				stroboSoFar = true;
			}
			else return false;
			
		}
		for(int i =0; i <input.length()/2;i++){
			char leftChar = input.charAt(i);
			char rightChar = input.charAt(input.length()-1-i);
			//if(leftChar != '1')
			
		}
			
		return false;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
