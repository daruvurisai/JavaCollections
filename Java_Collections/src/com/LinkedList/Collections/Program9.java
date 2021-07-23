package com.LinkedList.Collections;

import java.util.Collections;
import java.util.LinkedList;

/*Write a Java program of swap two elements in a linked list.*/
public class Program9 {
	
	//Main method
	public static void main(String[] args) {
		//Create an empty linked list 
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		//Swapping 
		Collections.swap(list, 1, 2);
		System.out.println(list);
		//Shuffle the collection Linked list
		Collections.shuffle(list);
		System.out.println(list);
		
	}
}
