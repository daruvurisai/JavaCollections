package com.ArrayList.Collections;

import java.util.ArrayList;
import java.util.List;

public class Program3 {
	
	/*Write a Java program to 
	 * retrieve an element (at a specified index) from a given array list.
	 */
	
	//Main Method
		public static void main(String[] args) {
			
		//Creating a new Array List 
			List<String> arraylist  = new ArrayList<String>();
		
		//Adding Fruit Elements to arraylist
			arraylist.add("Apple");
			arraylist.add("Banana");
			arraylist.add(1,"Kiwi");
		//Retrive an element at 2nd Position
			String elementAt1stPosition = arraylist.get(1);
		//Printing the value
			System.out.println(elementAt1stPosition);

		}
}
