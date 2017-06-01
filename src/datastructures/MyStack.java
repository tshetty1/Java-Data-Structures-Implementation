package datastructures;

import java.util.Arrays;

public class MyStack {
	private Object[] myStack;
	private int top;
	private int size;

	public MyStack(int n) {
		myStack = new Object[n];
		top = -1;
		size = n;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public int capacity() {
		return size;
	}

	public int size() {
		return top + 1;
	}

	public void push(Object item) {
		if (top >= size - 1) {
			System.out.println("Stack is full");
		} else {
			top++;
			myStack[top] = item;
		}
	}

	public Object pop() {
		if (isEmpty()) {
			System.out.println("Stack empty");
			return top;
		} else {
			Object o = myStack[top];
			top--;
			System.out.println("Item popped is " + o);
			return top;
		}
	}

	public Object peek() {
		if (isEmpty()) {
			System.out.println("Stack empty");
			return top;
		} else {
			return myStack[top];
		}
	}

	@Override
	public String toString() {
		return Arrays.toString(myStack);
	}

}
