package com.exercise;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Exercise4 {
	private final Map<String, Integer> map = new HashMap<String, Integer>();
	String stringNumber = "";

	public Exercise4() {
		map.put(" One ", 1);
		map.put(" Two ", 2);
		map.put(" Three ", 3);
		map.put(" Four ", 4);
		map.put("Five", 5);
		map.put("Six", 6);
		map.put("Seven", 7);
		map.put("eight", 8);
		map.put("Nine",9);
		map.put("Ten", 10);
		map.put("Eleven", 11);
		map.put("twelve", 12);
		map.put("thirteen", 13);
		map.put("fifteen", 15);
		map.put("twenty", 20);
		map.put("thirty", 30);
		map.put("fifty", 50);

	}

	public String getNumber(int big) {
		
		if (big  > 1000000000){
			for (Map.Entry<String,Integer> map1 : map.entrySet()){
				if(big/1000000000 == map1.getValue()){
					stringNumber += map1.getKey()+" bilion ";
					break;
				}
			}
			big = big % 1000000000;
			getNumber(big);
		} if (big  > 1000000){
			for (Map.Entry<String,Integer> map1 : map.entrySet()){
				if(big/1000000 == map1.getValue()){
					stringNumber += map1.getKey()+" milion ";
					break;
				}
			}
			big = big % 1000000;
			getNumber(big);
			
		} if (big > 1000){
			for (Map.Entry<String,Integer> map1 : map.entrySet()){
				if(big/1000 == map1.getValue()){
					stringNumber += map1.getKey()+" thousand ";
					break;
				}
			}
			big = big % 1000;
			getNumber(big);
			
		} if (big > 100 ){
			
			for (Map.Entry<String,Integer> map1 : map.entrySet()){
				if(big/100 == map1.getValue()){
					stringNumber += map1.getKey()+" hundred ";
					break;
				}
			}
			big = big % 100;
			getNumber(big);
			
			
		} if (big > 10){
			for (Map.Entry<String,Integer> map1 : map.entrySet()){
				if(big/10 == map1.getValue()){
					stringNumber += map1.getKey()+"ty ";
					break;
				}
			}
			big = big % 10;
			getNumber(big);
			
		} else{
			for (Map.Entry<String,Integer> map1 : map.entrySet()){
				if(big/10 == map1.getValue()){
					stringNumber += map1.getKey();
					break;
				}
			}
			big = big % 10;
			getNumber(big);
			
		}
		System.out.println(stringNumber);
		return stringNumber;
	}

	

}
