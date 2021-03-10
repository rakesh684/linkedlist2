package linkedlist2;

import java.util.Scanner;

import linkedlist2.Node;
public class RecursiveList {
	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		int data=s.nextInt();
		Node<Integer> head=null,tail=null;
		while(data != -1) {
			Node<Integer> currentNode = new Node<Integer>(data);
			if(head == null) {
				head=currentNode;
				tail=currentNode;
			}
			else {
				tail.next=currentNode;
				tail=currentNode;
			}
			
			data=s.nextInt();
		}
		return head;
		
	}
	public static void printR(Node<Integer> head) {
		
		if(head==null) {
			return;
		}
		printR(head.next);
		System.out.print(head.data +" ");
	
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Node<Integer> head = takeInput();
       printR(head);
	}

}
