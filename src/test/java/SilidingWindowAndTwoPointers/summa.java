package SilidingWindowAndTwoPointers;

import java.util.HashSet;
import java.util.Set;

public class summa {

	public static void main(String[] args) {
		
		
		String s="raggu";
		
	char[] ch=	s.toCharArray();
	Set<Character>set=new HashSet<>();
	for(int i=0;i<s.length();i++) {
		
		set.add(ch[i]);
	}
		
		System.out.println(set);
	}

}
