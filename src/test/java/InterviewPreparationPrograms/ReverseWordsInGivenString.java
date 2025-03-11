package InterviewPreparationPrograms;

public class ReverseWordsInGivenString {
	
	public static String solve(String s) {
		
	 	s=s.trim();
			String[] words=s.split("\\s+");
			String reverse="";
			
			for(int i=words.length-1;i>=0;i--) {
				reverse=reverse+words[i];
				if(i>0) {
					reverse=reverse+" ";
				}
			}
			
			return reverse;
	}

	public static void main(String[] args) {
	
		
		String s=" i love  you ragu  ";
		String ans=solve(s);
		System.out.println(ans);

	}

}
