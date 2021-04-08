package linkedlist2;
import java.util.Scanner;
public class ReverseRecursively {
	public static Node<Integer> takeInput() {
		Scanner s= new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head=null,tail=null;
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
	public static Node<Integer> reverseR(Node<Integer> head){
		if(head==null || head.next==null) {
			return head;
		}
		Node<Integer> smallHead=reverseR(head.next);
		Node<Integer> tail = smallHead;
		while(tail.next != null) {
			tail=tail.next;
		}
		tail.next=head;
		head.next=null;
		
		return smallHead;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head= takeInput();
		head=reverseR(head);
		printR(head);
	}

}
