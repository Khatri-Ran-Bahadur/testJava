package linkList;

public class LinkedList {
	private Node head;
	int count=0;
	public boolean isEmpty() {
		return (head == null);
	}
 
	// used to insert a node at the start of linked list
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}
	public void insertAfter(Node after,Node data) {
		Node temp=head;
		while(temp.next!=null && temp.data!=after.data) {
			temp=temp.next;
		}
		if(temp.next==null) {
			insertLast(data.data);
		}
		else if(after.data==temp.data) {
			Node newNode=new Node();
			newNode.data=data.data;
			temp.next=newNode;
			newNode.next=temp.next;
		}
	}
 
	// used to delete node from start of linked list
	public Node deleteFirst() {
		Node temp = head;
		head = head.next;
		return temp;
	}
 
	// Use to delete node after particular node
	public void deleteAfter(Node after) {
		Node temp = head;
		while (temp.next != null && temp.data != after.data) {
			temp = temp.next;
		}
		if (temp.next != null)
			temp.next = temp.next.next;
	}
 
	// used to insert a node at the start of linked list
	public void insertLast(int data) {
		Node current = head;
		while (current.next != null) {
			current = current.next; // we'll loop until current.next is null
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}
 
	// For printing Linked List
	public void printLinkedList() {
		System.out.println("Printing LinkedList (head --> last) ");
		Node current = head;
		while (current != null) {
			count++;
			System.out.println("Node Serial=>"+count+"  \t\t head data=>"+current.data);
			current.displayNodeData();
			current = current.next;
		}
		System.out.println();
	}
}
