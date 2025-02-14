package SilidingWindowAndTwoPointers;

import java.util.*;

public class Maxsubstringwithoutdup {
	
	
	public static int solve(String given) {
		
		int left =0, right =0;
		int n=given.length();
		int len=0;
		Map<Character, Integer>map=new HashMap<>();
		
		while(right<n) {
			
			if(map.containsKey(given.charAt(right))) {				
				left=Math.max(map.get(given.charAt(right))+1, left);
			System.out.println(left);
			}			
			map.put(given.charAt(right), right);			
			len=Math.max(len,right-left+1);
			right++;		
		}
		
		return len;
	}

	public static void main(String[] args) {
		
		String given="123414256";
		
		int sublen=solve(given);
		System.out.println(sublen);
		

	}

}
