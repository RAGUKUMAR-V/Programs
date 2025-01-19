package SilidingWindowAndTwoPointers;

import java.util.*;

public class MaxSubStringWithoutDuplicateCharacter {

	public static void subString(String s) {
		
	
		List<String>list=new ArrayList<>();
		
		Set<Character> set=new LinkedHashSet<>();
			
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
								
		}

		String latest="";		
		for(char ch:set) {
			latest+=ch;
		}
	        		
		for(int i=0;i<=latest.length();i++) {
			for(int j=i+1;j<=latest.length();j++) {
				list.add(latest.substring(i, j));
			}
		}
		int max=0;
		String substring = "";
		for(String sub:list) {
		int sublegnth=	sub.length();
		if(max<sublegnth) {
			max=sublegnth;
			substring="";
			substring+=sub;
		}
		
		}
	
		System.out.println(substring  + ":" + max);
	}
	
	
	public static void main(String[] args) {
		
		String s="takeUforward";
		subString(s);
	}

}
