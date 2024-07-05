package com.SeleniumJavaPractice;

import java.util.*;
public class to_hashmap {

	public static void main(String[] args) {
		// Java program for creating HashMap from Other Maps

				// create an instance of LinkedHashMap
				LinkedHashMap<String, String> lhm 
					= new LinkedHashMap<String, String>();

				// Add mappings using put method
				lhm.put("Apurva", "Bhatt");
				lhm.put("James", "Bond");
				lhm.put("Scarlett ", "Johansson");

				// It prints the elements in same order
				// as they were inserted
				System.out.println(lhm);

				Map<String, String> gfg = new HashMap<String, String>();

				// Using entrySet() method create a set out of the same elements 
				// contained in the hash map
				for (Map.Entry<String, String> entry : lhm.entrySet())
					gfg.put(entry.getKey(), entry.getValue());

				System.out.println(gfg);
			}
		}


