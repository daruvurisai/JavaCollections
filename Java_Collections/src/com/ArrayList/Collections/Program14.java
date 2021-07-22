package com.ArrayList.Collections;

import java.util.ArrayList;

/*Write a Java program to empty an array list.
 * -->Also Checking wether Arraylist is emoty or not
 * -->Also Trim to array size by using   a1.trimToSize();
 * -->Also Increase the size of arraylist
 * */
public class Program14 {
	//Main Method
	public static void main(String[] args) {
		//Add an arrayList
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		//removing array list
		
		a1.removeAll(a1);
		System.out.println("List is Empty" +a1);
		System.out.println("Is ArrayList is Empty? "+a1.isEmpty());
		//Trimming to Size
		a1.trimToSize();
		System.out.println(a1);
		//Increasing the capacityu
		a1.ensureCapacity(10);
		System.out.println(a1);
	}
}
