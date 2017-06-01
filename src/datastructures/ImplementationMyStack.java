package datastructures;

public class ImplementationMyStack {
	public static void main(String[] args) {
		MyStack myStack = new MyStack(5);
		System.out.println(myStack.size());
		System.out.println(myStack.isEmpty());
		myStack.push(10);
		System.out.println(myStack.size());
		for (int i = 1; i <= 4; i++) {
			myStack.push(i);
		}
		System.out.println(myStack);
		myStack.push(11);

		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();

		System.out.println(myStack);
	}
}
