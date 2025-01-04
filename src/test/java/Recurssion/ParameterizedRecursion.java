package Recurssion;

public class ParameterizedRecursion {
	
	static int  count =0;
	
	public static void printName() {
		
		if(count==5) {
			return;
		}else {
			System.out.println("Ragu");
			count++;
			printName();
		}
				
	}
	
	public static  void printNameWithoutGlobalVariable(int i, int j) {
		
		if(i>j) {
			return;
		}else {
			System.out.println("kumar");
			printNameWithoutGlobalVariable(i+1,j);
		}
		
	}
	
	public static  void printNumberWithoutGlobalVariable(int i, int j) {
		
		if(i>j) {
			return;
		}else {
			
			printNumberWithoutGlobalVariable(i+1,j);
			System.out.println(i);
		}
		
	}
	
	

	public static void main(String[] args) {
		
		//printName();
		//printNameWithoutGlobalVariable(0,5);
		
		printNumberWithoutGlobalVariable(1,5);
		
		

	}

}
