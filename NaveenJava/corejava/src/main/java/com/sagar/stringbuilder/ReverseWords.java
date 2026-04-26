package com.sagar.stringbuilder;

public class ReverseWords {

	public String reverseWords(String sentence) {
		if (sentence==null) {
			return "INVALID";
		}
		if (sentence=="") {
			return "";
		}		
		
		StringBuilder reversedSentence = new StringBuilder();

		for (String word :sentence.split(" "))  {
			StringBuilder reversed = new StringBuilder(word).reverse();			
			reversedSentence.append(reversed).append(" ");
		}
		
		return reversedSentence.toString().trim();
	}
	
	
	
	
}
