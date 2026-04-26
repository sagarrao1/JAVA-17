package com.sagar.collections.CollectionGenerics;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String,String> phoneBook= new HashMap<String, String>();
		phoneBook.put("Sagar", "9989027590");
		phoneBook.put("Ravi ", "9989028888");
		phoneBook.put("Lucky", "9989029999");
		phoneBook.put("Sanju", "9989022222");
		phoneBook.put("wanog", "9989021111");
		
		
		/*Set<String> keyset= phoneBook.keySet();
		
		for (String s : keyset) {
			System.out.println(phoneBook.get(s));
		}*/
		
			
		Set<Entry<String, String>> values=phoneBook.entrySet();
		
		for (Entry<String, String> e : values) {
			System.out.println(e.getKey()+" : "+e.getValue());
//			e.setValue("III");
		}
	}

}
