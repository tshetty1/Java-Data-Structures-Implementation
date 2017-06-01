package datastructures;

public class ImplementationMyQueue {
	public static void main(String[] args) {
		MyQueue myQueue = new MyQueue(5);
		System.out.println(myQueue.capacity());
		System.out.println(myQueue.size());
		
		for(int i=1; i<=5; i++){
			myQueue.enqueue(i);
		}
		System.out.println(myQueue.size());
		System.out.println(myQueue);
		
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.dequeue();
		
		myQueue.enqueue(6);
		myQueue.enqueue(7);
		System.out.println(myQueue);
		System.out.println(myQueue.size());
	}
}
