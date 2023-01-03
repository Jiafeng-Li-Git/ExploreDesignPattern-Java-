package data_structure;
import java.util.LinkedList;
import java.util.Queue;


public class BinarySearchTree {
	
	private IntTreeNode root;
	
	public BinarySearchTree() {
		this.root = null;
	}
	
	public BinarySearchTree(IntTreeNode root) {
		this.root = root;
	}
	
	public IntTreeNode getRoot() {
		return this.root;
	}
	
	public void insert(int value) {
		IntTreeNode newNode = new IntTreeNode(value);
		if(this.root == null) {
			this.root = newNode;
		}else {
			root.insertNode(newNode);
		}
		
	}
	
	public int insertNode(int value) {	
		int level = 0;
		IntTreeNode cur = root;
		IntTreeNode next = root;
		IntTreeNode newNode = new IntTreeNode(value);
		
		while(cur != null) {
			cur = next;
			level++;
			if(value < cur.getVal()) {
				next = cur.getLeftChild();
				if (next == null) {
					cur.setLeftChild(newNode);
					break;
				}
			} else {
				next = cur.getRightChild();
				if (next == null) {
					cur.setRightChild(newNode);
					break;
				}
			}
		}
		
		if(level == 0) {
			this.root = newNode;
		}
		
		return level;
	}
	
	
	public void depthFirstPrint() {
	
		if(root != null) {
			BinarySearchTree leftSubTree = new BinarySearchTree(root.getLeftChild());
			leftSubTree.depthFirstPrint();
			System.out.println(root.getVal());
			BinarySearchTree rightSubTree = new BinarySearchTree(root.getRightChild());
			rightSubTree.depthFirstPrint();
		}

	}
	
	
	public void breadthFirstPrint() {
		
		Queue<IntTreeNode> NodeQueue = new LinkedList<IntTreeNode>();
		IntTreeNode node;
		
		if(root == null) {
			return;
		}
		
		NodeQueue.add(root);
		
		while(!NodeQueue.isEmpty()) {
			node = NodeQueue.poll();
			System.out.println(node.getVal());
			
			if(node.getLeftChild() != null) {
				NodeQueue.add(node.getLeftChild());
			}
			if(node.getRightChild() != null) {
				NodeQueue.add(node.getRightChild());
			}	
		}
	}
}
