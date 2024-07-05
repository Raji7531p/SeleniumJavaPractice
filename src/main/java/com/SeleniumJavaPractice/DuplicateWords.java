package com.SeleniumJavaPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class DuplicateWords {
	//Find out count(occurrences) of duplicate words in a string along with count
	
		//Data Structures: List, set, Queue, Stacks, Arrays, Strings,Map(Key and Value)
	
    public void findDuplicateWords(String str) {
    	
    	//1st step: Split the string into multiple words
		
    	//2nd: we need to iterate the array of words and then form a logic to identify if any of the words are duplicate 
    	//3rd : If any of them is duplicate store into a data structures along with repeated count.
    	
    	
        String[] listStrings = str.split(" ");  //1st
        HashMap<String, Integer> allWords = new HashMap<>(); // Initialize the map outside the loop

        
      //2nd
        
        for (String word : listStrings) {
            if (allWords.containsKey(word)) {
               
            	//3rd logic to store duplicates
            	
            	allWords.put(word, allWords.get(word) + 1);
            } else {
                allWords.put(word, 1);
            }
        }

        this.printDuplicateWords(allWords);
    }
    
    
  //(Hashmap doesn't support any kind of iteration and it doesn't support the iterator method)
  	//HashMap is storage a all dif  types of entries
    
    

    public void printDuplicateWords(HashMap<String, Integer> allWords) {
    	
    	//storage of all different entries(each entry in Java, Key-> value pairs)
        Set<Map.Entry<String, Integer>> setEntries = allWords.entrySet();
        Iterator<Map.Entry<String, Integer>> itrEntries = setEntries.iterator();

        while (itrEntries.hasNext()) {
            Map.Entry<String, Integer> entry = itrEntries.next();
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + "--->" + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String str = "Python Java are great programming languages. Java is a very old programming language. Python has evolved over last few years and Python language will overtake Java.";
        DuplicateWords obj = new DuplicateWords();
        obj.findDuplicateWords(str);
    }
}

