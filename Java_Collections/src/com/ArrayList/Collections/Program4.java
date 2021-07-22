package com.ArrayList.Collections;

import java.util.ArrayList;
import java.util.List;

public class Program4 {
	/* Write a Java program to update specific array element by given element*/
	//Main Method
			public static void main(String[] args) {
				
			//Creating a new Array List 
				List<String> arraylist  = new ArrayList<String>();
			
			//Adding Fruit Elements to arraylist
				arraylist.add("Apple");
				arraylist.add("Banana");
				arraylist.add(1,"Kiwi");
			//Updating Fruit banana with pineapple
				arraylist.set(2,"PineApple");
			//Printing values of arraylist
				System.out.println(arraylist);

			}
}
