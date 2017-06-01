package datastructures;

public class ImplementationMyDoublyLinkedList {
	public static void main(String[] args) {
		MyDoublyLinkedList list = new MyDoublyLinkedList();
		list.addFront(5);
		list.addFront(20);
		list.addRear(10);
		//list.print();
		//list.addRear(20);
		//list.print();
		/*list.removeFront();
		list.print();
		list.removeRear();
		list.print();*/
		System.out.println(list.size);
		list.insertAt(36, 3);
		list.print();
		System.out.println(list.size);
		list.removeAt(4);
		list.print();
		System.out.println(list.size);
	}
}
