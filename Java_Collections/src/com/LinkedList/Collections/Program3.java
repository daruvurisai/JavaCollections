package com.LinkedList.Collections;

import java.util.Iterator;
import java.util.LinkedList;

/*Write a Java program to iterate through all elements in a linked list starting at the specified position.*/
public class Program3 {
	//Main Method
	public static void main(String[] args) {
		
		//Create an Empty Linked List 
		LinkedList<Integer> list = new LinkedList<>();
		//Add Elements to Linked List
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		//Set Iterator at specified index where the position starts
		Iterator e = list.listIterator(1);
		//Print the List from 1st position 
		while(e.hasNext()) {
			System.out.println(e.next());
		}
		
		
	}
	

}

/*Notes hasNext() : hasNext() method returns true if iterator have more elements.

-->next() : next() method returns the next element and also moves cursor pointer to the next element.

public ListIterator<E> listIterator(int index)
-->Returns a list-iterator of the elements in this list (in proper sequence), starting at the specified position 
in the list. Obeys the general contract of List.listIterator(int).

*/