package com.LinkedList.Collections;

import java.util.LinkedList;

/*Write a Java program to insert the specified element at the specified position in the linked list.*/
public class Program5 {

	public static void main(String[] args) {
		//Create an Empty Linked List 
		LinkedList<Integer> list = new LinkedList<>();
		//Add Elements to Linked List
		list.add(1);//0
		list.add(2);//1
		list.add(3);//2
		list.add(4);//3
		//Adding element 5 at index 2
		list.add(2, 5);
		System.out.println(list);
		

	}

}
