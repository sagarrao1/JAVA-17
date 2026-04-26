package com.sagar.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		String str = "this is testing to see given string has "
				+ "how many repeated chars. this is to test";
	
//		noOfChars(str);
		noOfWords(str);
	}

	public static void noOfChars(String str) {
		char[] charArray = str.toCharArray();

		Map<Character, Integer> chars = new HashMap<>();
		for (char c : charArray) {
			if (chars.containsKey(c)) {
				chars.put(c, chars.get(c)+1);
			} else {
				chars.put(c, 1);
			}
		}
		for (char c: chars.keySet()){
			System.out.println(c +" : "+ chars.get(c) );
		}
	}
	
	public static void noOfWords(String str) {
		Map<String, Integer> words = new HashMap<>();
		String[] strArray = str.split(" ");
		for (String s : strArray) {
			if (words.containsKey(s)) {
				words.put(s, words.get(s)+1);
			} else {
				words.put(s, 1);
			}
		}
		for (String s : words.keySet()) {
			System.out.println(s +" : "+ words.get(s));
		}
	}
	

}
