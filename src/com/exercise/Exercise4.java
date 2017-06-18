package com.exercise;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Exercise4 {
	private final Map<Integer, String> map = new HashMap<Integer, String>();
	String stringNumber = "";

	public Exercise4() {
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(8, "eight");
		map.put(9, "Nine");
		map.put(10, "Ten");
		map.put(11, "Eleven");
		map.put(12, "twelve");
		map.put(13, "thirteen");
		map.put(15, "fifteen");
		map.put(20, "twenty");
		map.put(30, "thirty");
		map.put(50, "fifty");

	}

	public String getNumber(int big) {

		if (big > 1000000000) {
			if (map.containsKey(big / 1000000000)) {
				stringNumber += map.get(big/1000000000) + " bilion ";
			}
			big = big % 1000000000;
		}
		if (big > 1000000) {
			stringNumber += resolverNumber(big/1000000) + " milion ";
			big = big % 1000000;
		}
		if(big > 1000){			
				stringNumber += resolverNumber(big/1000) + " thounsend ";
				big = big % 1000;			
		}
		if(big > 0){
			stringNumber += resolverNumber(big);
		}
		System.out.println(stringNumber);
		return stringNumber;
	}

	public String resolverNumber(int number) {
		System.out.println(number);
		String stringNumber = "";
		if(number > 100 ){
			stringNumber += map.get(number/100)+" hundred ";
			number = number % 100;
		}
		if(number > 10){
			if (map.containsKey(number)){
				return stringNumber += map.get(number);
			}else{			
				stringNumber += map.get(number/10)+"ty ";
				number = number % 10;
			}
		
		}
		if(number > 0){
			stringNumber += map.get(number)+ " ";
		}
		
		return stringNumber;
	}

	

}
