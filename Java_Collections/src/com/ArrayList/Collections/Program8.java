package com.ArrayList.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Write a Java program to copy one array list into another. and
 * --> also Shuffle list 1
 * -->Reverse a list 3 */
public class Program8 {
	
	//Main Method
	public static void main(String[] args) {
		//List 1 
		List<Integer> intlist = new ArrayList<>();
		intlist.add(1);
		intlist.add(2);
		intlist.add(3);
		//List 2
		List<Integer> Stringlist = new ArrayList<>();
		Stringlist.add(9);
		Stringlist.add(10);
		Stringlist.add(11);
		//Copying From List 2 to list 1
		//Collections.copy(destination,Source)
		Collections.copy(intlist,Stringlist);
		System.out.println("IntList : "+intlist);
		//Shuffling  Lsit 2
		Collections.shuffle(Stringlist);
		System.out.println("StringList : "+Stringlist);
		//Defining List 3 
		List<Integer> list3 = new ArrayList<>();
		list3.add(1);
		list3.add(2);
		list3.add(3);
		list3.add(4);
		//Reversing the list 
		Collections.reverse(list3);
		//Printing the list3 
		System.out.println(list3);
	}
	

}
