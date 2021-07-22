package com.ArrayList.Collections;
/*Write a Java program to sort a given array list.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program7 {


	public static void main(String[] args) {
		
		//Creating a new Array List 
			List<String> arraylist  = new ArrayList<String>();
		
		//Adding Fruit Elements to arraylist
			arraylist.add("Apple");
			arraylist.add("Banana");
			arraylist.add(1,"Kiwi");
		//Sorting the arraylist
			Collections.sort(arraylist);
		//Printing the sorted arraylist
			System.out.println(arraylist);
	}
}
