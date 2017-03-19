package afterCall;

public class SentenceSplit2 {
	
	public static boolean isWord(String word){
		 String [] dictionary = { "i","ii","iii", "like", "sam", "sung", "samsung", "mobile", "ice", 
			  "cream", "icecream", "man", "go", "mango"};
		 for(int i = 0; i <dictionary.length; i++){
			 if(dictionary[i].equals(word))
				 return true;
		 }
		 return false;
	}
	
	boolean wordBreak(String str){
		if(str.length()==0)
			return true;
		
		boolean [] wordBreak = new boolean [str.length()+1];
		
		for(int i =1; i <str.length(); i++){
			if(wordBreak[i]== false && isWord(str.substring(0, i)))
				wordBreak[i] = true;
			
			if(wordBreak[i]){
				
				if(i==str.length())
					return true;
				
				for(int j = i+1; j<=str.length();j++){
					if(wordBreak[j] == false && isWord(str.substring(i,j-i)))
						wordBreak[j] = true;
					if(j==str.length() && wordBreak[j] == true)
						return true;
				}
			}
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
