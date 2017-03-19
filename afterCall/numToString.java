package afterCall;

public class numToString {
	
	public static String numToString(int num){
		String toRet = "";
		int count = 0;
		while(num-1000>=0){
			count++;
			num = num - 1000;
		}
		toRet =toRet + Integer.toString(count) + "thousand ";
		count = 0;
		
		while(num-100>=0){
			count++;
			num = num - 100;
		}
		toRet =toRet + Integer.toString(count) + "hundred";
		count = 0;
		
		
		return toRet;
	}
	
	public static void main(String [] args){
		System.out.println(numToString(3400));
	}

}
