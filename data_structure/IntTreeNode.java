package data_structure;
import java.util.LinkedList;
import java.util.Queue;

public class IntTreeNode {

	private int value;
	private IntTreeNode leftChild = null;
	private IntTreeNode rightChild = null;
	
	public IntTreeNode(int val) {
		this.value = val;
	}
	
	public IntTreeNode(int val, IntTreeNode leftChild, IntTreeNode rightChild) {
		this.value = val;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}

	public int getVal() {
		return this.value;
	}
	
	public IntTreeNode getLeftChild() {
		return leftChild;
	}
	
	public IntTreeNode getRightChild() {
		return rightChild;
	}
	
	public void setVal(int value) {
		this.value = value;
	}
	
	public void setLeftChild(IntTreeNode leftChild) {
		this.leftChild = leftChild;
	}
	
	public void setRightChild(IntTreeNode rightChild) {
		this.rightChild = rightChild;
	}
	
	public void insertNode(IntTreeNode newNode) {
		if(value < this.value) {
			if(this.getLeftChild() == null) {
				this.setLeftChild(newNode);
			}else {
				this.getLeftChild().insertNode(newNode);
			}
		}else {
			if(this.getRightChild() == null) {
				this.setRightChild(newNode);
			}else {
				this.getRightChild().insertNode(newNode);
			}
		}
	}
	
	public int nodeSum() {
		int result = 0;
		Queue<IntTreeNode> NodeQueue = new LinkedList<IntTreeNode>();
		IntTreeNode node;
		
		NodeQueue.add(this);
		
		while(!NodeQueue.isEmpty()) {
			node = NodeQueue.poll();
			result = result + node.getVal();
			
			if(node.getLeftChild() != null) {
				NodeQueue.add(node.getLeftChild());
			}
			if(node.getRightChild() != null) {
				NodeQueue.add(node.getRightChild());
			}
		}
		
		return result;
	}
	
}
