package InterviewPreparationPrograms;

public class LongestPalindromicSubString {
	
	public static String solve(String s) {
		
		if(s==null || s.length()<1) {
			return "";
		}
		
		int start=0, end =0;
		
		for(int i=0;i<s.length();i++) {
			int l1=expandFromCenter(s, i, i);
			int l2=expandFromCenter(s, i, i+1);
			int len=Math.max(l1, l2);
			
			if(len>(end-start)) {
				 start = i - (len - 1) / 2;
	                end = i + len / 2;
			}
		}
		return s.substring(start, end + 1);
		
	}
	
	public static int expandFromCenter(String s, int left, int right) {
		
		while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
			left--;
			right++;
		}
		return right-left-1;
	}

	public static void main(String[] args) {
	
		String given="bababcd";
		String ans=solve(given);
		System.out.println(ans);

	}

}
