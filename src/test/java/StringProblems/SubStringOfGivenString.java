package StringProblems;

import java.util.*;

public class SubStringOfGivenString {
	
	public static Set<String> subStrings(String given) {
		
		Set<String>set=new LinkedHashSet<>();
		
		for(int left=0;left<=given.length();left++) {
			for(int right=left;right<=given.length();right++) {
				set.add(substring(given,left,right));
			}
		}
		return set;
	}
	
	public static String substring(String name,int start, int end) {
		if(start>end || end>name.length() || start<0) {
			return "";
		}
		
		StringBuilder builder=new StringBuilder();
		for(int i=start;i<end;i++) {
			builder.append(name.charAt(i));
		}
		return builder.toString();
	}

	public static void main(String[] args) {
	
		String word="ragukumar";
		Set<String>ans=subStrings(word);
		for(String answer:ans) {
			if(answer.length()==1)
			System.out.println(answer);
	
		}
		

	}

}
