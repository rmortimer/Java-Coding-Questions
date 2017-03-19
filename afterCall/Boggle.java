package afterCall;

import java.util.ArrayList;

public class Boggle {
	
	public static char [][] board = new char[][] {{'a','b','c'}, {'a','b','c'}, {'a','b','c'}};
	public static String [] dict = new String [] {"aa","ab","abcc"};
	public static ArrayList wordList = new ArrayList();
	
	public  boolean isWord(String word){
		for(int i = 0 ; i < dict.length; i ++){
			if(dict[i].equals(word))
				return true;
		}
		return false;
	}
	
	 boolean isValidMove(int i, int j){
		if(i>=0 && j>=0 && i<board[0].length && j<board.length)
			return true;
		else return false;
	}
	public  void boggleSolver(){
		for(int i = 0 ; i <board.length; i++)
			for(int j = 0; j<board[i].length; j++){
				boolean [][]visited = new boolean [board.length][board[i].length];
				boggleSolverUtil(visited,"",i,j);
			}
				
		
	}
	
	public  void boggleSolverUtil(boolean [][]visited,String wordSoFar, int i, int j){
		
		visited[i][j] = true; //DEEP COPY TO WORK
		
		wordSoFar = wordSoFar + board[i][j];
		if(isWord(wordSoFar)){
			System.out.println("Adding word "+ wordSoFar);
			wordList.add(wordSoFar);
		}
		
		if(isValidMove(i, j-1) && !visited[i][j-1])//left
			boggleSolverUtil(visited,wordSoFar,i,j-1);
		if(isValidMove(i, j+1) && !visited[i][j+1])//right
			boggleSolverUtil(visited,wordSoFar,i,j+1);
		if(isValidMove(i+1, j) && !visited[i+1][j]){//down
			System.out.println("Moving down for " + wordSoFar + " + " +board[i+1][j]);
			boggleSolverUtil(visited,wordSoFar,i+1,j);
		}
		if(isValidMove(i-1, j) && !visited[i-1][j])//up
			boggleSolverUtil(visited,wordSoFar,i-1,j);
		
		if(isValidMove(i-1, j-1) && !visited[i-1][j-1])//left
			boggleSolverUtil(visited,wordSoFar,i-1,j-1);
		if(isValidMove(i+1, j+1) && !visited[i+1][j+1])//right
			boggleSolverUtil(visited,wordSoFar,i+1,j+1);
		if(isValidMove(i+1, j-1) && !visited[i+1][j-1])//down
			boggleSolverUtil(visited,wordSoFar,i+1,j-1);
		if(isValidMove(i-1, j+1) && !visited[i-1][j+1])//up
			boggleSolverUtil(visited,wordSoFar,i-1,j+1);
		
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boggle myBoggle = new Boggle();
		myBoggle.boggleSolver();
		
	}

}
