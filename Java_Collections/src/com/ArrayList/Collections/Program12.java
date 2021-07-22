package com.ArrayList.Collections;

import java.util.ArrayList;


/*Write a Java program to join two array lists.*/
public class Program12 {
	//Main Method
	public static void main(String[] args) {
		//Create an arraylist
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		//Create a 2nd arraylist
		ArrayList<Integer> a2 = new ArrayList<>();
		a2.add(5);
		a2.add(6);
		a2.add(7);
		//Adding 2 arrayslists with new arraylist a3
		ArrayList<Integer> a3 = new ArrayList<>();
		a3.addAll(a1);
		a3.addAll(a2);
		System.out.println(a3);
		
	}
}
