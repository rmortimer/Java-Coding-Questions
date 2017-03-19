/*
 * Given a dictionary as a hashtable and a word. 
 * Find the minimum # of deletions needed on the word in order to make it a valid word in the dictionary.  
 */
public class NumberOfDeletions {
//Either Build up from base case or store deleted word at each step
	//Can do DP [][] Arr.
	public static boolean isWord(StringBuilder word){
		StringBuilder [] dictionary = new StringBuilder[3];
		dictionary[0] = new StringBuilder("Hello");
		dictionary[1] = new StringBuilder("Helio");
		dictionary[2] = new StringBuilder("Helmo");
		for(int i =0 ; i <dictionary.length; i++){
			if(dictionary[i].equals(word))
				return true;
		}
		return false;
		
	}
	
	public static int numDeletions(StringBuilder word){
		StringBuilder [][] dpArr = new StringBuilder[word.length()+1][word.length()];
		for(int i = 0; i<dpArr[0].length;i++){ //Initialize base case
			dpArr[0][i] = word;
		}
		for(int i = 1;i <dpArr[0].length; i++){
			for(int j = 0; j<dpArr[i].length; j++){
				dpArr[i][j] = 
			}
		}
		
		return 0;
	}
	
	public static void main(String [] args){
		StringBuilder myString = new StringBuilder("H2ello2");
		
		
	}
}
