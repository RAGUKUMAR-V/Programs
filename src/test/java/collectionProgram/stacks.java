package collectionProgram;

import java.util.Stack;

public class stacks {

	public static void main(String[] args) {
		
		Stack<String> letters=new Stack<>();
	
		letters.push("r");
		letters.push("a");
		letters.push("g");
		letters.push("u");
		letters.push("v");
		
		while(!letters.isEmpty()) {
			System.out.println(letters.pop());
		}		
	}

}
