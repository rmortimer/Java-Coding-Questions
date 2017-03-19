
public class NDigitLock {
/*
 * Print out all combinations of an n-digit lock given possible numbers of each digit.  
 */
	public static void printCombo(int n,char [] currString){
		System.out.println(currString);
		for(int i = 0; i <currString.length; i++){
			for(int j =0; j<26; j++){
				currString[i]++;
				printCombo(n,currString);
			}
		}
		
	}
	
	public static void combine(String instr, StringBuffer outstr, int index)
	{
	    for (int i = index; i < instr.length(); i++)
	    {
	        outstr.append(instr.charAt(i));
	        System.out.println(outstr);
	        combine(instr, outstr, i + 1);
	        outstr.deleteCharAt(outstr.length() - 1);
	    }
	    
	} 

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		combine("abc", new StringBuffer(), 0);
	}

}
