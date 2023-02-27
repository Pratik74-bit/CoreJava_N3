package org.tnsif.mapdemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		//unordered
		Map<Integer,String> obj = new HashMap<>();
		obj.put(410125, "MG Road");
		obj.put(422254, "MG Road");
		System.out.println(obj);
		
		//ordered
		Map<Integer,String> obj1 = new LinkedHashMap<>();
		obj1.put(410125, "MG Road");
		obj1.put(422254, "MG Road");
		System.out.println(obj1);
		

	} 

}
