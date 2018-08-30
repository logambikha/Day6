package com.loga.day6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class FruitsTest {

	
	@Test
	void testFruits() {
		HashMap<String, ArrayList<String>> map= new HashMap<String,ArrayList<String>>();
		String[] favorites = new String[] {"jack","pome"};
		map.put("Abi", new ArrayList<>(Arrays.asList(favorites)));
		favorites = new String[] {"banana","kiwi","orange"};
		map.put("Logi", new ArrayList<>(Arrays.asList(favorites)));
		favorites = new String[] {"mango","guava"};
		map.put("Sakthi", new ArrayList<>(Arrays.asList(favorites)));
		favorites = new String[] {"pome","papaya","apple"};
		map.put("Navi", new ArrayList<>(Arrays.asList(favorites)));
		
		assertEquals(4, map.size());
		for (Map.Entry<String,ArrayList<String>> entry : map.entrySet()) 
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
		
	}
}
