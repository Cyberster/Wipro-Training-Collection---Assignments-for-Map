/*
Write a program that will have a Properties class which is capable of storing some 
States of India and their Capital. Use an Iterator to list all the elements of the Properties.
 */

package com.w3epic.wiprotraining.assignment3;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Assignment3 {

	public static void main(String[] args) {
		Properties properties = new Properties();
		
		properties.setProperty("West Bengal", "Kolkata");
		properties.setProperty("Rajasthan", "Jodhpur");
		properties.setProperty("Bihar", "Patna");

		Set<Entry<Object, Object>> set = properties.entrySet();
		Iterator<Entry<Object, Object>> it = set.iterator();
		
		while (it.hasNext()) {
			Entry<Object, Object> me = it.next();
			System.out.println(me);
		}
	}

}
