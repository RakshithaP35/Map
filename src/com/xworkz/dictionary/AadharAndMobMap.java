package com.xworkz.dictionary;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AadharAndMobMap {
	public static void main(String[] args) {
		Map<Long,Long> aadharNumAndmobNum=new HashMap<Long,Long>();
		aadharNumAndmobNum.put(1234562789022L, 78298223542229L);
		aadharNumAndmobNum.put(90876543234566L, 76543218968768L);
		aadharNumAndmobNum.put(353465463423436L, 777877883375435L);
		
		System.out.println(aadharNumAndmobNum.size());

		System.out.println("\nContains key:");
		System.out.println(aadharNumAndmobNum.containsKey(908765432));

		System.out.println("\nContains value:");
		System.out.println(aadharNumAndmobNum.containsValue(777875435));

		System.out.println("\nvalue set:");
		Collection<Long> values = aadharNumAndmobNum.values();
		Iterator<Long> itrValues = values.iterator();
		for (Long str : values) {
			System.out.println(str);
		}

		System.out.println("\nKey Set: ");
		Set<Long> keySet = aadharNumAndmobNum.keySet();
		Iterator<Long> itr = keySet.iterator();
		for (Long string : keySet) {
			System.out.println(string);
		}
		System.out.println("\nKey and value:");
		while (itr.hasNext()) {
			Long string = itr.next();

			Long value = aadharNumAndmobNum.get(string);
			System.out.println(string + " - " + value);
		}
		
	}

}
