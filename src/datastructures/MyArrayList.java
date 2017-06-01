package datastructures;

import java.util.Arrays;

public class MyArrayList {
	private Object[] arrayList;
	private int size = 10;
	private int pointer = 0;

	public MyArrayList() {
		// TODO Auto-generated constructor stub
		arrayList = new Object[size];
	}

	public MyArrayList(int size) {
		arrayList = new Object[size];
		this.size = size;
	}
	
	public int capacity(){
		return this.size;
	}

	public int size() {
		return this.pointer;
	}

	public void add(Object o) {
		if (pointer > size - 1) {
			Object[] oldArrayList = arrayList;
			size = size * 2;
			arrayList = new Object[size];
			for(int i=0; i<oldArrayList.length; i++){
				arrayList[i] = oldArrayList[i];
			}
		}
		arrayList[pointer] = o;
		pointer++;
	}

	public Object get(int pointer) throws Exception {
		if(pointer <= this.pointer && pointer >= 0){
			return arrayList[pointer];
		}
		else{
			System.out.println("Enter the index within the range!");
			throw new Exception();
		}
	}

	public void remove(int index) {
		if (index > size - 1 || index < 0) {
			System.out.println("Enter the index within the range!");
		}
		else{
			arrayList[index] = null;
			while (index < size - 1) {
				arrayList[index] = arrayList[index + 1];
				arrayList[index + 1] = null;
				index++;
			}
			pointer--;
		}
		
	}
	
	@Override
	public String toString() {
		Object[] o = new Object[pointer];
		for(int i=0; i<pointer; i++){
			o[i] = arrayList[i];
		}
		return Arrays.toString(o);
	}
}
