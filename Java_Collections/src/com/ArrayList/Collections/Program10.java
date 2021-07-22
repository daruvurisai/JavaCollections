package com.ArrayList.Collections;

import java.util.ArrayList;
import java.util.List;

/*Write a Java program to compare two array lists.*/

public class Program10 {
	//Main Method
	public static void main(String[] args) {
		//Declaring arraylist
		List<String> c1 = new ArrayList<>();
		c1.add("Apple");
		c1.add("Banana");
		c1.add("Kiwi");
		//Declaring 2nd array
		List<String> c2 = new ArrayList<>();
		c2.add("Apple");
		c2.add("Kiwi");
		//Storing the comparision output in Arraylist
		
		ArrayList<String> c3 = new ArrayList<String>();
		for(String e :c1) {
			c3.add(c2.contains(e)?"Yes":"No");
		
		}
		System.out.println(c3);
	}
}
