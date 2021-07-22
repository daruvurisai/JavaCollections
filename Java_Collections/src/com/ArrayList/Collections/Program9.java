package com.ArrayList.Collections;

import java.util.ArrayList;
import java.util.List;

/*Write a Java program to extract a portion of a array list.*/

public class Program9 {
	
	//Main method
	public static void main(String[] args) {
		 // Creae a list and add some colors to the list
		  List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  System.out.println("Original list: " + list_Strings);
		  //Extracting Red , green , orange into a sublist 
		  List<String> subList = list_Strings.subList(0,3);
		  //Printing the Sublist
		  System.out.println("Sub List: "+subList);
		  
	}

}
