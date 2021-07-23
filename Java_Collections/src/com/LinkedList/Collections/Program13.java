package com.LinkedList.Collections;

import java.util.LinkedList;

public class Program13 {
	/*Write a Java program to compare two linked lists.*/
	public static void main(String[] args) {
		
		LinkedList<String> c1= new LinkedList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        LinkedList<String> c2= new LinkedList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Orange");
        
        //Comparing 2 c1 and c2
        LinkedList<String> c3 = new LinkedList<String>();
        for (String e : c1) {
        	c3.add(c2.contains(e)?"Yes":"No");
        	
        }
        System.out.println(c3);
        
        //Check wetehr c2 is empty or not after removing c2 elements using remove all method
        
        c2.removeAll(c2);
        System.out.println("C2 is Empty "+c2.isEmpty());

	}

}
