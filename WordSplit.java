import java.util.Vector;

/* 
 * Given a sentence and an isword function determine how to split the sentence into appropriate words
 */
public class WordSplit {
	
	public static boolean isWord(String word){
		String [] dictionary = {"At","A","the","grand","canyon"};
		for(int i = 0 ; i < dictionary.length;i++){
			if(dictionary[i].equals(word))
				return true;
		}
		return false;
	}

	
	public static boolean getWordSplit(String sentence,int a, int totalLength){
	if(sentence.equals("canyon"))
		System.out.println("EQUALS CANYON");
		
		
	
		
		
	for(int i = 0; i <= sentence.length(); i++){
			String partOfSentence = sentence.substring(0, i);
			
			if(isWord(partOfSentence)){
				System.out.println("First part of sentence is: " + partOfSentence);
				String lastPartOfSentence = sentence.substring(i,sentence.length());
				System.out.println("Last part of sentence is: " + lastPartOfSentence);
				System.out.println("Characters consumed so far is: " + a);
				a=a+(i);
				System.out.println("Characters consumed on next split a is: " + a);
				System.out.println("A is :" + a);
				System.out.println("Total length is :" + (totalLength+1));
				if(a == (totalLength+1)){
					System.out.println("Should return true");
					return true;
				}
				getWordSplit(lastPartOfSentence,a,totalLength);
				
			}
			
			
		}
		if(a == (totalLength+1)){
		System.out.println("Should return true");
		return true;
		}
		return false;
		
	}
	
	public static void main(String [] args){
		String sentence = "Atthegrandcanyon";
		System.out.println("Total length is: " + sentence.length());
		boolean result = getWordSplit(sentence, 0, sentence.length() );
		System.out.println("Result is " + result);
	}
}
