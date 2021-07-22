package com.LinkedList.Collections;

import java.util.Iterator;
import java.util.LinkedList;

/* Write a Java program to iterate a linked list in reverse order.*/
public class Program4 {
	//Main Method
	public static void main(String[] args) {
		
		//Create an Empty Linked List 
		LinkedList<Integer> list = new LinkedList<>();
		//Add Elements to Linked List
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		/* public Iterator<E> descendingIterator()
		   Returns an iterator over the elements in this deque in reverse sequential order. 
		   The elements will be returned in order from last (tail) to first (head).
		 */
		Iterator e = list.descendingIterator();
		while(e.hasNext()) {
			System.out.println(e.next());
		}
		
	}

}
