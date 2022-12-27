package data_structure;

public class Node {
	
	private String value;
	private Node next;
	
	public Node(String val) {
		this.value = val;
		this.next = null;
	}
	
	public Node(String val, Node next) {
		this.value = val;
		this.next = next;
	}
	
	public void setNext(Node nextNode) {
		this.next = nextNode;
	}
	
	public String getVal() {
		return this.value;
	}
	
	public Node getNextNode() {
		return this.next;
	}
}
