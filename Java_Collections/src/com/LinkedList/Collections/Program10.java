package com.LinkedList.Collections;

import java.util.LinkedList;

/*Write a Java program to join two linked lists.*/
public class Program10 {
	public static void main(String[] args) {
		//Create an Empty Linked List 
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(1);
		list1.add(2);
		//Create another linked list 
		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(3);
		list2.add(4);
		
		//Two Linked List adding 
		LinkedList<Integer> l3 = new LinkedList<>();
		l3.addAll(list1);
		l3.addAll(list2);
		System.out.println(l3);
		
		//Cloning a linked list
		LinkedList<Integer> clonedlist = new LinkedList<>();
		clonedlist = (LinkedList)l3.clone();
		//Checking weather we have done cloning or not
		System.out.println(l3.hashCode());
		System.out.println(clonedlist.hashCode());
		
	}
	
}
