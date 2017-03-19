package actual;

public class AnotB {
	
	//Given two arrays A [a,a,a,b,c]  B [a,b,d,e]
	//return elements in A not in B  A-> a,a,c and B -> d,e

	static void processArrays(char [] A, char [] B){
		char [] charsInA = new char[256];
		char [] charsInB = new char[256];
		for(int i = 0; i<A.length;i++){
			char curr = A[i];
			charsInA[curr]++;
			charsInB[curr]--;
		}
		for(int i = 0; i<B.length;i++){
			char curr = B[i];
			charsInB[curr]++;
			charsInA[curr]--;
		}
		String a = "";
		String b="";
		for(int i = 0 ; i<charsInA.length;i++){
			char currChar = (char) i;
			
			int numChars = charsInA[i];
			
			if(numChars>0 && numChars < 4){
				System.out.println(numChars);
				for(int j =0;j<numChars;j++){
					String currString = String.valueOf(currChar);
					a=a.concat(currString);
				}
			}
		}
		for(int i = 0 ; i<charsInB.length;i++){
			char currChar = (char) i;
			int numChars = charsInB[i];
			if(numChars>0 && numChars<4){
				for(int j =0;j<numChars;j++){
					String currString = String.valueOf(currChar);
					b=b.concat(currString);
				}
			}
		}
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public static void main(String [] args){
		//Given two arrays A [a,a,a,b,c]  B [a,b,d,e]
		char [] A = {'a','a','a','b','c'};
		char [] B = {'a','b','d','e'};
		processArrays(A, B);
	}
}
