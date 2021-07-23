package com.xworkz.dictionary;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountryMap {

	public static void main(String[] args) {
		Map<String, Integer> countryAndPopulation = new HashMap<String, Integer>();
		countryAndPopulation.put("India", 1354051854);
		countryAndPopulation.put("United States", 326766748);
		countryAndPopulation.put("Indonesia", 266794980);
		countryAndPopulation.put("Brazil", 210867954);
		countryAndPopulation.put("Bangladesh", 166368149);
		countryAndPopulation.put("Russia", 143964709);
		countryAndPopulation.put("Mexico", 130759074);
		countryAndPopulation.put("Germany", 82293457);

		System.out.println(countryAndPopulation.size());

		System.out.println("\nContains key:");
		System.out.println(countryAndPopulation.containsKey("India"));

		System.out.println("\nContains value:");
		System.out.println(countryAndPopulation.containsValue(130759074));

		System.out.println("\nvalue set:");
		Collection<Integer> values = countryAndPopulation.values();
		Iterator<Integer> itrValues = values.iterator();
		for (Integer integer : values) {
			System.out.println(integer);
		}

		System.out.println("\nKey Set: ");
		Set<String> keySet = countryAndPopulation.keySet();
		Iterator<String> itr = keySet.iterator();
		for (String string : keySet) {
			System.out.println(string);
		}
		System.out.println("\nKey and value:");
		while (itr.hasNext()) {
			String string = itr.next();

			Integer value = countryAndPopulation.get(string);
			System.out.println(string + " - " + value);
		}

	}

}
