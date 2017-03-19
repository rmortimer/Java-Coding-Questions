/*
 * Inorder sequence: D B E A F C
Preorder sequence: A B D E C F
 */
public class ConstructTree {

	public static int findElement (int element, int [] arr, int start, int end){
		for(int i =start; i <end; i++){
			if(arr[i] == element)
				return i;
		}
		return -1;
	}
	
	public static int findElement (int element, int [] arr){
		for(int i =0; i <arr.length; i++){
			if(arr[i] == element)
				return i;
		}
		return -1;
	}
	
	public static void buildTree(int [] inOrder, int [] preOrder){
				Node root = new Node(inOrder[0],null,null);
				root.left = makeTree()
	}
	public static Node makeTree (int [] inorder, int [] preOrder,Node root ){
	
		
	}
}
