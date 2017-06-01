package datastructures;

public class NodeDoublyLinkedList {
	private Object data;
	public NodeDoublyLinkedList previous;
	public NodeDoublyLinkedList next;

	public NodeDoublyLinkedList(Object o) {
		data = o;
		previous = null;
		next = null;
	}

	public NodeDoublyLinkedList(NodeDoublyLinkedList p, Object o,
			NodeDoublyLinkedList n) {
		data = o;
		previous = p;
		next = n;
	}

	public Object getData() {
		return data;
	}
}
