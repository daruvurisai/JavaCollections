package com.LinkedList.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*Write a Java program to convert a linked list to array list.*/
public class Program12 {

	public static void main(String[] args) {
		
		//Create a linked list 
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		//Converting linkedlist to array list 
		List<Integer> l2 = new ArrayList<>(l1);
		System.out.println(l2);
		//Checking wether the class is linked list or array list by getting the class name
		System.out.println(l2.getClass());
	}

}
