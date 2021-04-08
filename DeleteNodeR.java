package linkedlist2;
import java.util.Scanner;
public class DeleteNodeR {
	public static Node<Integer> takeInput(){
		Scanner s= new Scanner(System.in);
		int data=s.nextInt();
		Node<Integer> head = null,tail=null;
		while(data != -1) {
			Node<Integer> cNode=new Node<Integer>(data);
			if(head==null) {
				head=cNode;
				tail=cNode;
			}
			else {
				tail.next=cNode;
				tail=cNode;
			}
			
			data=s.nextInt();
		}
		return head;
	}
public static void printR(Node<Integer> head) {
		
		if(head==null) {
			return;
		}
		
		System.out.print(head.data +" ");
	
		printR(head.next);
		
		
	}
   public static Node<Integer> deleteNode(Node<Integer> head , int pos) {
	   if(head==null) {
		   return head;
	   }
	   if(pos<0) {
		   return head;
	   }
	   if(pos==0) {
		   Node<Integer> newHead=head.next;
		   return newHead;
	   }
	   head.next=deleteNode(head.next,pos-1);
	   return head;
   }

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		
		head=deleteNode(head,3);
		printR(head);
	}

}
