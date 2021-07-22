package com.ArrayList.Collections;

import java.util.ArrayList;

/*Write a Java program to print all the elements of a ArrayList using the position of the elements.*/
public class Program15 {
	
	//Main Method
	public static void main(String[] args) {
		//Implement an arraylist
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		//Printing the arraylist using index by getting the size of an arraylist
		int num = a1.size();
		for(int i=0;i<num;i++) {
			System.out.println(a1.get(i));
		}
	}

}
