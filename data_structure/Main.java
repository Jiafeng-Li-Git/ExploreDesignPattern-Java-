package data_structure;

public class Main {
	public static void main(String[] args){
		
		// LinkedList
		LinkedList sampleLinkedList = new LinkedList();
		sampleLinkedList.insertVal("Hello data structure!");
		sampleLinkedList.insertVal("Hello 2");
		sampleLinkedList.insertVal("Now hello 3");
		
		sampleLinkedList.printLinkedList();
		System.out.println("The length of the LinkedList is " + sampleLinkedList.getLength());
		
		// String Validation Algorithms
		StringValidationer sver = new StringValidationer();
		System.out.println("Validating if the string \"STRING\" is all uppercase... " + sver.allUpperCaseValidation("STRING"));
		System.out.println("Validating if the string \"STRI123NG\" is all uppercase... " + sver.allUpperCaseValidation("STRI123NG"));
		System.out.println("Validating if the string \"string\" is all lowercase... " + sver.allLowerCaseValidation("string"));
		System.out.println("Validating if the string \"string123\" is all uppercase... " + sver.allLowerCaseValidation("STRI123NG"));
		System.out.println("asdsa " + sver.isPalindrome("asdsa"));
		
		
		// Recursion, Hanoi Tower
		HanoiTower ht = new HanoiTower();
		System.out.println(ht.move(5, "A", "C", "B", 0));
	
		// Binary Search Tree (Recursive data structure)
		BinarySearchTree tr = new BinarySearchTree();
		tr.insertNode(23);
		tr.insertNode(13);
		System.out.println(tr.insertNode(17));
		System.out.println(tr.insertNode(4));
		tr.insert(25);
		System.out.println(tr.insertNode(27));
		//Depth-First
		System.out.println("Depth First Search");
		tr.depthFirstPrint();
		//Breadth-First
		System.out.println("Breadth First Search");
		tr.breadthFirstPrint();
		//Sum
		System.out.println(tr.getRoot().getRightChild().nodeSum());
		
	}
}
