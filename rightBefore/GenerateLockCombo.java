package rightBefore;

//3 digit lock numbers 0-9
public class GenerateLockCombo {
	
	
	public static void generateCombo(String lockString,int totalLength){
		System.out.println(lockString);
		if(lockString.length()==totalLength){
			
			return;
		}
		for(char i = '0'; i <='9'; i++){
			String charToAdd = String.valueOf(i);
			generateCombo(lockString.concat(charToAdd),totalLength);
		}
		
	}
	
	static void combine(String instr, StringBuffer outstr,int index )
	{
	    for (int i = index; i < instr.length(); i++)
	    {
	        outstr.append(instr.charAt(i));
	        System.out.println(outstr);
	        combine(instr, outstr, i + 1);
	        outstr.deleteCharAt(outstr.length() - 1);
	    }
	
	} 
	
	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
	
	
	public static void main(String [] args){
	//	generateCombo("", 2);
		combine("abc", new StringBuffer(),0);
	//	permutation("", "abc");
	}

}
