package datastructures;

public class ImplementationMyArrayList {
	public static void main(String[] args) throws Exception {
		MyArrayList myArrayList = new MyArrayList();
		int size = myArrayList.size();
		System.out.println(size);

		for (int i = 1; i <= 10; i++) {
			myArrayList.add(i);
		}
		System.out.println(myArrayList);

		myArrayList.add(11);
		System.out.println(myArrayList.size());
		System.out.println(myArrayList);
		for (int i = 0; i < myArrayList.size(); i++) {
			System.out.print(myArrayList.get(i) + " ");
		}
		System.out.println("");
		myArrayList.remove(3);
		System.out.println(myArrayList);
		
		myArrayList.remove(5);
		System.out.println(myArrayList);
		System.out.println(myArrayList.size());
		System.out.println(myArrayList.capacity());
		
		MyArrayList myArrayList2 = new MyArrayList(5);
		System.out.println(myArrayList2.size());
		System.out.println(myArrayList2.capacity());
		
		for(int i=1; i<=6; i++){
			myArrayList2.add(i);
		}
		
		System.out.println(myArrayList2);
		System.out.println(myArrayList2.size());
		System.out.println(myArrayList2.capacity());
		myArrayList2.remove(1);
		System.out.println(myArrayList2);
		System.out.println(myArrayList2.size());
		System.out.println(myArrayList2.capacity());

	}
}
