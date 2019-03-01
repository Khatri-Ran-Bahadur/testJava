package algorithm;

class Node{
	
	int value;
	Node next;
	Node(int value){
		this.value=value;
	}
}
public class SingleLinkList {
	private Node head;
	int count;
	public void insertHead(int x) {
		Node newNode =new Node(x);
		newNode.next=head;
		head=newNode;
		++count;
	}
	public Node deleteHead() {
		if(isEmpty()) {
			throw new RuntimeException("the list if empty");
		}
		Node temp=head;
		--count;
		head=head.next;
		return temp;
	}
	private boolean isEmpty() {
		return count==0;
	}
	public void print_list() {
		Node current =head;
		while(current!=null) {
			System.out.println(current.value + "========");
			current=current.next;
		}
	}
	public static void main(String argd[]) {
		SingleLinkList list= new SingleLinkList();
		assert list.isEmpty(); //assert keyword exception halt
		list.insertHead(5);
		list.insertHead(7);
		list.insertHead(9);
		list.print_list();
		
	}
}
