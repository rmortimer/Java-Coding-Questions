import String;


public class Knight {
	
	public static int[][] map  = {{4,6},{6,8},{7,9},{4,8},{3,9},{},{1,7},{2,6},{1,3},{3,2}};
								//0		1		2	3		4	5	6		7	8		9
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		final int numLength = 5;
		int [][] DPArr =new int [numLength][10];
		for(int i =0; i<map.length;i++){
			DPArr[1][i] =1;
		}
		
		for(int i = 2; i< numLength;i ++){ //move down the rows representing num length
			for(int j =0; j<map.length;j++){ //run over columns represent possible numbers
				int currentSum = DPArr[1][j];
				System.out.println("Current Sum is: "+ currentSum);
				for(int k = 0; k<map[j].length; k++){
					
					int nextMove =map[j][k];
					System.out.print("Next Move is" + nextMove);
					System.out.println("DParr at numLength - i -1 is: " + DPArr[i-1][nextMove]);
					currentSum += DPArr[i-1][nextMove];
				}
				DPArr[i][j] = currentSum;
			}
				
			}
		
		for(int j = 0 ; j < numLength; j++){
			System.out.print("Row " + j + ":   ");
			for(int i = 0; i< map.length ; i++){
				System.out.print(" Nums for index: " + i +" is :" + DPArr[j][i]);
			}
		System.out.println("");
		}
			
	}
		
		
		
	

}
