package linkList;

public class Main {

	public static void main(String args[])
	{
		LinkedList myLinkedlist = new LinkedList();
		myLinkedlist.insertFirst(5);
		myLinkedlist.insertFirst(6);
		myLinkedlist.insertFirst(7);
		myLinkedlist.insertFirst(1);
		myLinkedlist.insertLast(2);
		myLinkedlist.insertFirst(8);
		myLinkedlist.deleteFirst();
		// Linked list will be 
		// 2 -> 1 ->  7 -> 6 -> 5
		Node afterNode=new Node();
		afterNode.data=2;
		Node addedNode=new Node();
		addedNode.data=74;
		myLinkedlist.insertAfter(afterNode,addedNode);
		//myLinkedlist.deleteAfter(node);
		// After deleting node after 1,Linked list will be 
		// 2 -> 1 -> 6 -> 5
		myLinkedlist.printLinkedList();
	}

}
