package com.LinkedList.Collections;

import java.util.LinkedList;

/*Write a Java program to remove and return the first element of a linked list.*/
public class Program11 {

	public static void main(String[] args) {
		//Create an Empty Linked List 
				LinkedList<Integer> list1 = new LinkedList<>();
				list1.add(1);
				list1.add(2);
				list1.add(3);
				list1.add(4);
				list1.pop();
				System.out.println(list1);
				//Peek firsr element in the list but not remove
				int peeknum = list1.peekFirst();
				System.out.println(peeknum);
				//Peek Last element 
				int peeklast = list1.peekLast();
				System.out.println(peeklast);
				// check if a particular element exists in a linked list.
				boolean b = list1.contains(7);
				if(b) {
					System.out.println("There");
				}
				else
				{
					System.out.println("Not there");
				}

	}

}
