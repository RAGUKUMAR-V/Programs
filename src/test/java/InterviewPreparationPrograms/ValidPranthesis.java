package InterviewPreparationPrograms;

import java.util.Stack;

public class ValidPranthesis {

	public static boolean solve(String s) {
		
		Stack<Character>stack=new Stack<>();
		
		for(char c:s.toCharArray()) {
			
			if(c=='(' || c=='[' || c=='{') {
				stack.push(c);
			}else {
				if(stack.isEmpty()) {
					return false;
				}
				
				char top=stack.pop();
				
				if((c==')' && top!='(') || (c==']' && top!='[') || (c=='}' && top!='{') ) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		
		String s="([[)";
		
		boolean ans=solve(s);
		System.out.println(ans);

	}

}
