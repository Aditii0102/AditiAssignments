package java8.Day4;

import java.util.HashMap;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap dataMap = new HashMap();
		dataMap.put("pizza", 100);
		System.out.println(dataMap);
		dataMap.putIfAbsent("pizza", 200); // will override the data - use putIfAbsent
		System.out.println(dataMap);
	}

}
