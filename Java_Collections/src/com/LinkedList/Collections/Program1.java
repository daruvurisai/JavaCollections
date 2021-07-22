package com.LinkedList.Collections;

import java.util.LinkedList;

/*Write a Java program to append the specified element to the end of a linked list. */
public class Program1 {
	
	//Main Method 
	public static void main(String[] args) {
		//Implementing linked list
		LinkedList<String> llist = new LinkedList<>();
		llist.add("Banana");
		llist.add("Apple");
		llist.add("Kiwi");
		llist.add(null);
		
		//Print the linked list 
		System.out.println(llist);
	}
	
}
