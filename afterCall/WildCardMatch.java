package afterCall;

public class WildCardMatch {
	
	public static boolean matcher(String wildCard, String actual){
		for(int i = 0 ;i<actual.length();i++){
			if(wildCard.charAt(i) == '*')
				continue;
			if(!(wildCard.charAt(i) == actual.charAt(i)))
					return false;
		}
		return true;
		
	}
	
	public static void main(String [] args){
		System.out.println(matcher("**t","cat"));
	}

}
