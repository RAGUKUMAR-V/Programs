package InterviewPreparationPrograms;

import java.util.*;

public class MaxSubStringLengthWithoutDup {

	public static int solve(String s) {
		
		 Set<Character> set = new HashSet<>();
	        
	        int left = 0;
	        int maxLength = 0;
	    	      
	        for (int right = 0; right < s.length(); right++) {
	         
	            while (set.contains(s.charAt(right))) {
	                set.remove(s.charAt(left));
	                left++;
	            }
	        
	            set.add(s.charAt(right));
	            
	            if (right - left + 1 > maxLength) {
	                maxLength = right - left + 1;
	            }
	        }
	        
	        return maxLength;
	}
	
	public static void main(String[] args) {
		
		String s = "abcabcbb";
		int ans=solve(s);
		System.out.println(ans);

	}

}
