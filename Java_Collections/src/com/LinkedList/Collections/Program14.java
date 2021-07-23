package com.LinkedList.Collections;

import java.util.LinkedList;

public class Program14 {
	/*Write a Java program to replace an element in a linked list.*/
	public static void main(String[] args) {
		  LinkedList<String> c1= new LinkedList<String>();
          c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          c1.add("White");
          c1.add("Pink");
          
       // Replacing 2nd element with new value
          c1.set(1, "Orange");
          System.out.println("New linked list: " + c1);
	}

}
