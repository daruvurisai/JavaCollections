package com.ArrayList.Collections;

import java.util.ArrayList;
import java.util.List;

public class Program2 {
	/*Write a Java program to iterate through all elements in a array list.*/
	
	//Main Method
	public static void main(String[] args) {
		
	//Creating a new Array List 
		List<String> arraylist  = new ArrayList<String>();
	
	//Adding Fruit Elements to arraylist
		arraylist.add("Apple");
		arraylist.add("Banana");
		arraylist.add(1,"Kiwi");
	
	//Iterating through for loop
		/*for (type var : array) 
		{ 
		    statements using var;
		}*/
		for(String fruit : arraylist) {
			System.out.println(fruit);
		}
	}
	

}
