package com.LinkedList.Collections;

import java.util.LinkedList;

/*Write a Java program to display the elements and their positions in a linked list.*/
public class Program8 {
	
	public static void main(String[] args) {
		//Create an empty Linked list 
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		for(int i=0;i<list.size();i++) {
			System.out.println("Index is "+i+"Value is "+list.get(i));
		}
		/*Write a Java program to remove a specified element from a linked list.*/
		list.remove(1);
		System.out.println(list);
		//Adding back the removed value 
		list.add(1,2);
		//Removing the first and last element from the list 
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		//Remove all elements from the linked list
		list.clear();
		System.out.println(list);
	}

}
