package com.LinkedList.Collections;

import java.util.LinkedList;

/*Write a Java program to iterate through all elements in a linked list.*/
public class Program2 {

	public static void main(String[] args) {
		LinkedList<String> llist = new LinkedList<>();
		llist.add("Banana");
		llist.add("Apple");
		llist.add("Kiwi");
		llist.add(null);
		
		//Iterate through all elements
		for(String e : llist) {
			System.out.println(e);
		}
	}
}
