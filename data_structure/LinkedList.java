package data_structure;

public class LinkedList {
	
	private Node head = null;
	
	public void insertNode(Node newNode) {
		newNode.setNext(this.head);
		this.head = newNode;
	}
	
	public void insertVal(String newNodeVal) {
		Node newNode = new Node(newNodeVal);
		newNode.setNext(this.head);
		this.head = newNode;
	}
	
	public void printLinkedList() {
		Node temp = this.head;
		int i = 0;
		while(temp != null) {
			i++;
			System.out.println("The value of node" + i + " is " + temp.getVal());
			temp = temp.getNextNode();
		}
	}
	
	public int getLength() {
		Node temp = this.head;
		int i = 0;
		while(temp != null) {
			i++;
			temp = temp.getNextNode();
		}
		return i;
	}
}
