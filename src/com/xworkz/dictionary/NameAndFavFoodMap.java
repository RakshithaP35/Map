package com.xworkz.dictionary;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NameAndFavFoodMap {

	public static void main(String[] args) {
		Map<String,String> nameANDfood = new HashMap<String,String>();
		nameANDfood.put("Rakshitha", null);
		nameANDfood.put("Dhanya", null);
		nameANDfood.put("tejashwini", null);
		nameANDfood.put("Shantanu", null);
		

		System.out.println(nameANDfood.size());

		System.out.println("\nContains key:");
		System.out.println(nameANDfood.containsKey("Dhanya"));

		System.out.println("\nContains value:");
		System.out.println(nameANDfood.containsValue("Maggie"));

		System.out.println("\nvalue set:");
		Collection<String> values = nameANDfood.values();
		Iterator<String> itrValues = values.iterator();
		for (String str : values) {
			System.out.println(str);
		}

		System.out.println("\nKey Set: ");
		Set<String> keySet = nameANDfood.keySet();
		Iterator<String> itr = keySet.iterator();
		for (String string : keySet) {
			System.out.println(string);
		}
		System.out.println("\nKey and value:");
		while (itr.hasNext()) {
			String string = itr.next();

			String value = nameANDfood.get(string);
			System.out.println(string + " - " + value);
		}
		
	}

}
