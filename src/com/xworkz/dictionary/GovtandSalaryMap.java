package com.xworkz.dictionary;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GovtandSalaryMap {

	public static void main(String[] args) {
		Map<String, Double> govtAndsalary = new HashMap<String, Double>();
		govtAndsalary.put("Banking", 600000.00);
		govtAndsalary.put("Defence services", 700000.00);
		govtAndsalary.put("Government Lecturer", 700000.00);

		System.out.println(govtAndsalary.size());

		System.out.println("\nContains key:");
		System.out.println(govtAndsalary.containsKey("Banking"));

		System.out.println("\nContains value:");
		System.out.println(govtAndsalary.containsValue(45));

		System.out.println("\nvalue set:");
		Collection<Double> values = govtAndsalary.values();
		Iterator<Double> itrValues = values.iterator();
		for (Double str : values) {
			System.out.println(str);
		}

		System.out.println("\nKey Set: ");
		Set<String> keySet = govtAndsalary.keySet();
		Iterator<String> itr = keySet.iterator();
		for (String string : keySet) {
			System.out.println(string);
		}
		System.out.println("\nKey and value:");
		while (itr.hasNext()) {
			String string = itr.next();

			Double value = govtAndsalary.get(string);
			System.out.println(string + " - " + value);
		}

	}

}
