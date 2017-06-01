package datastructures;

public class NodeLinkedList {
	private NodeLinkedList nextNode;
	private Object data;

	public NodeLinkedList() {

	}

	public NodeLinkedList(Object value) {
		data = value;
	}

	public NodeLinkedList(Object value, NodeLinkedList next) {
		data = value;
		nextNode = next;
	}

	public NodeLinkedList getNextNode() {
		return nextNode;
	}

	public void setNextNode(NodeLinkedList nextNode) {
		this.nextNode = nextNode;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
