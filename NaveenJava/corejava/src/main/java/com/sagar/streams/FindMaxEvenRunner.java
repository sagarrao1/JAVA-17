package com.sagar.streams;

import java.util.Arrays;
import java.util.List;

public class FindMaxEvenRunner {

	public static void main(String[] args) {
		List<Integer> nums= Arrays.asList(2,3,5,6,10,4,12);
		FindMaxEven.findMaxEvenNumber(nums);
		
		System.out.println(FindMaxEven.findMaxEvenNumber(nums));
	}

}
