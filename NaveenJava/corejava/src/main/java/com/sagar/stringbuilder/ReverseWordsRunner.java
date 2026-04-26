package com.sagar.stringbuilder;

public class ReverseWordsRunner {

	public static void main(String[] args) {
		String str = "Hello World";		
		ReverseWords r = new ReverseWords();
		String reverseWords = r.reverseWords(str);
		
		System.out.println(reverseWords);

	}

}
