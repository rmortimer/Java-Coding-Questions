/*
 Fit row column screen */
public class screenFitting {


	
	public static int getFitCount (String[] sentence, int row, int columns){
		int numSoFar = 0;
		int placeInSentence = 0;
		
		int rowConsumed = 0;
		int currColumn = 0;
		while(true){
			if((currColumn + sentence[placeInSentence].length()) <= columns){
				currColumn = currColumn + sentence[placeInSentence].length()+1; //+1 for space
				placeInSentence++;
				if(placeInSentence > sentence.length-1){
					numSoFar++;
					placeInSentence = 0;
				}
				continue;
			}
			else{
				rowConsumed++;
				currColumn = 0;
				if(rowConsumed > row){
					break;
				}
			}
			
		}
		return numSoFar;
		
		
		
	}
	
	
	public static void main (String[] args){
		String [] sentence = {"hello","world"};
		System.out.println(getFitCount(sentence, 2, 8));
		String [] sentence2 ={"a", "bcd", "e"};
		System.out.println(getFitCount(sentence2, 3, 6));
	}
}
