

import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTree {
	
	public Node head;
	
	public BinaryTree(){
		
	}
	
	public BinaryTree(Node head){
		this.head = head;
	}
	
	
	public Node buildTree(int [] nodes){
		if(nodes.length<3){
			return null;
		}
		Node [] arr = new Node [nodes.length];
		for(int i = 0; i <nodes.length; i++){
			arr[i] = new Node(nodes[i]);
		}
		
		Node head = arr[0];
		
		int i = 0;
			
		Node currNode = head;
		while(true){
			int index = (2*i)+1;
			if(index>=arr.length){
				break;
			}
			else currNode.left = arr[index];
			index = (2*i)+2;
			if(index>=arr.length){
				break;
			}
			else currNode.right = arr[index];
			
			i++;
			currNode = arr[i];
		}
		
		
		this.head = head;
		return head;
	}
	
	public void printTreePreOrder(Node head){
		if(head == null)
			return;
		System.out.print(head.value + " ");
		printTreePreOrder(head.left);
		printTreePreOrder(head.right);
		
	}
	
	public void printTreeInOrder(Node head){
		if(head == null)
			return;
			printTreeInOrder(head.left);
		System.out.print(head.value + " ");
		printTreeInOrder(head.right);
		
	}
	
	public void buildFriendPointers(Node head){
		Queue myQueue = new ArrayDeque();
		myQueue.offer(head);
		while(myQueue.isEmpty() == false){
		Node currNode = (Node) myQueue.poll();
		
		Node friendNode = (Node)myQueue.peek();
		if(friendNode!=null && friendNode.value>currNode.value)//Assuming BST if the node in the queue is less than it than its on a different level
			currNode.friend = friendNode;
		if(currNode.left!=null)
		myQueue.offer(currNode.left);
		if(currNode.right!=null)
		myQueue.offer(currNode.right);
		}
		
		
	}
	
	public void printAllFriendsOneNode(Node head){
		Node currNode = head;
		
		while(currNode!= null){
			System.out.print(currNode.value + " ");
			currNode = currNode.friend;
		}
		System.out.print(currNode); // Should be null at the end
	}
	
	public void printTreeByFriends(Node head){
		if(head == null)
			return;
		printAllFriendsOneNode(head);
		System.out.println(" ");
		printTreeByFriends(head.left);
	}

}
