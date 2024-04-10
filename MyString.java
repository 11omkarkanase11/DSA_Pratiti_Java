package com.om;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyString {
	
	public static void main(String[] args) {
		System.out.println("Input String :");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
//		System.out.println(upperCase(str));
//		System.out.println(lowerCase(str));
//		System.out.println("Enter index :");
//		int index = sc.nextInt();
//		System.out.println(charAta(str, index));
//		str.split(str, 4);
//		System.out.println(str);
//		MyString ms = new MyString();
//		ms.split(str);
		System.out.println("Find");
		String find = sc.next();
		
		patternMatcher(str, find);
	}
	
	public static String upperCase(String str) {
		
		 StringBuilder modifiedStr = new StringBuilder();
		
		for(int i=0; i<str.length(); i++) {
			int asciiValue = (int) str.charAt(i);
			if(asciiValue >96) {
			asciiValue = asciiValue -32;
			}
			else {	
			}
			modifiedStr.append((char) asciiValue);
		}
		 String result = modifiedStr.toString();
		 
		return result;
		
	}
	public static String lowerCase(String str) {
		
		 StringBuilder modifiedStr = new StringBuilder();
		
		for(int i=0; i<str.length(); i++) {
			int asciiValue = (int) str.charAt(i);
			if(asciiValue <96) {
			asciiValue = asciiValue +32;
			}
			else {	
			}
			modifiedStr.append((char) asciiValue);
		}
		 String result = modifiedStr.toString();
		return result;
	}
	
	public static char charAta(String str, int index) {
		
		char[] charArray = str.toCharArray();
		
		for(int i =0;i<charArray.length; i++) {
			if(index == i) {
				return charArray[i];
			}
		}
		
		return 0;
		
	}
	public void split(String str) {
		 String[] parts = str.split(",");

	        // Print each part of the resulting array
	        for (String part : parts) {
	            System.out.println(part);
	        }
	
	}
	public static void patternMatcher(String str, String find) {
		Pattern pattern = Pattern.compile(find);
		
		Matcher matcher = pattern.matcher(str);
		
		boolean check = matcher.equals(matcher);
		
		while (matcher.find()) {
           
            int start = matcher.start();
            int end = matcher.end();
            
            System.out.println("Match found at indices " + start + "-" + (end - 1) + ": " + text.substring(start, end));
        }
	}
	
	
	
	
}
