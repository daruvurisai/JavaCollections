package com.LinkedList.Collections;

import java.util.LinkedList;

/*Write a Java program to insert elements into the linked list at the first and last position.*/
public class Program6 {
	
	public static void main(String[] args) {
		//Create an Empty Linked List 
				LinkedList<Integer> list = new LinkedList<>();
				//Add Elements to Linked List
				list.add(1);//0
				list.add(2);//1
				list.add(3);//2
				list.add(4);//3
				//Add element at first 
				list.addFirst(0);
				//Add elemtn at last 
				list.addLast(5);
				//Print the list 
				System.out.println(list);
	}

}
