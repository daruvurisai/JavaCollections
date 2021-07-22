package com.ArrayList.Collections;

import java.util.ArrayList;

/*Write a Java program to clone an array list to another array list.*/
public class Program13 {
	//Main method
	public static void main(String[] args) {
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        //Cloning to new arraylist c2 whoch just copies the references of elements into new arraylist
        //Also Called as Shallow Copy
        ArrayList<String> c2 = (ArrayList<String>)c1.clone();
        System.out.println("New Array List is " +c2.hashCode());
        System.out.println("Old Array List is " +c1.hashCode());
	}

}
