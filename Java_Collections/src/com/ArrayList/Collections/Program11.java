package com.ArrayList.Collections;

import java.util.ArrayList;
import java.util.Collections;


/*Write a Java program of swap two elements in an array list.*/
public class Program11 {
	//main method 
	public static void main(String[] args) {
		//Create an arraylist a1
		ArrayList<Integer> a1= new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		//Swapping using Collections
		Collections.swap(a1, 2, 4);
		System.out.println(a1);
	}

}
