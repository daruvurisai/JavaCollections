package com.LinkedList.Collections;

import java.util.LinkedList;

/*Write a Java program to insert the specified element at the front of a linked list.*/
/*Write a Java program to insert the specified element at the end of a linked list.*/
/*Write a Java program to insert some elements at the specified position into a linked list.*/
public class Program7 {
	//Main Method
	public static void main(String[] args) {
		 // create an empty linked list
	     LinkedList<String> l_list = new LinkedList<String>();
	   // use add() method to add values in the linked list
	          l_list.add("Red");
	          l_list.add("Green");
	          l_list.add("Black");
	     System.out.println("Original linked list:" + l_list);    
	  // Add an element to front of LinkedList
	     l_list.offerFirst("Pink");
	     System.out.println("Final linked list:" + l_list);  
	   //Add an element toi last of linkedlist
	     l_list.offerLast("Voilet");
	    System.out.println("Final Linked List is "+l_list);
	    //Add an element "Blue" at Specified Position 2 in the linked list
	    l_list.add(2, "Blue");
	    System.out.println(l_list);
	    /*Write a Java program to get the first and last occurrence of the specified elements in a linked list.*/
	    Object firstname = l_list.getFirst();
	    Object lastname = l_list.getLast();
	    System.out.println("First Element is "+firstname);
	    System.out.println("Second Element is "+lastname);
	}
}
