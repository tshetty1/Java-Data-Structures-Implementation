package datastructures;

import java.util.Arrays;

public class MyQueue {
	private Object[] myQueue;
	private int size;
	private int count;
	private int front;
	private int rear;

	public MyQueue(int n) {
		// TODO Auto-generated constructor stub
		myQueue = new Object[n];
		size = n;
		front = -1;
		rear = -1;
	}

	public int capacity() {
		return size;
	}

	public int size() {
		return count;
	}

	public boolean isEmpty() {
		return (front == -1 && rear == -1);
	}

	public void enqueue(Object o) {
		if ((rear + 1) % size == front) {
			return;
		} else if (isEmpty()) {
			front = 0;
			rear = 0;
		} else {
			rear = (rear + 1) % size;
		}
		myQueue[rear] = o;
		count++;
	}

	public int dequeue() {
		if (isEmpty()) {
			return -1;
		} else if (front == rear) {
			front = rear = -1;
			count--;
			return front;
		} else {
			Object n = myQueue[front];
			int index = front;
			myQueue[front] = -1;
			front = (front + 1) % size;
			count--;
			System.out.println("The item deleted from Queue is " + n);
			return index;
		}

	}
	
	@Override
	public String toString(){
		return Arrays.toString(myQueue);	
	}

}
