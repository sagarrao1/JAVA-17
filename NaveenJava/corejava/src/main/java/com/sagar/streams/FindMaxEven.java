package com.sagar.streams;

import java.util.List;
import java.util.Optional;

public class FindMaxEven {

	public static int findMaxEvenNumber(List<Integer> nums) {
		
		if(nums == null) {
			return 0;
		}
		
		 Optional<Integer> maxEven = nums.stream()
			.filter(n -> n%2==0)
//			.reduce(0, (c,e) -> Integer.compare(c, e) <= 0 ? c : e);
//			.max((c,e) -> Integer.compare(c, e));
			.max(Integer::compare);

		return maxEven.orElse(0);
	}

}
