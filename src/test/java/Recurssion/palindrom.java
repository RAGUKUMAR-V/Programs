package Recurssion;

public class palindrom {

	public static boolean isPalindrom(int i, int j, String word) {
		
		if(i>=j/2)
			return true;
		if(word.charAt(i)!=word.charAt(j))
			return false;
		return isPalindrom(i+1, j-i-1, word);
		
	}
	
	public static void main(String[] args) {
		
		
		String word="111";
		int size=word.length();
		
		
		
		System.out.println(isPalindrom(0,size-1,word));

	}

}
