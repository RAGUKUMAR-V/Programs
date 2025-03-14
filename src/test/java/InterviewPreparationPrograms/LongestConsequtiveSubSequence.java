package InterviewPreparationPrograms;

import java.util.HashSet;
import java.util.Set;

public class LongestConsequtiveSubSequence {

	public static int longConSubSeq(int[] array) {
		
		Set<Integer>set=new HashSet<>();
		
		for(int c:array) {
			set.add(c);
		}
		
		int longsubSeq=1;
		
		for(int ch:set) {
			if(!set.contains(ch-1)) {
				int x=ch;
				int count=1;
				
				while(set.contains(x+1)) {
					x++;
					count++;
				}
				longsubSeq = Math.max(longsubSeq, count);
			}
		}
		return longsubSeq;
	}
	
	public static void main(String[] args) {
		int[] array= {2,8,6,4,100,1, 55};
		
		int ans=longConSubSeq(array);
		System.out.println(ans);
		
		

	}

}
