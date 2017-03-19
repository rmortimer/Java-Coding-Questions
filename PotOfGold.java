/*
 * There are two players A & B.
Pots of gold are arranged in a line, each containing some gold coins 
(the player can see how many gold coins are there in each gold pot - perfect information). 
 They get alternating turns in which the player can pick a pot from one of the ends of the line.  
 The winner is the player which has highest number of gold coins at the end.
The objective is to maximize the number of gold coins collected by A, assuming B also plays optimally.  A starts the game.
 */
public class PotOfGold {
	
	//Base Case = 5;
	//Base Case = 5,10; Player 1 picks greater of two numbers.
	//Base Case 5,10,20 Player 1 picks greater of two numbers and then whatever is left
	//Base Case 4,10,20,5 Optimal scenario is P1 picks 4,P2 picks 10, P1 picks 20, P2 picks 5
	//P1 thinks if I choose 4 P1 gets the max of 10 and 5
	
	public static int optimalChoice (int [] arr){
		//If I pick start I can get start +(start +1) or (start+end)
		//If I pick end I can get end+start or end+end-1;
		//But I want to know what player 2 will pick.
		/*
		 * Which means I want to make my choice based on
		 * If I pick start I can get start+(start+2)
		 * or I can get start
		 */
		int start = 0;
		int end = arr.length - 1;
		int p1Sum = 0;
		int p2Sum =0;
		int pickStart;
		int  pickEnd;
		while((end-start)>4){
			pickStart = Math.max((arr[start]+arr[start+2]), (arr[start] + arr[end-1]));
			pickEnd = Math.max((arr[end] + arr[end-2]),(arr[end] + arr[start+1]));
			if(pickStart>=pickEnd){ //P1 Pick
				System.out.println("P1 Picking start: " + arr[start]);
				p1Sum = p1Sum + arr[start];
				start++;
			}
			else{
				System.out.println("P1 Picking end: " + arr[end]);
				p1Sum = p1Sum + arr[end];
				end--;
			}
			
			
			//P2 Pick
			pickStart = Math.max((arr[start]+arr[start+2]), (arr[start] + arr[end-1]));
			pickEnd = Math.max((arr[end] + arr[end-2]),(arr[end] + arr[start+1]));
			if(pickStart>=pickEnd){ //P1 Pick
				System.out.println("P2 Picking start: " + arr[start]);
				p2Sum = p2Sum + arr[start];
				start++;
			}
			else{
				System.out.println("P2 Picking end: " + arr[end]);
				p2Sum = p2Sum + arr[end];
				end--;
			}
			
		}
		System.out.println("P1 Sum is: "+ p1Sum);
		System.out.println("P2 Sum is: "+ p2Sum);
		
		return 0;
	}
	
	public static void main(String [] args){
		int [] arr = {1,100,1,100,1,100,1,100,1,100,2,100};
		int maxSum = optimalChoice(arr);
		System.out.println(maxSum);
	}

}
