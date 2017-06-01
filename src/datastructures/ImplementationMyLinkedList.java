package datastructures;

public class ImplementationMyLinkedList {
	public static void main(String[] args) {
		MyLinkedList l1 = new MyLinkedList();
		System.out.println(l1.getSize());
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		try {
			System.out.println(l1.find(1).getData());
		} catch (Exception e) {
			System.out.println("Not found");
		}		
		System.out.println(l1.remove(5));
		System.out.println(l1.getSize());
		try {
			System.out.println(l1.find(5).getData());
		} catch (Exception e) {
			System.out.println("Not found");
		}
	}
}
