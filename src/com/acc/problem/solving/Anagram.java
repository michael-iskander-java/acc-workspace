package com.acc.problem.solving;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
	
	public static boolean isAnagramCaseSensitive(String anagram1, String anagram2) {
		
		if(anagram1.length() != anagram2.length()) {
			return false;
		}
		Map<Character, Integer> testMap = new HashMap<>();
		
		for (Character a : anagram1.toCharArray()) {
			testMap.put(a, testMap.getOrDefault(a, 0)+1);
		}
		System.out.println("test map: "+ testMap);
		
		for (Character a : anagram2.toCharArray()) {
			testMap.put(a, testMap.getOrDefault(a, 0)-1);
		}
		
		System.out.println("test map: "+ testMap);
		for (Map.Entry<Character, Integer> entry : testMap.entrySet()) {
			if(entry.getValue() != 0) {
				return false;
			}
			
		}
		
		return true;
	}
	
	public static boolean isAnagramCharacterOnly(String anagram1, String anagram2) {
		
		if(anagram1.length() != anagram2.length()) {
			return false;
		}
		int[] testArray = new int[26];
		
		
		
		for (Character a : anagram1.toCharArray()) {
			testArray[a - 'a']++;
		}
		
		for (Character a : anagram2.toCharArray()) {
			testArray[a - 'a']--;
		}
		
		for (int entry : testArray) {
			if(entry != 0) {
				return false;
			}
			
		}
		
		return true;
	}
	
	
	public static boolean isAnagramCaseInsensitive(String anagram1, String anagram2) {
		
		if(anagram1.length() != anagram2.length()) {
			return false;
		}
		Map<Character, Integer> testMap = new HashMap<>();
		String lowerCase1 = anagram1.toLowerCase();
		String lowerCase2 = anagram2.toLowerCase();
		
		for (Character a : lowerCase1.toCharArray()) {
			testMap.put(a, testMap.getOrDefault(a, 0)+1);
		}
		System.out.println("test map: "+ testMap);
		
		for (Character a : lowerCase2.toCharArray()) {
			testMap.put(a, testMap.getOrDefault(a, 0)-1);
		}
		
		System.out.println("test map: "+ testMap);
		for (Map.Entry<Character, Integer> entry : testMap.entrySet()) {
			if(entry.getValue() != 0) {
				return false;
			}
			
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println("is Anagram: "+ isAnagramCaseInsensitive("Gee23eks", "kSee32eg"));
		
	}

}
