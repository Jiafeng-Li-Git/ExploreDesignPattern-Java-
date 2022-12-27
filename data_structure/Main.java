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
	
		// Recursion, Hanoi Tower
		HanoiTower ht = new HanoiTower();
		System.out.print(ht.move(5, "A", "C", "B", 0));
	
	
	}
}
