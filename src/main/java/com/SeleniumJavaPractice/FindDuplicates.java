package com.SeleniumJavaPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> result = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for(int num:nums) {
			if(!set.add(num)) {
				result.add(num);
			}
		}
		return result;
		
	}

	public static void main(String[] args) {
		int[] array = {2, 3, 3, 4, 5, 4, 2, 4};
		List<Integer> duplicates = findDuplicates(array);
		System.out.println("Duplicate Elements :" + duplicates);

	}

}
