package afterCall;

import java.util.ArrayList;



public class SentenceSplitr {
	
	public static boolean isWord(String word){
		 String [] dictionary = { "i","ii","iii", "like", "sam", "sung", "samsung", "mobile", "ice", 
			  "cream", "icecream", "man", "go", "mango"};
		 for(int i = 0; i <dictionary.length; i++){
			 if(dictionary[i].equals(word))
				 return true;
		 }
		 return false;
	}
	
	public static ArrayList sentenceList = new ArrayList();
	public static int funcCall = 0;
	public static boolean [] indexMakesSentence = new boolean [7];
	
	public static  boolean  makeSentenceList(String splitSentence,String sentence){
		funcCall++;
		boolean makesSentence = false;
		if(sentence.equals("")){
			sentenceList.add(splitSentence);
		}
		for(int i = 0; i<sentence.length(); i ++){
			String partOfSentence = sentence.substring(0, i+1);
			if(isWord(partOfSentence) || indexMakesSentence[i+1]){
				
				makesSentence =makeSentenceList(splitSentence + partOfSentence + " ", sentence.substring(i+1));
				if(makesSentence){
					indexMakesSentence[i+1] = true;	
				}
			}
		}
		return false;
	}
	
	public static void main (String [] args){
		makeSentenceList("", "iiiiii");
		System.out.println(funcCall);
		for(int i = 0 ; i<sentenceList.size();i++){
			System.out.println("Possible Sentence : " + sentenceList.get(i));
		}
	}

}
