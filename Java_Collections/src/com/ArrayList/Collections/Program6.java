package com.ArrayList.Collections;

import java.util.ArrayList;
import java.util.List;

public class Program6 {
	/*Write a Java program to search an element in a array list.*/
	
public static void main(String[] args) {
		
		//Creating a new Array List 
			List<String> arraylist  = new ArrayList<String>();
			List<String> arraylist2  = new ArrayList<String>();
		//Adding Fruit Elements to arraylist
			arraylist.add("Apple");
			arraylist.add("Banana");
			arraylist2.add("Kiwi");
		//Searching element banana
			if(arraylist.contains("Banana")) {
				System.out.println("Contains Element");
			}
			else {
				System.out.println("No element found");
			}
		//Removing Kiwi
			arraylist.remove(1);
		//Checking wether list contains every element
			if(arraylist2.containsAll(arraylist2)) {
				System.out.println("Contains Every Element");
			}
			else {
				System.out.println("No Element Found");
			}
			

		}
	


}
