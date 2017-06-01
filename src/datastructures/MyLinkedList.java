package datastructures;

public class MyLinkedList {
	private NodeLinkedList root;
	private int size;

	public MyLinkedList() {
		root = new NodeLinkedList();
		size = 0;
	}

	public void setSize(int n) {
		this.size = n;
	}

	public int getSize() {
		return size;
	}

	public NodeLinkedList add(Object element) {
		NodeLinkedList newNode = new NodeLinkedList(element, root);
		this.root = newNode;
		this.size++;
		return newNode;
	}

	public NodeLinkedList find(Object element) {
		NodeLinkedList p1 = this.root;
		while (p1 != null) {
			if (p1.getData() == element) {
				return p1;
			}
			p1 = p1.getNextNode();
		}
		return null;
	}

	public boolean remove(Object element) {
		NodeLinkedList thisNode = this.root;
		NodeLinkedList prevNode = null;
		while (thisNode != null) {
			if (thisNode.getData() == element) {
				if (prevNode != null) {
					prevNode.setNextNode(thisNode.getNextNode());
					this.root = prevNode;
				}
				this.root = null;
				this.setSize(this.getSize() - 1);
				return true;
			}
			prevNode = thisNode;
			thisNode = thisNode.getNextNode();
		}
		return false;
	}
}
