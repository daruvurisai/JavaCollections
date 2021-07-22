package com.ArrayList.Collections;

import java.util.ArrayList;
import java.util.List;

/*Write a Java program to remove the third element from a array list.*/
public class Program5 {
	
	public static void main(String[] args) {
		
		//Creating a new Array List 
			List<String> arraylist  = new ArrayList<String>();
		
		//Adding Fruit Elements to arraylist
			arraylist.add("Apple");
			arraylist.add("Banana");
			arraylist.add(1,"Kiwi");
		//Removing Fruit Kiwi
			arraylist.remove(1);
		//Printing values of arraylist
			System.out.println(arraylist);

		}

}
