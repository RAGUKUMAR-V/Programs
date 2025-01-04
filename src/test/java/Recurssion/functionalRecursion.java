package Recurssion;

public class functionalRecursion {
	
	static int sum(int number){
		
		if(number==0) {
			return 0;
		}
			
		return number+sum(number-1);
	}
	
	
	static int factorial(int number) {
		
		if(number==0) {
			return 1;
		}
		return number*factorial(number-1);
		
	}

	public static void main(String[] args) {
		
		System.out.println(factorial(5));
		

	}

}
