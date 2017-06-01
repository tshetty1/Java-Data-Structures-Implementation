package datastructures;

public class MyDoublyLinkedList {
	private NodeDoublyLinkedList head;
	public int size;

	public MyDoublyLinkedList() {
		head = null;
		size = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFront(Object data) {
		if (head == null) {
			head = new NodeDoublyLinkedList(null, data, null);
		} else {
			NodeDoublyLinkedList newNode = new NodeDoublyLinkedList(null, data,
					head);
			head.previous = newNode;
			head = newNode;
		}
		size++;
	}

	public void addRear(Object data) {
		if (head == null) {
			head = new NodeDoublyLinkedList(null, data, null);
		} else {
			NodeDoublyLinkedList current = head;
			while (current.next != null) {
				current = current.next;
			}
			NodeDoublyLinkedList newNode = new NodeDoublyLinkedList(current,
					data, null);
			current.next = newNode;
		}
		size++;
	}

	public void insertAt(Object data, int index) {
		if (head == null) {
			return;
		}
		if (index < 1 || index > size) {
			return;
		}

		NodeDoublyLinkedList current = head;
		int i = 1;
		while (i < index) {
			current = current.next;
			i++;
		}
		if (current.previous == null) {
			NodeDoublyLinkedList newNode = new NodeDoublyLinkedList(null, data,
					current);
			current.previous = newNode;
			head = newNode;
		} else {
			NodeDoublyLinkedList newNode = new NodeDoublyLinkedList(
					current.previous, data, current);
			current.previous.next = newNode;
			current.previous = newNode;
		}
		size++;
	}

	public void removeFront() {
		if (head == null) {
			return;
		}
		head = head.next;
		head.previous = null;
		size--;
	}

	public void removeRear() {
		if (head == null) {
			return;
		}
		NodeDoublyLinkedList current = head;
		while (current.next.next != null) {
			current = current.next;
		}
		current.next = null;
		size--;
	}

	public void removeAt(int index) {
		if (head == null) {
			return;
		}
		if (index < 1 || index > size) {
			return;
		}

		NodeDoublyLinkedList current = head;
		int i = 1;
		while (i < index) {
			current = current.next;
			i++;
		}
		if (current.next == null) {
			current.previous.next = null;
		} else if (current.previous == null) {
			current = current.next;
			current.previous = null;
			head = current;
		} else {
			current.previous.next = current.next;
			current.next.previous = current.previous;
		}
		size--;
	}

	public void print() {
		NodeDoublyLinkedList current = head;
		while (current != null) {
			System.out.println(current.getData());
			current = current.next;
		}
	}
}
