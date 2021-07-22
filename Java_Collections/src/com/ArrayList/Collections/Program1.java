package com.ArrayList.Collections;

import java.util.ArrayList;
import java.util.List;

/*Write a Java program to create a new array list, 
 * add some elements (string) and print out the collection
 */

public class Program1 {
	
	//Main Method
	public static void main(String[] args) {
		
	//Creating a new Array List 
		List<String> arraylist  = new ArrayList<String>();
	
	//Adding Fruit Elements to arraylist
		arraylist.add("Apple");
		arraylist.add("Banana");
		arraylist.add(1,"Kiwi");
	
	//Printing Arryalist
		System.out.println(arraylist);
		
	}
	

}
