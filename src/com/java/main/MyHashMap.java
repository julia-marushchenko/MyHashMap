package com.java.main;

import java.util.HashMap;
import java.util.Map.Entry;

public class MyHashMap {
	
	public static void main(String [] str) {
		
		//Creating collection HashMap
		HashMap<Double, String> myHashMap = new HashMap<>();
		
		//Checking myHashMap size
		int size = myHashMap.size();
		
		//Printing size of myHashMapto console
		System.out.println("Size of myHashMap is " + size);

		//Adding elements to myHashMap
		myHashMap.put(3.0, "Table");
		myHashMap.put(8.7, "Chair");
		myHashMap.put(1.9, "Bed");
		myHashMap.put(3.7, "Wardrobe");
		myHashMap.put(2.0, "Tea table");
		myHashMap.put(5.6, "Vitrina");
		myHashMap.put(7.1, "Armchair");
		myHashMap.put(9.8, "Sofa");
		myHashMap.put(5.2, "Sofa");
		
		size = myHashMap.size();
		//Printing size of myHashMapto console
		System.out.println("Size of myHashMap is " + size);

		//Printing myHashMap to console
		System.out.println(myHashMap.toString());
		
		//Removing element with value Sofa by key value 9.8
		myHashMap.remove(9.8);
		
		//Printing myHashMap to console
		System.out.println(myHashMap.toString());
		
		//Trying to add element with the same key 3.7
		myHashMap.put(3.7, "Chair"); // Wardrobe was replaced with a chair
		
		//Checking myHashMap by printing to console
		System.out.println(myHashMap.toString());
		
		size = myHashMap.size();
		//Printing size of myHashMapto console
		System.out.println("Size of myHashMap is " + size);
		
		//Checking if myHashMap has element Vitrina
		System.out.println("Is there an element with name Vitrina " + myHashMap.containsValue("Vitrina"));
		
		//Checking if myHashMap has element Vitrina
		System.out.println("Is there an element with name Table " + myHashMap.containsValue("Table"));
		
		//Checking if myHashMap has element with key 3.7
		System.out.println("Is there an element with key = 3.7 " + myHashMap.containsKey(3.7));
		
		//Checking if myHashMap has element with key 3.7
		System.out.println("Is there an element with key = 11.7 " + myHashMap.containsKey(11.7));
		
		//Printing myHashMap nicely with foreach cycle
		for (Entry<Double, String> entry : myHashMap.entrySet()) {
			System.out.println("Element with key = " + entry.getKey() + " has value = "+ entry.getValue());
			
		}
	}

}
